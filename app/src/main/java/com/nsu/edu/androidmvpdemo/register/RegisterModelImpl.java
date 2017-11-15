package com.nsu.edu.androidmvpdemo.register;


import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by wangweijun on 2017/11/16.
 */

public class RegisterModelImpl implements RegisterModel {
    @Override
    public void register(final String userName, final String pwd, final OnRegisterFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(userName)){
                    listener.onError();//model层里面回调listener
                    error = true;
                }

                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
