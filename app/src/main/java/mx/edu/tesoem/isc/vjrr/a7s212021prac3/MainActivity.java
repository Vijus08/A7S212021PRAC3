package mx.edu.tesoem.isc.vjrr.a7s212021prac3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] StrEstados;
    List listEstado;
    ArrayAdapter<String> adaptador;

    Spinner spEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spEstados = findViewById(R.id.sp_estados_D);
        StrEstados = new String[]{"Ciudad de México", "Jalisco", "Nuevo León", "Durango", "Puebla", "Tabasco"};
        listEstado = new ArrayList<String>();

        Collections.addAll(listEstado, StrEstados);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listEstado);
        spEstados.setAdapter(adaptador);
        spEstados.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String valor = spEstados.getSelectedItem().toString();
        Toast.makeText(this, "Usted Seleccionó " + valor, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}