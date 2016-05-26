package com.example.hp.postion_library_android;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.hp.postion_library_android.YCserve.YCLocationService;
import com.example.hp.postion_library_android.YCuser.YCConsumer;
import com.example.hp.postion_library_android.YCuser.YCLocation;
import com.example.hp.postion_library_android.YCuser.YCLocationListener;
import com.example.hp.postion_library_android.YCuser.YCLocationManager;
import com.example.t8.myapplication.R;
import com.jude.swipbackhelper.SwipeBackHelper;
import com.radiusnetworks.ibeacon.IBeaconConsumer;

//版本测试
//开发测试使用的临时Activity
public class MyActivity extends Activity {

    private final String TAG = "MyActivity";
    private boolean debuginfo = true;
    private Intent intent=null;
    private YCLocationManager ycLocationManager =YCLocationManager.getInstanceForApplication(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,MyActivity2.class));
            }
        });
    }



    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
