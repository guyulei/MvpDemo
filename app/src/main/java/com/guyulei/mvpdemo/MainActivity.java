package com.guyulei.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.guyulei.mvpdemo.mvp.simple.MvpActivity;
import com.guyulei.mvpdemo.mvp.simple.login.LoginPresent;
import com.guyulei.mvpdemo.mvp.simple.login.LoginView;

public class MainActivity extends MvpActivity<LoginView, LoginPresent> implements LoginView, View.OnClickListener {
    //  "http://www.amallb2b.com/app/Home/Login/Login", "15958121433", "000000"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onShowData(String result) {
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        getPresenter().login("15958121433", "000000");
        //测试
        /*UnderShopPhone underShopPhone = new UnderShopPhone();
        ProxyWShopPhone proxyWShopPhone = new ProxyWShopPhone(underShopPhone);
        proxyWShopPhone.shopPhone("买了IPhone8，花了7880");*/

    }

    @Override
    public LoginPresent CreatePresenter() {
        return new LoginPresent();
    }

    @Override
    public LoginView CreateView() {
        return this;
    }
}
