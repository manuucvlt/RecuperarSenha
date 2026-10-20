package com.example.techway;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtNovaSenha;
    private EditText edtConfirmarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        inicializarComponentes();
    }

    private void inicializarComponentes() {

        edtEmail = findViewById(R.id.edtEmail);

        edtNovaSenha = findViewById(R.id.edtNovaSenha);

        edtConfirmarSenha =
                findViewById(R.id.edtConfirmarSenha);
    }
}