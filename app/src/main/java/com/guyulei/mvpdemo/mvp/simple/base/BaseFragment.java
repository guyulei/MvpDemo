package com.guyulei.mvpdemo.mvp.simple.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by 12539 on 2017/9/6.
 */

public abstract class BaseFragment<V extends BaseView, P extends BasePresent<V>> extends Fragment {
    private P present;
    private V view;

    public P getPresneter() {
        return this.present;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (present == null) {
            this.present = creatPresent();//子类创建present
        }
        if (view == null) {
            this.view = creatView();//子类创建v层
        }
        if (present == null) {
            throw new NullPointerException("present 不能为空！");
        }
        if (view == null) {
            throw new NullPointerException("view 不能为空！");
        }
        //绑定
        this.present.attachview(this.view);
    }

    public abstract V creatView();

    public abstract P creatPresent();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        present.detachview();
    }
}
