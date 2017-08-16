package loveq.rc.gsondemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.ui.configuration.ExposeActivity;
import loveq.rc.gsondemo.ui.configuration.SerializedNameActivity;
import loveq.rc.gsondemo.ui.configuration.SerializedNameExtendActivity;

public class ConfigurationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
    }

    public void startSerializedNameActivity(View v) {
        startActivity(new Intent(ConfigurationActivity.this, SerializedNameActivity.class));
    }

    public void startSerializedNameExtendActivity(View v) {
        startActivity(new Intent(ConfigurationActivity.this, SerializedNameExtendActivity.class));
    }

    public void startExposeActivity(View v) {
        startActivity(new Intent(ConfigurationActivity.this, ExposeActivity.class));
    }
}
