package loveq.rc.gsondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import loveq.rc.gsondemo.ui.ConfigurationActivity;
import loveq.rc.gsondemo.ui.MappingActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMappingActivity(View view) {
        startActivity(new Intent(MainActivity.this, MappingActivity.class));
    }

    public void startConfigurationActivity(View view) {
        startActivity(new Intent(MainActivity.this, ConfigurationActivity.class));
    }
}
