package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.Institute;

public class JsonToArrayActivity extends AppCompatActivity {
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
        String json = "[{\"description\":\"应用电子技术教育、计算机科学与技术、教育技术学、电气工程及其自动化、电子信息工程\",\"name\":\"信息工程学院\"},{\"description\":\"物理学、机电技术教育、科学教育、工业设计、地理科学、汽车服务工程、应用物理学\",\"name\":\"物理科学与技术学院\"},{\"description\":\"美术学、视觉传达设计、环境设计、服装与服饰设计、书法学\",\"name\":\"美术与设计学院\"}]";
        Gson gson = new Gson();
        Institute[] institutes = gson.fromJson(json, Institute[].class);
        for (Institute institute : institutes) {
            textView.append(institute.toString());
        }
    }
}
