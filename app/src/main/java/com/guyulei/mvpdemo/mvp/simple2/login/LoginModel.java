package com.guyulei.mvpdemo.mvp.simple2.login;

import com.guyulei.mvpdemo.utils.HttpTask;
import com.guyulei.mvpdemo.utils.HttpUtils;

/**
 * Created by A on 2017/9/5.
 * 数据
 */
public class LoginModel {
    public void getLoginData(String user, String pass, HttpUtils.OnHttpResultListener onHttpResultListener) {
        HttpTask httpTask = new HttpTask(onHttpResultListener);
        httpTask.execute("http://www.amallb2b.com/app/Home/Login/Login", user, pass);
    }
}

/*
public class LoginModel {

    public void login(String username, String password, final HttpUtils.OnHttpResultListener onHttpResultListener) {
        HttpTask httpTask = new HttpTask(new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                onHttpResultListener.onResult(result);
            }
        });
        httpTask.execute("http://www.amallb2b.com/app/Home/Login/Login", username, password);
    }

}*/
