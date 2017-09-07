package com.guyulei.mvpdemo.mvp.simple3;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.guyulei.mvpdemo.mvp.simple.MvpActivity;
import com.guyulei.mvpdemo.mvp.simple.base.MvpPresent;
import com.guyulei.mvpdemo.mvp.simple.base.MvpView;
import com.guyulei.mvpdemo.mvp.simple3.lce.MvpLceAnimator;

/**
 * Created by A on 2017/9/7.
 */

public class MvpLceActivity<D, V extends MvpView, P extends MvpPresent<V>> extends MvpActivity<V, P> implements MvpLceView<D> {

    //持有目标对象引用
    private MvpLceViewImpl<D> lceView;

    private MvpLceViewImpl<D> getLceView() {
        if (lceView == null){
            lceView = new MvpLceViewImpl<D>();
        }
        return lceView;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化View
        getLceView().initView(getWindow().getDecorView());
    }

    //动态指定动画策略
    public void setLceAnimator(MvpLceAnimator mvpLceAnimator){
        getLceView().setLceAnimator(mvpLceAnimator);
    }

    @Override
    public void showLoading(boolean isPullRefresh) {
        getLceView().showLoading(isPullRefresh);
    }

    @Override
    public void showContent(boolean isPullRefresh) {
        getLceView().showContent(isPullRefresh);
    }

    @Override
    public void showError(boolean isPullRefresh) {
        getLceView().showError(isPullRefresh);
    }

    @Override
    public void bindData(D bean) {
        getLceView().bindData(bean);
    }

    @Override
    public void loadData(boolean isPullRefresh) {
        getLceView().loadData(isPullRefresh);
    }
}
