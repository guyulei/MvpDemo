package com.guyulei.mvpdemo.mvp.simple3;

import com.guyulei.mvpdemo.mvp.simple.base.MvpView;

/**
 * Created by A on 2017/9/7.
 */

public interface MvpLceView<D> extends MvpView{
    /**
     * 开始加载
     * @param isPullRefresh 普通页面、下拉刷新组件
     */
    void showLoading(boolean isPullRefresh);

    /**
     * 开始内容
     * @param isPullRefresh 普通页面、下拉刷新组件
     */
    void showContent(boolean isPullRefresh);

    /**
     * 开始错误
     * @param isPullRefresh 普通页面、下拉刷新组件
     */
    void showError(boolean isPullRefresh);

    /**
     * 绑定数据
     * @param bean
     */
    void bindData(D bean);

    /**
     * 加载数据
     * @param isPullRefresh
     */
    void loadData(boolean isPullRefresh);
}
