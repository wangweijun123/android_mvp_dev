package com.nsu.edu.androidmvpdemo.register;

/**
 * Created by wangweijun on 2017/11/15.
 *
 */

public interface RegisterPresenter {
    void validate(String userName, String pwd, String pwdAgain);
}
