package com.example.retrofitutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.network.HttpUtils;
import com.example.retrofitutils.api.APIService;
import com.example.retrofitutils.api.BannerBean;
import com.example.network.oberver.BaseOberver;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new HttpUtils()
                .getService()
                .create(APIService.class)
                .getBanner()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseOberver<BannerBean>() {
                    @Override
                    public void onSuccess(BannerBean bannerBean) {

                    }

                    @Override
                    public void onFail(Throwable e) {

                    }
                });
    }
}