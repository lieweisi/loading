package com.loadingprogress.demo;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 加载中Dialog
 * 
 * @author lieweisi
 */
public class LoadingDialog extends AlertDialog {

	private TextView tips_loading_msg;
	private int layoutResId;
	private String message = null;

	/**
	 * 构造方法
	 * 
	 * @param context上下文
	 * @param layoutResId要传入的dialog布局文件的id
	 */
	public LoadingDialog(Context context, int layoutResId) {
		super(context);
		this.layoutResId = layoutResId;
		message = context.getResources().getString(R.string.loading);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(layoutResId);
		tips_loading_msg = (TextView) findViewById(R.id.tips_loading_msg);
		tips_loading_msg.setText(this.message);
	}

}
