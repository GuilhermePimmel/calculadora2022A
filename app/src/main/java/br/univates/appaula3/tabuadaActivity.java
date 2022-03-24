package br.univates.appaula3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tabuadaActivity extends AppCompatActivity {

  TextView lblTabuada;
  EditText txtTabuada;
  Button btnCalcular;
  Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);
        setTitle("Título");
        context = tabuadaActivity.this;
        lblTabuada=findViewById(R.id.lblTabuada_main);
        txtTabuada=findViewById(R.id.txtTabuada_main);
        btnCalcular=findViewById(R.id.btnCalcular_main);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tabuada = 0;
                String impressao = "";
                try {
                    tabuada = Integer.parseInt(txtTabuada.getText().toString());

                } catch (Exception ex){
                    Log.e("CALCULADORA", ex.getMessage());
                    Ferramentas.mostrarAlerta(context, "ALERTA", "Número errado");
                }
                for (int i = 0; i < 11; i++) {

                    int res = tabuada * i;
                    impressao += tabuada + "x" + i + "=" + res + "\n";
                }
                lblTabuada.setText(impressao);
            }

        });




    }
}

