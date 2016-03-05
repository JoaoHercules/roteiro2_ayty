package com.example.joaohercules.roteiro3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mCor;
    private Button mbtTraduzir;
    private Button mbtIngles;
    private Button mbtFrances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCor = (EditText)findViewById(R.id.cor);
        mbtTraduzir = (Button)findViewById(R.id.btTraduzir);
        mbtIngles = (Button)findViewById(R.id.btIngles);
        mbtFrances = (Button)findViewById(R.id.btFrances);



        mbtTraduzir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cor = mCor.getText().toString();
                if(cor.equalsIgnoreCase("AZUL")|| cor.equalsIgnoreCase("AMARELO") || cor.equalsIgnoreCase("VERMELHO")){
                    Bundle bundle = new Bundle();
                    bundle.putString("texto",cor);
                    Intent intent = new Intent("TRADUZIR");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else{
                    View focus = null;
                    mCor.setError("Cor não está cadastrada!");
                    focus = mCor;
                    focus.requestFocus();
                }

            }
        });

        mbtIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cor = mCor.getText().toString();
                if(cor.equalsIgnoreCase("AZUL")|| cor.equalsIgnoreCase("AMARELO") || cor.equalsIgnoreCase("VERMELHO")){
                    Intent intent = new Intent("TRADUZIR").addCategory("TRADUZIRINGLES");
                    Bundle bundle = new Bundle();
                    bundle.putString("texto",cor);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else{
                    View focus = null;
                    mCor.setError("Cor inválida!");
                    focus = mCor;
                    focus.requestFocus();
                }
            }
        });
        mbtFrances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cor = mCor.getText().toString();
                if (cor.equalsIgnoreCase("AZUL") || cor.equalsIgnoreCase("AMARELO") || cor.equalsIgnoreCase("VERMELHO")) {
                    Intent intent = new Intent("TRADUZIR").addCategory("TRADUZIRFRANCES");
                    Bundle bundle = new Bundle();
                    bundle.putString("texto", cor);
                    intent.putExtras(bundle);
                    startActivity(intent);

                } else {
                    View focus = null;
                    mCor.setError("Cor inválida!");
                    focus = mCor;
                    focus.requestFocus();
                }

            }
        });


    }


}