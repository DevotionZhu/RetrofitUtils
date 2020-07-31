package com.example.network.interceptor;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author huguilin
 */
public class HeaderInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request request1 = request.newBuilder()
                .addHeader("content-type", "application/json")
                .build();

        Log.e("hgl", "method: " + request.method());
        Log.e("hgl", "connection: " + request.header("connection"));
        Log.e("hgl","connection-"+chain.connection());
        Log.e("hgl","headers:"+request1.headers());





        return chain.proceed(request1);
    }
}
