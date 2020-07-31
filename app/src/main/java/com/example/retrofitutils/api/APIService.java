package com.example.retrofitutils.api;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIService {

//    baseUrl = 'https://amp-test.gwm.com.cn/web/wey/v1/integral/carmalllist';

    /**
     * get请求---Form表单提交
     * @return
     */
    @GET("integral/carmalllist")
    @Headers("connection:keep-alive")
    Observable<BannerBean> getBanner();


    @FormUrlEncoded
    @POST("integeral/carmalllist")
    Observable<BannerBean> getBanner(@Field("userName") String userName);


    @GET("integral/carmalllist")
    Observable<BannerBean> getBanner1(@Query("ptToken") String ptToken);



}
