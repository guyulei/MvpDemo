package com.guyulei.mvpdemo.mvp.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guyulei.mvpdemo.mvp.simple.base.MvpCallback;
import com.guyulei.mvpdemo.mvp.simple.base.MvpPresent;
import com.guyulei.mvpdemo.mvp.simple.base.MvpView;

/**
 * Created by A on 2017/9/5.
 * 抽象 基类 baseactivity
 */

public abstract class MvpActivity<V extends MvpView, P extends MvpPresent<V>> extends AppCompatActivity implements MvpCallback<V, P> {

    private P                             present;
    private V                             view;

    //代理对象持有目标对象引用
    private MvpActivityDelegateImpl<V, P> delegateimpl;//生命周期 实现类  目标对象

    public MvpActivityDelegateImpl<V, P> getDelegateimpl() {
        if (delegateimpl == null) {
            delegateimpl = new MvpActivityDelegateImpl<V, P>(this);
        }
        return delegateimpl;
    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        getDelegateimpl().onCreate(savedInstanceState);
    }

    @Override
    public P CreatePresenter() {
        return present;
    }


    @Override
    public V CreateView() {
        return view;
    }
    @Override
    public P getPresenter() {
        return this.present;
    }

    @Override
    public V getMvpView() {
        return view;
    }

    @Override
    public void setPresenter(P presenter) {
        this.present = presenter;
    }

    @Override
    public void setMvpView(V view) {
        this.view = view;
    }


    @Override
    protected void onStart() {
        super.onStart();
        getDelegateimpl().onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getDelegateimpl().onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        getDelegateimpl().onPause();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        getDelegateimpl().onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        getDelegateimpl().onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getDelegateimpl().onDestroy();
    }
}
