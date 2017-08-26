package xyz.fouroneone.yolla.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import xyz.fouroneone.yolla.infrastructure.YollaApplication;

public abstract class BaseActivity extends AppCompatActivity {
    protected YollaApplication application;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);
        application = (YollaApplication) getApplication();
    }
}
