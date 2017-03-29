package com.example.android.tallerenclases;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView Resultado;
    private Bundle b;
    private String aux, material,dije,tipo, pago;
    private Resources res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Resultado = (TextView)findViewById(R.id.txtResultado);

        b = getIntent().getExtras();
        material = b.getString("Material");
        dije = b.getString("Dije");
        tipo = b.getString("Tipo");
        pago = b.getString("Pagar_En");

        res = this.getResources();

        aux = aux+"\n"+"Tus Datos Son:";
        aux = aux+"\n\n"+"Material"+":"+material;
        aux = aux+"\n\n"+"Dije"+":"+dije;
        aux = aux+"\n\n"+"Tipo"+":"+tipo;
        aux = aux+"\n\n"+"Pagar_En"+":"+pago;


        Resultado.setText(aux);

    }
}
