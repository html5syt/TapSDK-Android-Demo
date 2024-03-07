package com.tds.demo;

import android.app.Application;
import android.content.Context;

import com.tds.demo.data.SDKInfoData;

import cn.leancloud.LCLogger;
import cn.leancloud.LeanCloud;

/**
 * 2022/10/14
 * Describe：
 */
public class App extends Application {

    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LeanCloud.initialize(this, SDKInfoData.SDK_CLIENT_ID, SDKInfoData.SDK_CLINT_TOKEN, SDKInfoData.SDK_SERVER_URL);
        LeanCloud.setLogLevel(LCLogger.Level.DEBUG);

    }

    public static Context getContextObject(){
        return context;
    }

}
