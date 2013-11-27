package com.example.prueba2;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);  
    	 ListView lisvi;
    	 setContentView(R.layout.activity_main);	
    	 ArrayList<String> array = new ArrayList<String>();
            array.add("Almacen SPORT");
            array.add("Almacen ADIDAS");
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, array);
            lisvi = (ListView)findViewById(R.id.lista);
            lisvi.setAdapter(arrayAdapter); 
            final List<String> lista = new ArrayList<String>();
            lista.add("Almacenes Sport");
            lista.add("Carrera 6 A 48 - 50");
            lista.add("6625467");
            lista.add("Lunes  a viernes");
            lista.add("de 8:00 AM a 9:00 PM");
            lista.add("www.adidas.com");
            lista.add("calzadoAdidas@adidas.com");
            
            final List<String> lista2 = new ArrayList<String>();
            lista2.add("Almacenes Sport");
            lista2.add("Carrera 7 A 50 - 50");
            lista2.add("7625787");
            lista2.add("Lunes  a viernes");
            lista2.add("de 8:00 AM a 9:00 PM");
            lista2.add("www.Sport.com");
            lista2.add("calzadoSport@Sport.com");
            
            lisvi.setOnItemClickListener(new OnItemClickListener(){	
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int posicion, long arg3) {
					Intent intent = new Intent(getApplicationContext(),pantalla.class);
					if(posicion == 0){
						intent.putExtra(pantalla.s1,lista2.get(0));
						intent.putExtra(pantalla.s2, lista2.get(1));
						intent.putExtra(pantalla.s3, lista2.get(2));
						intent.putExtra(pantalla.s4, lista2.get(3));
						intent.putExtra(pantalla.s5, lista2.get(4));
						intent.putExtra(pantalla.s6, lista2.get(5));
						intent.putExtra(pantalla.s7, lista2.get(6));
					}if(posicion == 1){
						intent.putExtra(pantalla.s1,lista2.get(0));
						intent.putExtra(pantalla.s2, lista.get(1));
						intent.putExtra(pantalla.s3, lista.get(2));
						intent.putExtra(pantalla.s4, lista.get(3));
						intent.putExtra(pantalla.s5, lista.get(4));
						intent.putExtra(pantalla.s6, lista.get(5));
						intent.putExtra(pantalla.s7, lista.get(6));	
					}
					
				}
			
            
            });
            	
          
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
