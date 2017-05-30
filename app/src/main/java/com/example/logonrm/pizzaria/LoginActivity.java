package com.example.logonrm.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etLogin;
    private EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//Recuperar os componentes da tela (xml)
        etLogin = (EditText) findViewById(R.id.etLogin);
        etSenha = (EditText) findViewById(R.id.etSenha);
    }

    //Clique do botão
    public void logar(View view) {
//Recuperar os valores digitados
        String login = etLogin.getText().toString();
        String senha = etSenha.getText().toString();
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
            Toast.makeText(this, "Usuário ou senha inválidos",
                    Toast.LENGTH_SHORT).show();
        }
    }
}