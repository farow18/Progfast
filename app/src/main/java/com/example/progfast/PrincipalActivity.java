package com.example.progfast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void Register(View view){
        Intent register = new Intent(this, com.example.progfast.register.class);
        startActivity(register);
    }

    public void forgot (View view){
        Intent forgot = new Intent(this,forgot_pass.class);
        startActivity(forgot);
    }
}