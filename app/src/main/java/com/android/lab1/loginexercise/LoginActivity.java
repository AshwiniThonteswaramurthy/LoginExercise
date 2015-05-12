package com.android.lab1.loginexercise;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

    private EditText etEmailAddress;
    private EditText etPassword;
    private final String email = "ashwini@codepath.com";
    private final String password = "codepath";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmailAddress = (EditText) findViewById(R.id.etEmailAddress);
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void cancelLogin(View view) {
        etEmailAddress.setText("");
        etPassword.setText("");
        Toast.makeText(this, "Cancel!", Toast.LENGTH_SHORT).show();

    }

    public void login(View view) {

        String loginEmail = String.valueOf(etEmailAddress.getText());
        String loginPassword = String.valueOf(etPassword.getText());
        if (email.equals(loginEmail) && password.equals(loginPassword)) {
            Toast.makeText(this, "Login Success!!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Login Failure!!!", Toast.LENGTH_SHORT).show();
            etEmailAddress.setText("");
            etPassword.setText("");
        }
    }

    public void recoverPassword(View view) {
        Toast.makeText(this, "Hint: Where are you doing your course?", Toast.LENGTH_SHORT).show();
    }
}
