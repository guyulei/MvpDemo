package com.guyulei.mvpdemo.mvp.simple;

import com.guyulei.mvpdemo.mvp.simple.base.MvpCallback;
import com.guyulei.mvpdemo.mvp.simple.base.MvpPresent;
import com.guyulei.mvpdemo.mvp.simple.base.MvpView;

/**
 * Created by A on 2017/9/6.
 * //直接封装MVP实现
 */

public class ProxyMvpCallback<V extends MvpView, P extends MvpPresent<V>> implements MvpCallback<V, P> {

    //持有目标对象引用->Activity
    //mvpCallback->本质就是Actiivty
    private MvpCallback<V, P> mMvpCallback;

    public ProxyMvpCallback(MvpCallback<V, P> mvpCallback) {
        this.mMvpCallback = mvpCallback;
    }

    @Override
    public P CreatePresenter() {
        P presenter = mMvpCallback.getPresenter();
        if (presenter == null) {
            presenter = mMvpCallback.CreatePresenter();
        }
        mMvpCallback.setPresenter(presenter);
        return getPresenter();
    }

    @Override
    public V CreateView() {
        V view = mMvpCallback.getMvpView();
        if (view == null) {
            view = mMvpCallback.CreateView();
        }
        mMvpCallback.setMvpView(view);
        return getMvpView();
    }

    @Override
    public void setPresenter(P presenter) {
        mMvpCallback.setPresenter(presenter);
    }

    @Override
    public P getPresenter() {
        return mMvpCallback.getPresenter();
    }

    @Override
    public void setMvpView(V view) {
        mMvpCallback.setMvpView(view);
    }

    @Override
    public V getMvpView() {
        return mMvpCallback.getMvpView();
    }

    public void attachView() {
        getPresenter().attachview(getMvpView());
    }

    public void detachView() {
        getPresenter().detachview();
    }
}
