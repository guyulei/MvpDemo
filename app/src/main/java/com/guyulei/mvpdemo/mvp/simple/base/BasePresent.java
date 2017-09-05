package com.guyulei.mvpdemo.mvp.simple.base;

/**
 * Created by A on 2017/9/5.
 */

public class BasePresent<V extends BaseView> {
    private V view;

    //绑定view
    public void attachview(V view) {
        this.view = view;
    }

    //解除view
    public void detachview() {
        this.view = null;
    }

    public V getView() {
        return this.view;
    }
}
