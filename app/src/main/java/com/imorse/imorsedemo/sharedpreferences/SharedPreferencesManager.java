package com.imorse.imorsedemo.sharedpreferences;

import android.app.Activity;
import android.content.Context;

import static android.content.Context.MODE_PRIVATE;

public class SharedPreferencesManager {
    private static final String MY_PREFS_NAME = "peaceinchanting";

    public String getStringValueWithContext(Context mContext, String Key)
    {
        android.content.SharedPreferences sharedPref = mContext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        return sharedPref.getString(Key,null);
    }
    public void SaveValueWithContext(Context mContext, String Key, String value)
    {
        android.content.SharedPreferences sharedPref = mContext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(Key,value);
        editor.apply();
    }
    public void SaveString(Activity mActivity, String Key, String value)
    {
        android.content.SharedPreferences sharedPref = mActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(Key,value);
        editor.apply();
    }

    public String getStringValue(Activity mActivity, String Key)
    {
        android.content.SharedPreferences sharedPref = mActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        return sharedPref.getString(Key,null);
    }


    public boolean getBoolean(Activity mActivity, String Key)
    {
        android.content.SharedPreferences sharedPref = mActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        return sharedPref.getBoolean(Key,false);
    }

    public void SaveBoolean(Activity mActivity, String Key, boolean value)
    {
        android.content.SharedPreferences sharedPref = mActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(Key,value);
        editor.apply();
    }

    public void SaveBooleanWithContext(Context mContext, String Key, boolean value)
    {
        android.content.SharedPreferences sharedPref = mContext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(Key,value);
        editor.apply();
    }
    public void SaveLong(Activity mActivity, String Key, long value)
    {
        android.content.SharedPreferences sharedPref = mActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putLong(Key,value);
        editor.apply();
    }
    public void SaveLong(Context context, String Key, long value)
    {
        android.content.SharedPreferences sharedPref = context.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putLong(Key,value);
        editor.apply();
    }


    public Long getLong(Activity mActivity, String Key)
    {
        android.content.SharedPreferences sharedPref = mActivity.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        return sharedPref.getLong(Key,-1l);
    }

    public void SaveLongWithCont(Context context, String Key, long value)
    {
        android.content.SharedPreferences sharedPref = context.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putLong(Key,value);
        editor.apply();
    }

    public void clearAllSharedPreferences(Context mContext)
    {

        android.content.SharedPreferences sharedPref = mContext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.clear();
        editor.apply();
    }
}




