package com.example.translucentbartest;
/**
 * Translucent System Bar实现透明状态栏的两种方式
 * 		1.ImageTranslucentBar
 * 			这种方式使用一张图片作为背景，图片延伸至屏幕顶部的系统状态栏，实现透明状态栏效果
 * 		2.ColorTranslucentBar
 * 			这种方式需要分别设置
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.btn_image_translucent);
		findViewById(R.id.btn_color_translucent);
	}

	public void translucentBar(View view) {
		int viewId = view.getId();
		if (viewId == R.id.btn_image_translucent) {
			Intent translucentBarIntent = new Intent(this, ImageTranslucentBarActivity.class);
			startActivity(translucentBarIntent);
		} else if (viewId == R.id.btn_color_translucent) {
			Intent translucentBarIntent = new Intent(this, ColorTranslucentBarActivity.class);
			startActivity(translucentBarIntent);
		}
	}
}
