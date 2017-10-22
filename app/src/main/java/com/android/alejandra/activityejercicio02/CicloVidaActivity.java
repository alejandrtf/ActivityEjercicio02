package com.android.alejandra.activityejercicio02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CicloVidaActivity extends Activity {
	TextView estadoActual;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ciclo_vida);
		
		//referencio el textview
		estadoActual=(TextView) findViewById(R.id.lbl_estadoActual);
		
		MainActivity.estados+="\nCreada";
		estadoActual.setText(MainActivity.estados);
		Log.d("CICLO VIDA ACTIVITY","Creada");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		
		super.onRestoreInstanceState(savedInstanceState);
		MainActivity.estados+="\nRestaurando estado...........";
		estadoActual.setText(MainActivity.estados);
		Log.d("CICLO VIDA ACTIVITY","Restaurando estado..............");
		Log.d("CICLO VIDA ACTIVITY","Texto restaurado:...."+savedInstanceState.getString("prueba"));
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		
		super.onSaveInstanceState(outState);
		outState.putString("prueba", "texto de prueba");
		MainActivity.estados+="\nGrabando estado...........";
		estadoActual.setText(MainActivity.estados);
		Log.d("CICLO VIDA ACTIVITY","Grabando estado..............");
	}

	@Override
	protected void onDestroy() {
		
		super.onDestroy();
		Log.d("CICLO VIDA ACTIVITY","Destruida");
	}

	
	@Override
	protected void onPause() {
		
		super.onPause();
		MainActivity.estados+="\nPausada";
		estadoActual.setText(MainActivity.estados);
		Log.d("CICLO VIDA ACTIVITY","Pausada");
	}

	@Override
	protected void onResume() {
	
		super.onResume();
		MainActivity.estados+="\nRunning";
		estadoActual.setText(MainActivity.estados);
		Log.d("CICLO VIDA ACTIVITY","Running");
	}

	@Override
	protected void onStop() {
		
		super.onStop();
		MainActivity.estados+="\nParada";
		estadoActual.setText(MainActivity.estados);
		Log.d("CICLO VIDA ACTIVITY","Parada");
	}
	
	
}
