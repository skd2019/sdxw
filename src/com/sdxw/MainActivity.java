package com.sdxw;

import android.os.Bundle;
//import android.app.Activity;
import android.view.Menu;


//TODO:��Ӷ�cordova��֧��
import org.apache.cordova.*;

import com.sdxw.R;

//public class MainActivity extends Activity {
public class MainActivity extends DroidGap {
    
    //protected void onCreate(Bundle savedInstanceState) {
	@Override
	public void onCreate(Bundle savedInstanceState) {	
        
		super.onCreate(savedInstanceState);
        
		//TODO:ҳ�����ʱ��ı���ͼƬ�����ҳ����ؿ������һ���ܿ���
		super.setIntegerProperty("splashscreen", R.drawable.splash_sn);
		
		//TODO:���6���Ժ󻹲��ܼ��سɹ�����Ϊ�������
		super.setIntegerProperty("loadUrlTimeoutValue", 60000);
        
		//TODO:������ҳ�棬���Ե�ʱ����Ը�Ϊ��������Ҫ��ҳ��
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
