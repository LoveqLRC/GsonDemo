package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import loveq.rc.gsondemo.R;

public class MapToJsonActivity extends AppCompatActivity {
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
        HashMap<String, List<String>> school = new HashMap<>();
        school.put("信息工程学院", Arrays.asList("应用电子技术教育", "计算机科学与技术", "教育技术学"));
        school.put("物理科学与技术学院", Arrays.asList("物理学", "机电技术教育", "科学教育"));
        school.put("美术与设计学院", Arrays.asList("美术学", "视觉传达设计", "环境设计"));
        Gson gson=new Gson();
        String json = gson.toJson(school);
        textView.setText(json);
        Log.d("MapToJsonActivity", json);
    }
}
