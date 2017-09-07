package com.guyulei.mvpdemo.mvp.simple2.login;

import com.guyulei.mvpdemo.mvp.simple2.base.MvpBasePresenter;
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

/*public class LoginPresenter extends MvpBasePresenter<LoginView> {

    //持有M层引用
    private LoginModel loginModel;

    //构造方法绑定UI层
    public LoginPresenter() {
        this.loginModel = new LoginModel();
    }

    public void login(String username, String password) {
        this.loginModel.login(username, password, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                //回调UI层->和UI进行交互
                if (getView() != null) {
                    getView().onLoginResult(result);
                }
            }
        });
    }

}*/
