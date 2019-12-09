package com.example.juanchicaiza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Resumen extends AppCompatActivity {

    EditText usuarioConectado, nombreConectado, resumen, respuestaFut, respuestaTen, respuestaBalo,
            respuestaSi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        usuarioConectado=findViewById(R.id.etUContectado);
        nombreConectado=findViewById(R.id.etNombreCon);
        resumen=findViewById(R.id.etRespuesta);
        respuestaFut=findViewById(R.id.etFut);
        respuestaTen=findViewById(R.id.etTen);
        respuestaBalo=findViewById(R.id.etBalo);
        respuestaSi=findViewById(R.id.etSiNo);


        String recibirNombre = getIntent().getStringExtra("Juan");
        String recibirFut = getIntent().getStringExtra("");
        String recibirTen = getIntent().getStringExtra("");
        String recibirBalo = getIntent().getStringExtra("");
        String recibirSiNo = getIntent().getStringExtra("");

        usuarioConectado.setText(recibirNombre);
    }


}
