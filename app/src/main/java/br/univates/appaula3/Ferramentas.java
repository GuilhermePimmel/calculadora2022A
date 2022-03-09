package br.univates.appaula3;

import android.content.Context;

import android.util.Log;

import androidx.appcompat.app.AlertDialog;


public class Ferramentas {

    public static void mostrarAlerta(Context context, String titulo, String mensagem){
    try{

        AlertDialog.Builder dialog = new AlertDialog.Builder(context);

        dialog.setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK",null)
                .show();
    }catch(Exception ex){
        Log.e("mostrarAlerta",ex.getMessage());
    }

}
}
