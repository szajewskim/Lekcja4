package com.example.marek.lekcja4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
/**
 * Created by Marek on 03.04.2017.
 */

public class Quiz extends Activity {
    int licznik;

    public void wys() {
        Context context = getApplicationContext();
        CharSequence text = "Liczba punktów: " + licznik;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        RadioButton narwal = (RadioButton) findViewById(R.id.radioButton2);
        narwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                licznik++;

            }
        });

        RadioButton niebo = (RadioButton) findViewById(R.id.radioButton3);
        niebo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                licznik++;

            }
        });

        RadioButton dab = (RadioButton) findViewById(R.id.radioButton5);
        dab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                licznik++;

            }
        });

        RadioButton tulipany = (RadioButton) findViewById(R.id.radioButton8);
        tulipany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                licznik++;

            }
        });

        RadioButton wiadukt = (RadioButton) findViewById(R.id.radioButton9);
        wiadukt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                licznik++;

            }
        });

        Button start = (Button) findViewById(R.id.button2);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wys();

            }
        });

    }

}
