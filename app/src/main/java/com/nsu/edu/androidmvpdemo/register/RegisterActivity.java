package com.nsu.edu.androidmvpdemo.register;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.nsu.edu.androidmvpdemo.R;

/**
 * Created by wangweijun on 2017/11/15.
 */

public class RegisterActivity extends Activity implements View.OnClickListener, RegisterView {
    private ProgressBar progressBar;
    private EditText username;
    private EditText password, password_again;

    private RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        password_again = (EditText) findViewById(R.id.password_again);
        findViewById(R.id.button).setOnClickListener(this);

        registerPresenter = new RegisterPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                registerPresenter.validate(username.getText().toString(),
                        password.getText().toString(), password_again.getText().toString());
                break;
            default:
                break;
        }
    }

    @Override
    public void showUserNameError() {
        Toast.makeText(getApplicationContext(), "用户名错误", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showRegisterSuccess() {
        Toast.makeText(getApplicationContext(), "注册成功", Toast.LENGTH_LONG).show();
    }
}
