package com.sdxw;

import android.os.Bundle;
//import android.app.Activity;
import android.view.Menu;


//TODO:添加对cordova的支持
import org.apache.cordova.*;

import com.sdxw.R;

//public class MainActivity extends Activity {
public class MainActivity extends DroidGap {
    
    //protected void onCreate(Bundle savedInstanceState) {
	@Override
	public void onCreate(Bundle savedInstanceState) {	
        
		super.onCreate(savedInstanceState);
        
		//TODO:页面加载时候的背景图片，如果页面加载快这个不一定能看到
		super.setIntegerProperty("splashscreen", R.drawable.splash_sn);
		
		//TODO:如果6秒以后还不能加载成功则认为程序出错
		super.setIntegerProperty("loadUrlTimeoutValue", 60000);
        
		//TODO:启动的页面，调试的时候可以改为任意你想要的页面
		//super.loadUrl("file:///android_asset/www/position/getPosition.html", 1000);
		//super.loadUrl("file:///android_asset/www/index.html", 1000);
		
		super.loadUrl("file:///android_asset/www/camera/editPicture.html", 1000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
