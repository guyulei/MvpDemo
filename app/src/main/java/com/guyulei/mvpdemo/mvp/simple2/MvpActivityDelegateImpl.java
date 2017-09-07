package com.guyulei.mvpdemo.mvp.simple2;

import android.os.Bundle;

import com.guyulei.mvpdemo.mvp.simple2.base.MvpActivityDelegate;
import com.guyulei.mvpdemo.mvp.simple2.base.MvpCallback;
import com.guyulei.mvpdemo.mvp.simple2.base.MvpPresent;
import com.guyulei.mvpdemo.mvp.simple2.base.MvpView;

/**
 * Created by A on 2017/9/6.
 * 生命周期 实现类
 * //第二重代理->目标对象->针对的是Activity生命周期
 */

public class MvpActivityDelegateImpl<V extends MvpView, P extends MvpPresent<V>> implements MvpActivityDelegate<V, P> {

    private ProxyMvpCallback<V, P> mProxyMvpCallback;

    public MvpActivityDelegateImpl(MvpCallback<V, P> mvpCallback) {
        this.mProxyMvpCallback = new ProxyMvpCallback<V, P>(mvpCallback);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //绑定view
        this.mProxyMvpCallback.CreatePresenter();
        this.mProxyMvpCallback.CreateView();
        this.mProxyMvpCallback.attachView();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        this.mProxyMvpCallback.detachView();
    }
}