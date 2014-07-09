package me.lile.testIntentAction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MyActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button btn_ok = (Button) findViewById(R.id.btn_ok);
        final EditText et_user = (EditText) findViewById(R.id.et_user);
        final EditText et_pwd = (EditText) findViewById(R.id.et_pwd);

        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.tb_style);
        btn_ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent m_intent;
                if (toggleButton.isChecked()) {
                    m_intent = new Intent(MyActivity.this, LoginActivity.class);
                } else {
                    m_intent = new Intent();
                }
                m_intent.putExtra("username", et_user.getText().toString());
                m_intent.putExtra("password", et_pwd.getText().toString());
                m_intent.setAction("me.lile.login");
                m_intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(m_intent);
            }
        });

    }
}
