package com.example.lieberson.passagemdeparametro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecebeFormulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_formulario);
        Intent intent = getIntent();

        if (intent != null) {
            Bundle params = intent.getExtras();

            if (params != null) {
                String nome = params.getString("nome");
                String email = params.getString("email");

                TextView nomeView = findViewById(R.id.recebeNome);
                TextView emailView = findViewById(R.id.recebeEmail);

                nomeView.setText(nome);
                emailView.setText(email);

            }

        }
    }

    public void voltar(View view) {
        finish();
    }

}


