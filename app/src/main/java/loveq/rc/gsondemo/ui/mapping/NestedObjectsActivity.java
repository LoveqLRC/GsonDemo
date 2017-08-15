package loveq.rc.gsondemo.ui.mapping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.bean.UserAddress;
import loveq.rc.gsondemo.bean.UserWithAddress;

public class NestedObjectsActivity extends AppCompatActivity {
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
        UserAddress userAddress = new UserAddress("湛江师范学院", "湛江市", "广东省");
        UserWithAddress userWithAddress = new UserWithAddress("rc", "123", 18, userAddress);
        Gson gson = new Gson();
        String json = gson.toJson(userWithAddress);
        textView.setText(json);
        Log.d("NestedObjectsActivity", json);
    }
}
