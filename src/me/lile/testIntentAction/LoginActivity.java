package me.lile.testIntentAction;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by lee.
 *
 * @author lee
 * @since 2014-07-09
 */
public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getBaseContext(),
                       "normal: username: " + this.getIntent().getStringExtra("username") +
                       "\npassword: " + this.getIntent().getStringExtra("password"),
                       Toast.LENGTH_SHORT).show();
    }
}
