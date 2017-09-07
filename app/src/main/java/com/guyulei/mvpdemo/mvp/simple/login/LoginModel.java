package com.guyulei.mvpdemo.mvp.simple.login;

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
