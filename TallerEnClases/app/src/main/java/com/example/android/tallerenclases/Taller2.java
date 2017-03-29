package com.example.android.tallerenclases;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Taller2 extends AppCompatActivity {

private EditText txtMaterial;
    private EditText txtDije;
    private EditText txtTipo;
    private EditText txtPago;
    private Spinner comboTipo;
    private RadioButton r4, r5, r6, r7, r8, r9;
    private ArrayAdapter<String> adapter;
    private String[] opc;
    private Intent i;
    private Bundle b;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller2);

        //Capturamos Radios
        r4 = (RadioButton)findViewById(R.id.r4);
        r5 = (RadioButton)findViewById(R.id.r5);
        r6 = (RadioButton)findViewById(R.id.r6);
        r7 = (RadioButton)findViewById(R.id.r7);
        r8 = (RadioButton)findViewById(R.id.r8);
        r9 = (RadioButton)findViewById(R.id.r9);

        //capturar combo
        comboTipo = (Spinner)findViewById(R.id.cmdTipo);


        i = new Intent(this, Resultado.class);

        b = new Bundle();

        opc = this.getResources().getStringArray(R.array.Tipo);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);

        comboTipo.setAdapter(adapter);



    }

    public void Resultado(View v) {
        String material = " ", dije = " ", tipo, pago = " ";

        tipo = comboTipo.getSelectedItem().toString();

        if (r4.isChecked()) material = "Cuero";
        if (r5.isChecked()) material = "Cuerda";

        if (r6.isChecked()) material = "Ancla";
        if (r7.isChecked()) material = "Martillo";

        if (r8.isChecked()) material = "Pesos";
        if (r9.isChecked()) material = "Dolares";


        b.putString("Material", material);
        b.putString("Dije", dije);
        b.putString("Tipo", tipo);
        b.putString("Pagar_En", pago);

        i.putExtras(b);


    }
}
