package com.guyulei.mvpdemo.mvp.simple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.guyulei.mvpdemo.mvp.simple.base.BaseFragment;

/**
 * Created by 12539 on 2017/9/6.
 */

public class LoginFragment extends BaseFragment<LoginView,LoginPresent>  implements LoginView{

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresneter().login("15958121433", "000000");
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
        Toast.makeText(getContext(), result, Toast.LENGTH_SHORT).show();
    }
}
