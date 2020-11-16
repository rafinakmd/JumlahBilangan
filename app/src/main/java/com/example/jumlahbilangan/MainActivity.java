package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<Botton> extends AppCompatActivity {

    private EditText bil;
    private EditText bil2;
    private EditText jml;
    private Button btnhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        bil = (EditText) findViewById(R.id.editText);
        bil2 = (EditText) findViewById(R.id.editText2);
        jml = (EditText) findViewById(R.id.editText4);
        btnhasil = (Button) findViewById(R.id.button);
    }

    private void initEvent() {
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah() {
        int angka1 = Integer.parseInt( bil.getText().toString());
        int angka2 = Integer.parseInt( bil2.getText().toString());
        int total  = angka1 + angka2;
        jml.setText(total + "");
    }

}
