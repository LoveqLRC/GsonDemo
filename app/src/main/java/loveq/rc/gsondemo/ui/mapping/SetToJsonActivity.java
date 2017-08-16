package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.HashSet;

import loveq.rc.gsondemo.R;

public class SetToJsonActivity extends AppCompatActivity {
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
        HashSet<String> institutes = new HashSet<>();
        institutes.add("信息工程学院");
        institutes.add("物理科学与技术学院");
        institutes.add("美术与设计学院");
        institutes.add("信息工程学院");//不会再次添加进来
        Gson gson = new Gson();
        String json = gson.toJson(institutes);
        textView.setText(json);
        Log.d("SetToJsonActivity", json);
    }
}
