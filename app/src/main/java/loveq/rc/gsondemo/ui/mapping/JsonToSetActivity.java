package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Iterator;

import loveq.rc.gsondemo.R;

public class JsonToSetActivity extends AppCompatActivity {
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
        String json = "[\"信息工程学院\",\"物理科学与技术学院\",\"美术与设计学院\"]";
        Gson gson = new Gson();
        HashSet<String> set = gson.fromJson(json, new TypeToken<HashSet<String>>() {
        }.getType());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            textView.append(iterator.next()+"\n");
        }
    }
}
