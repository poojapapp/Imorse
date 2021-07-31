package com.imorse.imorsedemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.imorse.imorsedemo.sharedpreferences.SharedPreferencesManager;
import com.imorse.imorsedemo.utilities.InternetUtilities;

public class BaseActivity extends AppCompatActivity {
    protected Activity mActivity;
    protected Context mContext;
    protected InternetUtilities internetUtilities;
    protected SharedPreferencesManager sharedPreferencesManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        mContext = getApplicationContext();
        internetUtilities=new InternetUtilities();
        sharedPreferencesManager=new SharedPreferencesManager();
        getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

    protected void showToast(Context context, String message) {
        Toast.makeText(context, message,
                Toast.LENGTH_LONG).show();
    }

}
