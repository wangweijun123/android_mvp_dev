package com.nsu.edu.androidmvpdemo.register;

import android.text.TextUtils;

/**
 * Created by wangweijun on 2017/11/15.
 * Presenter 拥有view(activity 中的UI控件) 与 model(获取到的数据，比如数据库，网络，文件等等)，所以能刷新界面
 */

public class RegisterPresenterImpl implements RegisterPresenter {

    private RegisterView registerView;
    private RegisterModel registerModel;

    RegisterPresenterImpl(RegisterView registerView) {
        this.registerView = registerView;
        registerModel = new RegisterModelImpl();
    }


    @Override
    public void validate(String userName, String pwd, String pwdAgain) {
        if (TextUtils.isEmpty(userName)) {
            registerView.showUserNameError(); 
            return;
        }
        registerModel.register(userName, pwd, new OnRegisterFinishedListener() {
            @Override
            public void onSuccess() {
                registerView.showRegisterSuccess();
            }

            @Override
            public void onError() {

            }
        });

    }
}
