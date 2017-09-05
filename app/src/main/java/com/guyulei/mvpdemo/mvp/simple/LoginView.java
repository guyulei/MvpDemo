package com.guyulei.mvpdemo.mvp.simple;

import com.guyulei.mvpdemo.mvp.simple.base.BaseView;

/**
 * Created by A on 2017/9/5.
 * ui层 回调
 */

public interface LoginView extends BaseView {

    void onShowData(String result);
}
