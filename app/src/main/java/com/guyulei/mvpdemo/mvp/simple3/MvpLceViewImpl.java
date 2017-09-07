package com.guyulei.mvpdemo.mvp.simple3;

import android.view.View;

import com.guyulei.mvpdemo.R;
import com.guyulei.mvpdemo.mvp.simple3.lce.MvpLceAnimator;
import com.guyulei.mvpdemo.mvp.simple3.lce.MvpLceDefaultAnimator;

/**
 * Created by A on 2017/9/7.
 * //目标对象
 */

public class MvpLceViewImpl<D> implements MvpLceView<D> {

    private View           loadingView;
    private View           contentVeiw;
    private View           errorView;
    //
    private MvpLceAnimator lceAnimator;

    public void setLceAnimator(MvpLceAnimator lceAnimator) {
        this.lceAnimator = lceAnimator;
    }

    public MvpLceAnimator getLceAnimator() {
        if (this.lceAnimator == null) {
            this.lceAnimator = new MvpLceDefaultAnimator();
        }
        return lceAnimator;
    }

    public void initView(View rootView) {
        if (loadingView == null) {
            this.loadingView = rootView.findViewById(R.id.loadingView);
        }
        if (contentVeiw == null) {
            this.contentVeiw = rootView.findViewById(R.id.contentView);
        }
        if (errorView == null) {
            this.errorView = rootView.findViewById(R.id.errorView);
        }
    }

    @Override
    public void showLoading(boolean isPullRefresh) {
        if (!isPullRefresh) {
            getLceAnimator().showLoadingView(loadingView, contentVeiw, errorView);
        }
    }

    @Override
    public void showContent(boolean isPullRefresh) {
        if (!isPullRefresh){
            getLceAnimator().showContentView(loadingView, contentVeiw, errorView);
        }
    }

    @Override
    public void showError(boolean isPullRefresh) {
        if (!isPullRefresh){
            getLceAnimator().showErrorView(loadingView, contentVeiw, errorView);
        }
    }

    @Override
    public void bindData(D bean) {

    }

    @Override
    public void loadData(boolean isPullRefresh) {

    }
}
