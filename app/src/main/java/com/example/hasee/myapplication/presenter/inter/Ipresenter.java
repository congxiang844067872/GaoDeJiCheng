package com.example.hasee.myapplication.presenter.inter;

import java.util.Map;

import okhttp3.ResponseBody;

/**
 * Created by hasee on 2018/3/29.
 */

public interface Ipresenter {
    void getDataFromNet(String url, Map<String, String> map);
    void unsubcribe();

    void onSuccess(ResponseBody responseBody);
    void onError(Throwable throwable);
}
