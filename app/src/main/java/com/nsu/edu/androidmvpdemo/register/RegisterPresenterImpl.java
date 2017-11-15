package com.nsu.edu.androidmvpdemo.register;

import android.text.TextUtils;

/**
 * Created by wangweijun on 2017/11/15.
 */

public class RegisterPresenterImpl implements RegisterPresenter {

    private RegisterView registerView;

    RegisterPresenterImpl(RegisterView registerView) {
        this.registerView = registerView;
    }


    @Override
    public void validate(String userName, String pwd, String pwdAgain) {
        if (TextUtils.isEmpty(userName)) {
            registerView.showUserNameError();
            return;
        }
    }
}
