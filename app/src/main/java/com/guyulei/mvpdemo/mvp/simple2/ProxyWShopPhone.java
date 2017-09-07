package com.guyulei.mvpdemo.mvp.simple2;

//代理对象
//特点一：实现目标接口
//特点二：持有目标对象引用
public class ProxyWShopPhone implements IShopPhone {

    private IShopPhone shopPhone;

    public ProxyWShopPhone( IShopPhone shopPhone){
        this.shopPhone = shopPhone;
    }

    @Override
    public void shopPhone(String phoneName) {
        //控制对象访问权限(用户权限管理)
        //逻辑处理
        this.shopPhone.shopPhone(phoneName);
    }
}
