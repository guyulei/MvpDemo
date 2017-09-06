package com.guyulei.mvpdemo.mvp.simple2;

import com.guyulei.mvpdemo.mvp.simple2.base.MvpCallback;
import com.guyulei.mvpdemo.mvp.simple2.base.MvpPresent;
import com.guyulei.mvpdemo.mvp.simple2.base.MvpView;

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
        if (presenter == null) {
            throw new NullPointerException("Presenter is not null!");
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
        if (view == null) {
            throw new NullPointerException("Presenter is not null!");
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
        P presenter = mMvpCallback.getPresenter();
        if (presenter == null) {
            // 抛异常
            throw new NullPointerException("Presenter is not null!");
        }
        return presenter;
    }

    @Override
    public void setMvpView(V view) {
        mMvpCallback.setMvpView(view);
    }

    @Override
    public V getMvpView() {
        return mMvpCallback.getMvpView();
    }

    public void attachView(V view) {
        mMvpCallback.setMvpView(view);
    }

    public void detachView() {
        mMvpCallback.setMvpView(null);
    }
}
