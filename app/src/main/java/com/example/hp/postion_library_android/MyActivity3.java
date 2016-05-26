package com.example.hp.postion_library_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.hp.postion_library_android.YCuser.YCConsumer;
import com.example.hp.postion_library_android.YCuser.YCLocation;
import com.example.hp.postion_library_android.YCuser.YCLocationListener;
import com.example.hp.postion_library_android.YCuser.YCLocationManager;
import com.example.t8.myapplication.R;
import com.jude.swipbackhelper.SwipeBackHelper;

//版本测试
//开发测试使用的临时Activity
public class MyActivity3 extends Activity {

    private final String TAG = "MyActivity";
    private boolean debuginfo = true;
    private Intent intent=null;
    private YCLocationManager ycLocationManager =YCLocationManager.getInstanceForApplication(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my3);
        SwipeBackHelper.onCreate(this);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyActivity3.this,MyActivity4.class));
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        SwipeBackHelper.onPostCreate(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SwipeBackHelper.onDestroy(this);
    }
}
