package com.guyulei.mvpdemo.mvp.simple2.base;

/**
 * Created by A on 2017/9/5.
 * present 基类
 * //高度抽象UI层接口
 */

public interface MvpPresent<V extends MvpView> {

    //绑定view
    void attachview(V view);

    //解除view
    void detachview();
}
