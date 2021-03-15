package com.example.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }
    private void setupViews(){
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        res = findViewById(R.id.textView2);
    }
    private void btn_OnClick(View view){

        double h,w;
        h= Double.parseDouble(height.getText().toString());
        w= Double.parseDouble(weight.getText().toString());
        res.setText(w / (h*h) + "kg/m2");
        res.setVisibility(View.VISIBLE);
    }
}