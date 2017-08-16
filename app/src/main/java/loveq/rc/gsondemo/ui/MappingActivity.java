package loveq.rc.gsondemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import loveq.rc.gsondemo.R;
import loveq.rc.gsondemo.ui.mapping.JsonToArrayActivity;
import loveq.rc.gsondemo.ui.mapping.JsonToListActivity;
import loveq.rc.gsondemo.ui.mapping.JsonToMapActivity;
import loveq.rc.gsondemo.ui.mapping.JsonToNestedListActivity;
import loveq.rc.gsondemo.ui.mapping.JsonToNestedObjectsActivity;
import loveq.rc.gsondemo.ui.mapping.JsonToObjActivity;
import loveq.rc.gsondemo.ui.mapping.JsonToSetActivity;
import loveq.rc.gsondemo.ui.mapping.ListToJsonActivity;
import loveq.rc.gsondemo.ui.mapping.MapToJsonActivity;
import loveq.rc.gsondemo.ui.mapping.NestedListToJsonActivity;
import loveq.rc.gsondemo.ui.mapping.NestedObjectsActivity;
import loveq.rc.gsondemo.ui.mapping.NullValuesActivity;
import loveq.rc.gsondemo.ui.mapping.ObjToJsonActivity;
import loveq.rc.gsondemo.ui.mapping.SetToJsonActivity;

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

    public void startNestedListToJsonActivity(View v) {
        startActivity(new Intent(MappingActivity.this, NestedListToJsonActivity.class));
    }

    public void startJsonToNestedListActivity(View v) {
        startActivity(new Intent(MappingActivity.this, JsonToNestedListActivity.class));
    }

    public void startListToJsonActivity(View v) {
        startActivity(new Intent(MappingActivity.this, ListToJsonActivity.class));
    }

    public void startJsonToArrayActivity(View v) {
        startActivity(new Intent(MappingActivity.this, JsonToArrayActivity.class));
    }

    public void startJsonToListActivity(View v) {
        startActivity(new Intent(MappingActivity.this, JsonToListActivity.class));
    }


    public void startMapToJsonActivity(View v) {
        startActivity(new Intent(MappingActivity.this, MapToJsonActivity.class));
    }

    public void startJsonToMapActivity(View v) {
        startActivity(new Intent(MappingActivity.this, JsonToMapActivity.class));
    }

    public void startSetToJsonActivity(View v) {
        startActivity(new Intent(MappingActivity.this, SetToJsonActivity.class));
    }

    public void startJsonToSetActivity(View v) {
        startActivity(new Intent(MappingActivity.this, JsonToSetActivity.class));
    }

    public void startNullValuesActivity(View v) {
        startActivity(new Intent(MappingActivity.this, NullValuesActivity.class));
    }
}
