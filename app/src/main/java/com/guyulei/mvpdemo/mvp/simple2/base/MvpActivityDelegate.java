package com.guyulei.mvpdemo.mvp.simple2.base;

import android.os.Bundle;

/**
 * Created by A on 2017/9/6.
 * 生命周期 代理
 * //第二重代理->目标接口->针对Activity生命周期进行代理
 */

public interface MvpActivityDelegate<V extends MvpView, P extends MvpPresent<V>> {
    public void onCreate(Bundle savedInstanceState);

    public void onStart();

    public void onPause();

    public void onResume();

    public void onRestart();

    public void onStop();

    public void onDestroy();
}


