package com.example.arien.lesson2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_menu, editText_porsi;
    TextView textView_tempat, textView_menu, textView_porsi, textView_harga;
    Button bEatbus, bAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_menu = (EditText) findViewById(R.id.editTextMenu);
        editText_porsi = (EditText) findViewById(R.id.editTextPorsi);
        textView_tempat = (TextView) findViewById(R.id.textViewTempat);
        textView_menu = (TextView) findViewById(R.id.textViewMenu);
        textView_porsi = (TextView) findViewById(R.id.textViewPorsi);
        textView_harga = (TextView) findViewById(R.id.textViewHarga);
        bEatbus = (Button) findViewById(R.id.buttonEatbus);
        bAbnormal = (Button) findViewById(R.id.buttonAbnormal);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int uang = 65500;
        String uOsas = String.valueOf(uang);
        intent.putExtra("uOsas", uOsas);

        String namaTempat = "Eatbus";
        intent.putExtra("namaTempat", namaTempat);

        String menu = editText_menu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = editText_porsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);


    }

    public void apnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int uang = 65500;
        String uOsas = String.valueOf(uang);
        intent.putExtra("uOsas", uOsas);

        String namaTempat = "Abnormal";
        intent.putExtra("namaTempat", namaTempat);;

        String menu = editText_menu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = editText_porsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }
}
