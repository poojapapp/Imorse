package com.imorse.imorsedemo.utilities;

import android.content.Context;
import android.net.ConnectivityManager;

public class InternetUtilities {
    public boolean isNetworkConnected(Context mContext) {
        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService( Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}
