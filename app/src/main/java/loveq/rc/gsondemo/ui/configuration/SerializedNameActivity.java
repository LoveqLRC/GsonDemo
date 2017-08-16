package loveq.rc.gsondemo.ui.configuration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.Developer;

public class SerializedNameActivity extends AppCompatActivity {
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
        String json = "{\"age\":18,\"username\":\"rc\",\"isDeveloper\":\"true\"}";
        Gson gson = new Gson();
        //注意gson中并没有username这个成员变量
        //可以通过 @SerializedName("username")注解实现
        Developer developer = gson.fromJson(json, Developer.class);

        textView.setText(developer.toString());

        String newJson = "{\"age\":18,\"name\":\"rc\",\"isDeveloper\":\"true\"}";

        textView.append("\n");
        Developer newDeveloper = gson.fromJson(newJson, Developer.class);
        //可以看到，如果通过 @SerializedName注解之后，原来的将会失效，值会是默认值
        textView.append(newDeveloper.toString());
    }
}
