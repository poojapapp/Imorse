package com.imorse.imorsedemo.utilities;

import android.app.ProgressDialog;
import android.content.Context;

import com.imorse.imorsedemo.R;


public class ProgressDialogUtility {
    private ProgressDialog progressDialog;

    public void showProgressDialog(String message, Context context) {
        progressDialog = new ProgressDialog(context, R.style.AlertDialogTheme);
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        if (!message.isEmpty())
        {
            progressDialog.setMessage(message);
        }else {
            progressDialog.setMessage("Loading...");
        }

        progressDialog.show();
    }

    public void dismissProgressDialog() {
        try {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        }catch (Exception e)
        {

        }



    }
}

