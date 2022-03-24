package br.univates.appaula3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {

    Button btnLogar;
    EditText txtUser, txtPassword;
    Context context;
    String User = "Guilherme";
    String Pass = "abc123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context = loginActivity.this;
        txtUser = findViewById(R.id.txtUser_login);
        txtPassword = findViewById(R.id.txtPassword_login);
        btnLogar = findViewById(R.id.btnLogar_login);

        txtUser.requestFocus();

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtUser.getText().toString().equals(User) &&
                txtPassword.getText().toString().equals(Pass)){

                    Intent intent = new Intent(context, telaprincipalActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        });
    }
}