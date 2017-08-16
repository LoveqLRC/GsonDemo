package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.User;

public class NullValuesActivity extends AppCompatActivity {
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
        User user = new User("rc", null, 18);
        Gson gson = new Gson();
        String json = gson.toJson(user);//json = ??
        textView.setText(json);
        //gson忽略null值
        Log.d("NullValuesActivity", json);

        //这里只给了name的值
        String newJson = "{\"name\":\"rc\"}";
        User userFromJson = gson.fromJson(newJson, User.class);
        //如果json中没给出，那么将会是默认值(0 或 false etc)
        Log.d("NullValuesActivity", "userFromJson:" + userFromJson);
    }
}
