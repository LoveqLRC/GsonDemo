package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.User;

public class JsonToObjActivity extends AppCompatActivity {
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
        String json = "{\"age\":18,\"name\":\"rc\",\"password\":\"123\"}";
//        如果不想显示转义字符，下面的json是另外一种方式
//        String json = "{'age':18,'name':'rc','password':'123'}";
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        textView.setText(user.toString());
    }
}
