package com.imorse.imorsedemo.retrofit.apiInterfaces;



import com.imorse.imorsedemo.model.Company;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

  @Headers({"Content-Type: application/x-www-form-urlencoded"})
  @GET("v1/aimadirectory")
  Call<Company> getUrbanFreshData();
}
