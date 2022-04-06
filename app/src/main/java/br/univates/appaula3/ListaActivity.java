package br.univates.appaula3;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    FloatingActionButton fabAdd;
    ListView listaLinguagensView;
    Context context;
    ArrayList<String> objlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        context = ListaActivity.this;

        fabAdd = findViewById(R.id.fabAdicionar_lista);
        listaLinguagensView = findViewById(R.id.listViewListaLinguagens_lista);

        objlista = new ArrayList;

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    objlista.add("Novo item")
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, objlista);

                    listaLinguagensView.setAdapter(adapter);

                }catch (Exception ex)(
                    Globais.exibirMensagem(context, ex.getMessage())

                )

            }
        });

    }

}