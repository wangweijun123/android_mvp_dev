package com.nsu.edu.androidmvpdemo.register;

/**
 * Created by wangweijun on 2017/11/16.
 */

public interface RegisterModel {
    void register(String userName, String pwd, OnRegisterFinishedListener listener);
}
