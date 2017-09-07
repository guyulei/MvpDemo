package com.guyulei.mvpdemo.mvp.simple.login;

import com.guyulei.mvpdemo.mvp.simple.base.MvpView;

/**
 * Created by A on 2017/9/5.
 * ui层 回调
 */

public interface LoginView extends MvpView {

    void onShowData(String result);
}
