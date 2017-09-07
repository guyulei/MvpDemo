package com.guyulei.mvpdemo.mvp.simple2;

import android.util.Log;

//目标对象
//特点：实现目标接口
public class UnderShopPhone implements IShopPhone {

    @Override
    public void shopPhone(String phoneName) {
        Log.i("main", "手机 ： " + phoneName);
    }

}
