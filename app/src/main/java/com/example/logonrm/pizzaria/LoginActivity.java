package com.example.logonrm.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.logonrm.pizzaria.R.id.etLogin;
import static com.example.logonrm.pizzaria.R.id.etSenha;


public class LoginActivity extends AppCompatActivity {
    private TextInputLayout TilLogin;
    private TextInputLayout TilSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//Recuperar os componentes da tela (xml)
        TilLogin = (TextInputLayout) findViewById(R.id.TilLogin);
        TilSenha = (TextInputLayout) findViewById(R.id.TilSenha);
    }

    //Clique do botão
    public void logar(View view) {
//Recuperar os valores digitados
        String login = TilLogin.getEditText().getText().toString();
        String senha = TilSenha.getEditText().getText().toString();
//Valida o usuário e senha
        if (login.equals("FIAP") && senha.equals("123")) {
//Mudar de tela Tela de Destino
            Intent intent = new Intent(this, PedidoActivity.class);
//Passar uma valor para a outra tela
            intent.putExtra("usuario", login);
//Iniciar a outra tela
            startActivity(intent);
            finish();
        } else {
//Login ou senha inválidos
            TilSenha.setError(getString(R.string.txt_error));
        }
    }
}