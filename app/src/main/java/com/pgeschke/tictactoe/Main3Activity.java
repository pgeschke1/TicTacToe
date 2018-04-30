package com.pgeschke.tictactoe;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import yuku.ambilwarna.AmbilWarnaDialog;


public class Main3Activity extends AppCompatActivity {

    Button btnBackgroundColor;
    Button btnTextColor;
    int defaultColor;
    ConstraintLayout background3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnBackgroundColor = (Button)findViewById(R.id.btnBackgroundColor);
        btnTextColor = (Button)findViewById(R.id.btnTextColor);
        background3 = (ConstraintLayout)findViewById(R.id.activity_3_main);
        background3.setBackgroundColor(getResources().getColor(R.color.colorBackground));

        defaultColor = ContextCompat.getColor(Main3Activity.this, R.color.colorBackground);
        btnBackgroundColor.setBackgroundColor(getResources().getColor(R.color.colorBackground));
        btnBackgroundColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackgroundColorPicker(false);
            }
        });
        btnTextColor.setBackgroundColor(getResources().getColor(R.color.colorBackground));
        btnTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextColorPicker(false);
            }
        });
    }

    private void BackgroundColorPicker(boolean AlphaSupport) {

        AmbilWarnaDialog ambilWarnaDialog = new AmbilWarnaDialog(Main3Activity.this, defaultColor, AlphaSupport, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onOk(AmbilWarnaDialog ambilWarnaDialog, int newColor1) {

               defaultColor = newColor1;

                btnBackgroundColor.setBackgroundColor(newColor1);
                background3.setBackgroundColor(newColor1);
            }

            @Override
            public void onCancel(AmbilWarnaDialog ambilWarnaDialog) {

                Toast.makeText(Main3Activity.this, "Background Color Picker Closed", Toast.LENGTH_SHORT).show();
            }
        });
        ambilWarnaDialog.show();

    }
    private void TextColorPicker(boolean AlphaSupport) {

        AmbilWarnaDialog ambilWarnaDialog = new AmbilWarnaDialog(Main3Activity.this, defaultColor, AlphaSupport, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onOk(AmbilWarnaDialog ambilWarnaDialog, int newColor2) {

                defaultColor = newColor2;

                btnTextColor.setBackgroundColor(newColor2);
            }

            @Override
            public void onCancel(AmbilWarnaDialog ambilWarnaDialog) {

                Toast.makeText(Main3Activity.this, "Text Color Picker Closed", Toast.LENGTH_SHORT).show();
            }
        });
        ambilWarnaDialog.show();

    }

}
