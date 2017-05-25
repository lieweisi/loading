package com.lieweisi.myloadingdialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.lieweisi.loadinglib.LoadingDialog;
import com.lieweisi.loadinglib.LoadingUtil;

public class MainActivity extends AppCompatActivity {
    private LoadingDialog dialog;
    private Handler mHandler = new Handler() {
        public void dispatchMessage(android.os.Message msg) {
            LoadingUtil.dismiss(dialog);
        };
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                dialog = LoadingUtil.show(dialog,this,LoadingUtil.TYPE_1);
                dialog.setCancelable(true);
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        mHandler.sendEmptyMessage(1);
                    }
                }).start();
                break;
            case R.id.btn2:
                dialog = LoadingUtil.show(dialog,this,LoadingUtil.TYPE_2);
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        mHandler.sendEmptyMessage(1);
                    }
                }).start();
                break;
        }
    }
}
