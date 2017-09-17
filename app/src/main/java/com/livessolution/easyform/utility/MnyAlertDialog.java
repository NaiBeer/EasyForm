package com.livessolution.easyform.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.livessolution.easyform.R;

/**
 * Created by Admins on 09/17/17.
 */

public class MnyAlertDialog {

    private Context context; //ctl Art Enter

    public MnyAlertDialog(Context context) {
        this.context = context;
    }

    public void myDialog(String strTitle, String strMessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.mipmap.ic_name);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();


    } // shit ctrl Enter Commitment

} //Main Class
