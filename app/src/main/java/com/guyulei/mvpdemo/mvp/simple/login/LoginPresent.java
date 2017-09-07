package com.guyulei.mvpdemo.mvp.simple.login;

import com.guyulei.mvpdemo.mvp.simple.base.MvpBasePresenter;
import com.guyulei.mvpdemo.utils.HttpUtils;

/**
 * Created by A on 2017/9/5.
 */

public class LoginPresent extends MvpBasePresenter<LoginView> {

    //持有 M
    private LoginModel mLoginModel;

    //持有 V
    public LoginPresent() {
        this.mLoginModel = new LoginModel();
    }

    //
    public void login(String user, String pass) {
        mLoginModel.getLoginData(user, pass, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                if (getView() != null) {
                    getView().onShowData(result);
                }
            }
        });
    }
}
