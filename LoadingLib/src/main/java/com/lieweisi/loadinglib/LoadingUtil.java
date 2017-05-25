package com.lieweisi.loadinglib;

import android.content.Context;

/**
 * Created by liluo on 2017/5/5.
 */

public class LoadingUtil {
    public static int TYPE_1 = R.layout.type1;
    public static int TYPE_2 = R.layout.type;

    public static void dismiss(LoadingDialog dialog) {
        if (dialog != null && dialog.isShowing() == true) {
            dialog.dismiss();
        }
    }

    public static LoadingDialog show(LoadingDialog dialog, Context context, int type) {
        dialog=null;
        if (dialog == null) {
            dialog = new LoadingDialog(context, type);
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
        } else {
            dialog.dismiss();
            dialog.show();
        }
        return dialog;
    }
}
