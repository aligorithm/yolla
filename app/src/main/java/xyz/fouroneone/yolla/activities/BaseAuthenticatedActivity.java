package xyz.fouroneone.yolla.activities;

import android.content.Intent;
import android.os.Bundle;

public abstract class BaseAuthenticatedActivity extends BaseActivity {
    @Override
    protected final void onCreate(Bundle savedState){
        super.onCreate(savedState);

        if (!application.getAuth().getUser().isLoggedIn()){
            startActivity(new Intent(this,LoginActivity.class));
            finish();
            return;
        }
        onYollaCreate(savedState);
    }

    protected abstract void onYollaCreate(Bundle savedState);
}
