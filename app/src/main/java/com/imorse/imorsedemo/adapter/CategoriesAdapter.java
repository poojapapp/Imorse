package com.imorse.imorsedemo.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;


import com.google.gson.Gson;
import com.imorse.imorsedemo.R;
import com.imorse.imorsedemo.model.Company;
import com.imorse.imorsedemo.sharedpreferences.SharedPreferencesManager;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;



public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder>
{
    private  List<Company> getAllvideos ;
    private Context mContext;
    private SharedPreferencesManager sharedPreferencesManager;
    DisplayMetrics displayMetrics = new DisplayMetrics();


    public CategoriesAdapter(List<Company> getAllvideos, Context mContext) {
        this.getAllvideos = getAllvideos;
        this.mContext = mContext;
        sharedPreferencesManager= new SharedPreferencesManager();
    }

    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.card_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull final CategoriesAdapter.ViewHolder holder, final int position) {
        final Company getAllvideo =getAllvideos.get(position);
        holder.tv_name.setText(getAllvideo.getComponyName());
        holder.tv_contact_no.setText(getAllvideo.getContactNo());
        holder.tv_email_id.setText(getAllvideo.getEmailId());
        holder.tv_address.setText(getAllvideo.getAddress());
        holder.tv_advertising_banner.setText(getAllvideo.getAdvertisingBanner());
    }

    @Override
    public int getItemCount() {
        return getAllvideos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name,tv_contact_no,tv_email_id,tv_address,tv_advertising_banner;
        public ViewHolder(View itemView) {
            super(itemView);
            try{
                tv_name = itemView.findViewById( R.id.tv_name );
                tv_contact_no = itemView.findViewById( R.id.tv_contact_no );
                tv_email_id = itemView.findViewById( R.id.tv_email_id );
                tv_address = itemView.findViewById( R.id.tv_address );
                tv_advertising_banner = itemView.findViewById( R.id.tv_advertising_banner );

            }catch (NullPointerException e){
                e.printStackTrace();
            }

        }
    }

}
