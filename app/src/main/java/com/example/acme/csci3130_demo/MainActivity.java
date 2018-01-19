package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button btCopy;
    private EditText tbHello, tbHello2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCopy = findViewById(R.id.btCopy);
        tbHello = findViewById(R.id.tbHello);
        tbHello2 = findViewById(R.id.tbHello2);

        btCopy.setOnClickListener(new View.OnClickListener() {
            public  void onClick(View v) {
                tbHello2.setText(tbHello.getText());
            }
        });
    }
}
