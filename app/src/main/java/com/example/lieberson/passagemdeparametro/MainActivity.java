package com.example.lieberson.passagemdeparametro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarFormulario(View view) {

        EditText nome =  findViewById(R.id.campoNome);
        EditText email = findViewById(R.id.campoEmail);

        Bundle params = new Bundle();
        params.putString("nome", nome.getText().toString());
        params.putString("email", email.getText().toString());

        Intent intent = new Intent(this, RecebeFormulario.class);
        intent.putExtras(params);

        startActivity(intent);

    }
}
