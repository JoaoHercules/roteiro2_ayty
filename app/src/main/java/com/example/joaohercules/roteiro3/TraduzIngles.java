package com.example.joaohercules.roteiro3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TraduzIngles extends AppCompatActivity {

    private TextView mCor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduz_ingles);
        mCor = (TextView)findViewById(R.id.cor);
        Bundle bundle = getIntent().getExtras();
        String cor = bundle.getString("texto");
        if(cor.equalsIgnoreCase("azul")){
            mCor.setText("Tradução da cor "+ cor + " em inglês: Blue");
        }else if(cor.equalsIgnoreCase("amarelo")){
            mCor.setText("Tradução da cor " + cor + " em inglês: Yellow");
        }else{
            mCor.setText("Tradução da cor " + cor + " em inglês: Red");
        }
        ((Button)findViewById(R.id.btn5)).setOnClickListener(new onClick());

    }
    private class onClick implements View.OnClickListener{
        public void onClick(View v){
            finish();
        }
    }
}