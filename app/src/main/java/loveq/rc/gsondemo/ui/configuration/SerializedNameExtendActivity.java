package loveq.rc.gsondemo.ui.configuration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.Developer;

public class SerializedNameExtendActivity extends AppCompatActivity {
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
        String json = "{\"userage\":18,\"username\":\"rc\",\"isDeveloper\":\"true\"}";
        Gson gson = new Gson();
        Developer developer = gson.fromJson(json, Developer.class);
        textView.setText(developer.toString());

        //将userage改为myage
        String secondJson = "{\"myage\":18,\"username\":\"rc\",\"isDeveloper\":\"true\"}";

        Developer second = gson.fromJson(secondJson, Developer.class);
        textView.append("\n");
        textView.append(second.toString());

        //userage和myage共存
        String thirdJson = "{\"userage\":16,\"myage\":18,\"username\":\"rc\",\"isDeveloper\":\"true\"}";

        Developer third = gson.fromJson(thirdJson, Developer.class);
        textView.append("\n");
        textView.append(third.toString());

        //结论 :如果两个同时存在，gson只会用后面出现那个

        String fouthJson = "{\"myage\":18,\"userage\":16,\"username\":\"rc\",\"isDeveloper\":\"true\"}";
        Developer fouth = gson.fromJson(fouthJson, Developer.class);
        textView.append("\n");
        textView.append(fouth.toString());
    }
}
