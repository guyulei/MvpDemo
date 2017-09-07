package com.guyulei.mvpdemo.mvp.simple.base;

/**
 * Created by A on 2017/9/6.
 * //抽象解绑和绑定(MvpCallback)
 */
public interface MvpCallback<V extends MvpView, P extends MvpPresent<V>> {

    P CreatePresenter();

    V CreateView();

    void setPresenter(P presenter);

    P getPresenter();

    void setMvpView(V view);

    V getMvpView();
}

