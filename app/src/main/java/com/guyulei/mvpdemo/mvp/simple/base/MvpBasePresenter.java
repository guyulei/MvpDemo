package com.guyulei.mvpdemo.mvp.simple.base;

public class MvpBasePresenter<V extends MvpView> implements MvpPresent<V> {

    private V view;

    public V getView() {
        return view;
    }

    @Override
    public void attachview(V view) {
        this.view = view;
    }

    @Override
    public void detachview() {
        this.view = null;
    }
}