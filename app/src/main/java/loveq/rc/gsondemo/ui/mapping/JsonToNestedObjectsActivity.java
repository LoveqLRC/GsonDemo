package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.UserWithAddress;

public class JsonToNestedObjectsActivity extends AppCompatActivity {
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
        String json = "{\"age\":18,\"name\":\"rc\",\"password\":\"123\",\"userAddress\":{\"city\":\"湛江市\",\"province\":\"广东省\",\"street\":\"湛江师范学院\"}}";
        Gson gson = new Gson();
        UserWithAddress userWithAddress = gson.fromJson(json, UserWithAddress.class);
        textView.setText(userWithAddress.toString());
    }
}
