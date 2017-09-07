package com.guyulei.mvpdemo.mvp.simple3.lce;

import android.view.View;

/**
 * Created by A on 2017/9/7.
 * //策略接口
 */

public interface MvpLceAnimator {
    /**
     * 显示加载页面
     */
    void showLoadingView(View loadingView, View conotentView, View errorView);

    /**
     * 显示内容页面
     */
    void showContentView(View loadingView, View conotentView, View errorView);

    /**
     * 显示错误页面
     */
    void showErrorView(View loadingView, View conotentView, View errorView);
}
