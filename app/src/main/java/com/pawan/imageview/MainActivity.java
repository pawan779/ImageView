package com.pawan.imageview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton btnRonaldo, btnMessi,btnKane;
    ImageView imgPlayer;
    AlertDialog.Builder builder;
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

        builder=new AlertDialog.Builder(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnRonaldo:

                        builder.setMessage("Do you want to show the image ?").setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        imgPlayer.setImageResource(R.drawable.ronaldo);
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();


                                    }
                                });
                        AlertDialog alert=builder.create();
                        alert.setTitle("Football PLayer");
                        alert.show();
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
