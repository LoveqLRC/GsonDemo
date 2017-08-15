package loveq.rc.gsondemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.ui.mapping.JsonToNestedObjectsActivity;
import loveq.rc.gsondemo.ui.mapping.JsonToObjActivity;
import loveq.rc.gsondemo.ui.mapping.NestedObjectsActivity;
import loveq.rc.gsondemo.ui.mapping.ObjToJsonActivity;

public class MappingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapping);
    }

    public void startObjToJsonActivity(View v) {
        startActivity(new Intent(MappingActivity.this, ObjToJsonActivity.class));
    }

    public void startJsonToObjActivity(View v) {
        startActivity(new Intent(MappingActivity.this, JsonToObjActivity.class));
    }

    public void startNestedObjectsActivity(View v) {
        startActivity(new Intent(MappingActivity.this, NestedObjectsActivity.class));
    }


    public void startJsonToNestedObjectsActivity(View v) {
        startActivity(new Intent(MappingActivity.this, JsonToNestedObjectsActivity.class));
    }

}
