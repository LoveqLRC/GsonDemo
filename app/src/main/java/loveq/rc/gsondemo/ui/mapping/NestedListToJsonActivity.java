package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.Institute;
import loveq.rc.gsondemo.bean.School;

public class NestedListToJsonActivity extends AppCompatActivity {
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
        List<Institute> instituteList = new ArrayList<>();
        instituteList.add(new Institute("信息工程学院", "应用电子技术教育、计算机科学与技术、教育技术学、电气工程及其自动化、电子信息工程"));
        instituteList.add(new Institute("物理科学与技术学院", "物理学、机电技术教育、科学教育、工业设计、地理科学、汽车服务工程、应用物理学"));
        instituteList.add(new Institute("美术与设计学院", "美术学、视觉传达设计、环境设计、服装与服饰设计、书法学"));
        School school = new School("湛江师范学院", instituteList);
        Gson gson = new Gson();
        String json = gson.toJson(school);
        textView.setText(json);
    }
}
