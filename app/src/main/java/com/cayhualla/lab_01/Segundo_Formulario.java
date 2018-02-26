package com.cayhualla.lab_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Segundo_Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo__formulario);
        Spinner spinner0=(Spinner) findViewById(R.id.spinner);

        Spinner spinner=(Spinner) findViewById(R.id.spinner6);
        Spinner spinner1=(Spinner) findViewById(R.id.spinner7);
        Spinner spinner2=(Spinner) findViewById(R.id.spinner8);
        Spinner spinner3=(Spinner) findViewById(R.id.spinner9);
        Spinner spinner4=(Spinner) findViewById(R.id.spinner10);



        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(Segundo_Formulario.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(myAdapter);
//
        ArrayAdapter<String> myAdapter2=new ArrayAdapter<String>(Segundo_Formulario.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.fecha));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter2);
        spinner2.setAdapter(myAdapter2);

        //

        ArrayAdapter<String> myAdapter3=new ArrayAdapter<String>(Segundo_Formulario.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.hora));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter3);
        spinner3.setAdapter(myAdapter3);

        //

        ArrayAdapter<String> myAdapter4=new ArrayAdapter<String>(Segundo_Formulario.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.correo));
        myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner0.setAdapter(myAdapter4);

    }
}
