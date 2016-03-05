package com.example.joaohercules.roteiro3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TraduzFrances extends AppCompatActivity {

    private TextView mCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduz_frances);
        mCor = (TextView)findViewById(R.id.cor);
        Bundle bundle = getIntent().getExtras();
        String cor = bundle.getString("texto");
        if(cor.equalsIgnoreCase("azul")){
            mCor.setText("Cor " + cor + " em francês: Bleu");
        }else if(cor.equalsIgnoreCase("amarelo")){
            mCor.setText("Cor " + cor + " em francês: Jaune");
        }else{
            mCor.setText("Cor " + cor + " em francês: Rouge");
        }
        ((Button)findViewById(R.id.btn4)).setOnClickListener(new onClick());
    }

    private class onClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            finish();
        }
    }
}