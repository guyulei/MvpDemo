package com.guyulei.mvpdemo.mvp.simple3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.guyulei.mvpdemo.mvp.simple.MvpFragment;
import com.guyulei.mvpdemo.mvp.simple.base.MvpPresent;
import com.guyulei.mvpdemo.mvp.simple.base.MvpView;
import com.guyulei.mvpdemo.mvp.simple3.lce.MvpLceAnimator;

//LCE->代理模式
//代理对象->MvpLceActivity
public abstract class MvpLceFragment<D, V extends MvpView, P extends MvpPresent<V>> extends MvpFragment<V, P> implements MvpLceView<D> {

    //持有目标对象引用
    private MvpLceViewImpl<D> lceView;

    private MvpLceViewImpl<D> getLceView() {
        if (lceView == null){
            lceView = new MvpLceViewImpl<D>();
        }
        return lceView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getLceView().initView(view);
    }

    //动态指定动画策略
    public void setLceAnimator(MvpLceAnimator mvpLceAnimator){
        getLceView().setLceAnimator(mvpLceAnimator);
    }

    @Override
    public void showContent(boolean isPullRefresh) {
        getLceView().showContent(isPullRefresh);
    }

    @Override
    public void showLoading(boolean isPullRefresh) {
        getLceView().showLoading(isPullRefresh);
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
