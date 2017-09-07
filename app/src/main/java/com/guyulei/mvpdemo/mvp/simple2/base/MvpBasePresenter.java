package com.guyulei.mvpdemo.mvp.simple2.base;


/**
 * 作者: Dream on 2017/9/4 21:35
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

public class MvpBasePresenter<V extends MvpView> implements MvpPresent<V> {

    private V view;

    public V getView() {
        return view;
    }

    @Override
    public void attachview(V view) {
        this.view = view;
    }

    @Override
    public void detachview() {
        this.view = null;
    }
}

/*public class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V view;

    public V getView() {
        return view;
    }

    public void attachView(V view){
        this.view = view;
    }

    public void detachView(){
        this.view = null;
    }


}*/
