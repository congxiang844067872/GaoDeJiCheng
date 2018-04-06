package com.example.hasee.myapplication.presenter;

import com.example.hasee.myapplication.model.ModelGoods;
import com.example.hasee.myapplication.presenter.base.BasePresenterGoods;
import com.example.hasee.myapplication.presenter.inter.Ipresentergoods;
import com.example.hasee.myapplication.view.activity.GoodsActivity;
import com.example.hasee.myapplication.view.inter.GoodsView;

import java.util.Map;

import okhttp3.ResponseBody;

/**
 * Created by hasee on 2018/3/29.
 */

public class PresenterGoods extends BasePresenterGoods implements Ipresentergoods{

    private  ModelGoods modelGoods;
    private  GoodsView goodsView;

    public PresenterGoods(GoodsActivity goodsView) {
        this.goodsView = goodsView;
        modelGoods = new ModelGoods(this);
    }

    public void getDataFromNet(String url, Map<String, String> map) {
        modelGoods.getDataFromNet(url,map);
    }

    @Override
    public void unsubcribe() {
        modelGoods.unsubcribe();
    }

    @Override
    public void onSuccess(ResponseBody responseBody) {
        goodsView.onSuccess(responseBody);
    }

    @Override
    public void onError(Throwable throwable) {
        goodsView.onError(throwable);
    }
}
