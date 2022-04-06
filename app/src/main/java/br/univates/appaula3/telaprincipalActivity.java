package br.univates.appaula3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class telaprincipalActivity extends AppCompatActivity {

    Button btnsalvar, btntela3, btntoast, btnsnack, btnlista, btnexibir;
    LinearLayout snack;
    Context context;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaprincipal);

        btnexibir = findViewById(R.id.btnexibir_telaprincipal);
        btnsalvar = findViewById(R.id.btnpreference_telaprincipal);
        btnlista = findViewById(R.id.btnlista_telaprincipal);
        btntela3 = findViewById(R.id.btntela3_telaprincipal);
        btntoast = findViewById(R.id.btntoast_telaprincipal);
        btnsnack = findViewById(R.id.btnsnack_telaprincipal);
        snack = findViewById(R.id.snack);
        context = telaprincipalActivity.this;

        String chave_preference = getString(R.string.sharedpreferences);

        sharedPreferences = getSharedPreferences(chave_preference, MODE_PRIVATE);

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

        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ListaActivity.class);
                startActivity(intent);
            }
        });

        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             try {


                 SharedPreferences.Editor editor = sharedPreferences.edit();
                 editor.putString("usuário", "guilherme");
                 editor.apply();
             }catch (Exception ex){
                 Log.e("Erro ao gravar", ex.getMessage())
             }

            }
        });

    }
}