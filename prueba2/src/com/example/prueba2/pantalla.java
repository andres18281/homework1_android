package com.example.prueba2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pantalla extends Activity {
	static String s1;
	static String s2;
	static String s3;
	static String s4;
	static String s5;
	static String s6;
	static String s7;
	public static TextView t1;
	public TextView t2;
	public TextView t3;
	public TextView t4;
	public TextView t5;
	public TextView t6;
	public TextView t7;
	 
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla);
         Intent intent = getIntent();
         String l1,l2,l3,l4,l5,l6,l7;
         l1 = intent.getStringExtra(s1);
         l2 = intent.getStringExtra(s2);
         l3 = intent.getStringExtra(s3);
         l4 = intent.getStringExtra(s4);
         l5 = intent.getStringExtra(s5);
         l6 = intent.getStringExtra(s6);
         l7 = intent.getStringExtra(s7);
         
        t1 = (TextView)findViewById(R.id.nombre);
        t2 = (TextView)findViewById(R.id.direccion);
        t3 = (TextView)findViewById(R.id.telefono);
        t4 = (TextView)findViewById(R.id.horarios);
        t5 = (TextView)findViewById(R.id.horarios2);
        t6 = (TextView)findViewById(R.id.webside);
        t7 = (TextView)findViewById(R.id.email);
        t1.setText(l1);
        t2.setText(l2);
        t3.setText(l3);
        t4.setText(l4);
        t5.setText(l5);
        t6.setText(l6);
        t7.setText(l7);
        
	}

}
