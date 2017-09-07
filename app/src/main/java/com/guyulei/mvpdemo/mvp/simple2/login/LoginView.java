package com.guyulei.mvpdemo.mvp.simple2.login;

import com.guyulei.mvpdemo.mvp.simple2.base.MvpView;

/**
 * Created by A on 2017/9/5.
 * ui层 回调
 */

public interface LoginView extends MvpView {

    void onShowData(String result);
}


/*public interface LoginView extends MvpView {

    void onLoginResult(String result);

}*/
