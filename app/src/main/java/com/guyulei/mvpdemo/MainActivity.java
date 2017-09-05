package com.guyulei.mvpdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.guyulei.mvpdemo.mvp.simple.LoginPresent;
import com.guyulei.mvpdemo.mvp.simple.LoginView;
import com.guyulei.mvpdemo.mvp.simple.base.BaseActivity;
//

public class MainActivity extends BaseActivity<LoginView, LoginPresent> implements LoginView, View.OnClickListener {


    //  "http://www.amallb2b.com/app/Home/Login/Login", "15958121433", "000000"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public LoginView creatView() {
        return this;
    }

    @Override
    public LoginPresent creatPresent() {
        return new LoginPresent();
    }

    @Override
    public void onShowData(String result) {
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        getPresneter().login("15958121433", "000000");
    }
}
