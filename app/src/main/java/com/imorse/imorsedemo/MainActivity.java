package com.imorse.imorsedemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.imorse.imorsedemo.adapter.CategoriesAdapter;
import com.imorse.imorsedemo.interfaces.InterfaceConstants;
import com.imorse.imorsedemo.model.Company;
import com.imorse.imorsedemo.retrofit.RetroClientInstance;
import com.imorse.imorsedemo.retrofit.RetrofitCallback;
import com.imorse.imorsedemo.retrofit.RetrofitInstance;
import com.imorse.imorsedemo.retrofit.apiInterfaces.ApiInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends BaseActivity {
    private List<Company> mGetAllvideos;
    RecyclerView rvContacts;
    private CategoriesAdapter newVideoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main);
        mGetAllvideos = new ArrayList<>();
        rvContacts = (RecyclerView) findViewById( R.id.rvContacts );
        rvContacts.setHasFixedSize(true);
        rvContacts.setAdapter( newVideoListAdapter );
        rvContacts.setLayoutManager(new LinearLayoutManager( mContext ));
    }

    @Override
    public void onStart() {
        super.onStart();
        callNewVideoAPI(); // your code
    }
    public void callNewVideoAPI() {
        ApiInterface apiInterface = RetroClientInstance.getRetrofitInstance( mContext ).create( ApiInterface.class );
        Call<Company> getUserInformationResponseCall = apiInterface.getUrbanFreshData();
        getUserInformationResponseCall.enqueue( new RetrofitCallback<Company>( mActivity, true ) {
            @Override
            public void onSuccess(Company response) throws IOException {
                if(response!=null){
                    mGetAllvideos.clear();
                    newVideoListAdapter.notifyDataSetChanged();
                    newVideoListAdapter.notifyItemRangeInserted( 0, mGetAllvideos.size() );
                    rvContacts.scrollToPosition( 0 );
                }
            }
        } );
    }



}