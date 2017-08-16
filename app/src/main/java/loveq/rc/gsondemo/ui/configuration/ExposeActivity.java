package loveq.rc.gsondemo.ui.configuration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.Fruit;

public class ExposeActivity extends AppCompatActivity {
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        btn = (Button) findViewById(R.id.btn);
        textView = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomeWork();
            }
        });
    }

    private void doSomeWork() {
//        {"color":"red","name":"apple","price":"16"}

        Fruit fruit = new Fruit("apple", "red", "16");
        //注意这里的gson创建方式
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        //因为fruit默认@Expose 的serialize 和deserialize为true
        //平时如果不写，没什么影响，如果使用了上面的方式创建gson对象，那么必须给每个成员变量标注@Expose
        String json = gson.toJson(fruit);
        //因为name设置了 serialize = false 所以name没有序列化出来
        textView.setText(json);
        String newjson = "{\"color\":\"red\", \"name\":\"apple\", \"price\":\"16\"}";
        Fruit newFruit = gson.fromJson(newjson, Fruit.class);
        textView.append("\n");

        //因为price 设置了deserialize = false，所以price没有反序列化出来，所以是默认值(null)
        textView.append(newFruit.toString());

    }
}
