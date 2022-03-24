package br.univates.appaula3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class telaprincipalActivity extends AppCompatActivity {

    Button btntela3;
    Button btntoast;
    Button btnsnack;
    LinearLayout snack;
    Context context;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaprincipal);

        sharedPreferences = getSharedPreferences("");
        btntela3 = findViewById(R.id.btntela3_telaprincipal);
        btntoast = findViewById(R.id.btntoast_telaprincipal);
        btnsnack = findViewById(R.id.btnsnack_telaprincipal);
        snack = findViewById(R.id.snack);
        context = telaprincipalActivity.this;

        btntela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, botoesActivity.class);
                startActivity(intent);
            }
        });

        btnsnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(snack,"MENSAGEM SNACK", Snackbar.LENGTH_SHORT).show();
            }
        });
        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "MENSAGEM TOAST", Toast.LENGTH_SHORT).show();
            }
        });

    }
}