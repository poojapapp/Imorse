package com.imorse.imorsedemo.retrofit;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


import com.google.gson.JsonSyntaxException;
import com.imorse.imorsedemo.interfaces.InterfaceConstants;
import com.imorse.imorsedemo.utilities.ProgressDialogUtility;

import org.json.JSONException;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public abstract class RetrofitCallback<T> implements Callback<T> {
    private ProgressDialogUtility progressDialog;
    private Context context;
    private boolean isShowProgressDialog = true;

    public RetrofitCallback(Context context, boolean isShowProgressDialog) {
        if (isShowProgressDialog){
            progressDialog = new ProgressDialogUtility();
            progressDialog.showProgressDialog("",context);
        }

        this.context = context;
        this.isShowProgressDialog = isShowProgressDialog;
    }

    public abstract void onSuccess(T arg0) throws IOException;
    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (isShowProgressDialog)
            progressDialog.dismissProgressDialog();

        if (response.isSuccessful() ) {
            try {
                onSuccess(response.body());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Toast.makeText(context, response.message(), Toast.LENGTH_SHORT).show();
            Log.e("response ",""+response.message());
        }
    }
    @Override
    public void onFailure(Call<T> call, Throwable error) {
        if (isShowProgressDialog)
            progressDialog.dismissProgressDialog();
        String errorMsg;
        error.printStackTrace();
        Log.e("error",""+error);
        if (error instanceof SocketTimeoutException) {
            errorMsg = InterfaceConstants.apiValidateResponse.connection_timeout;
        } else if (error instanceof UnknownHostException) {
            errorMsg = InterfaceConstants.apiValidateResponse.nointernet;
        } else if (error instanceof ConnectException) {
            errorMsg = InterfaceConstants.apiValidateResponse.server_not_responding;
        } else if (error instanceof JSONException || error instanceof JsonSyntaxException) {
            errorMsg = InterfaceConstants.apiValidateResponse.parse_error;
        } else if (error instanceof IOException) {
            errorMsg = error.getMessage();
        } else {
            errorMsg = InterfaceConstants.toastMessage.oppose_something_went_wrong;
        }
        if (isShowProgressDialog)
        {
            if (progressDialog != null ) {

                progressDialog.dismissProgressDialog();

            }
        }

        Toast.makeText(context, errorMsg, Toast.LENGTH_SHORT).show();
    }
}