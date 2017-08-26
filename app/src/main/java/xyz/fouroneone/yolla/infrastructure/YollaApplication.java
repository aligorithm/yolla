package xyz.fouroneone.yolla.infrastructure;

import android.app.Application;

public class YollaApplication extends Application {
    private Auth auth;

    @Override
    public void onCreate(){
        super.onCreate();
        auth = new Auth(this);
    }

    public Auth getAuth() {
        return auth;
    }
}
