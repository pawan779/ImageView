package com.pawan.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton btnRonaldo, btnMessi,btnKane;
    ImageView imgPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRonaldo=findViewById(R.id.btnRonaldo);
        btnMessi=findViewById(R.id.btnMessi);
        btnKane=findViewById(R.id.btnkane);
        imgPlayer=findViewById(R.id.imgPlayer);

        btnRonaldo.setOnClickListener(this);
        btnMessi.setOnClickListener(this);
        btnKane.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnRonaldo:
            imgPlayer.setImageResource(R.drawable.ronaldo);
            break;

            case R.id.btnMessi:
                imgPlayer.setImageResource(R.drawable.messi);
                break;

            case R.id.btnkane:
                imgPlayer.setImageResource(R.drawable.kane);
                break;

        }
    }
}
