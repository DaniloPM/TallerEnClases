package com.example.android.tallerenclases;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView Vista;
    private Bundle b;
    private String aux, material,dije,tipo, pago;
    private Resources res;
    private  int cien;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Vista = (TextView)findViewById(R.id.txtVista);

        b = getIntent().getExtras();
        material = b.getString("Material");
        dije = b.getString("Dije");
        tipo = b.getString("Tipo");
        pago = b.getString("Pagar_En");
        res = this.getResources();
        cien =100;

       // aux = aux+"\n"+"Tus Datos Son:";
        //aux = aux+"\n\n"+"Material"+":"+material;
        //aux = aux+"\n\n"+"Dije"+":"+dije;
        //aux = aux+"\n\n"+"Tipo"+":"+tipo;
        //aux = aux+"\n\n"+"Pagar_En"+":"+pago;


       // Mostrar.setText(aux);

    }

    if (material == "Cuero" && dije == "Martillo" && tipo == "Oro"){
        aux ="Valor A Pagar: "+Integer.parseInt(cantidad)*cien;

    }else if(material == "Cuero" && dije== "Martillo" && tipo == "Plata"){

    }
}
