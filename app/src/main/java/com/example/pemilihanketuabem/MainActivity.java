package com.example.pemilihanketuabem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import  android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bem1btn;
    Button bem2btn;

    TextView bem1text;
    TextView bem2text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bem1text = findViewById(R.id.tv_bem1);
        bem2text = findViewById(R.id.tv_bem2);

        bem1btn = findViewById(R.id.btn_bem1);
        bem2btn = findViewById(R.id.btn_bem2);
    }

    public void onclickbem1 (View v){
        String bem1Count = bem1text.getText().toString().trim();
        int count = Integer.parseInt(bem1Count);
        count++;
        bem1text.setText(String.valueOf(count));
    }

    public void onclickbem2 (View v){
        String bem2Count = bem2text.getText().toString().trim();
        int count = Integer.parseInt(bem2Count);
        count++;
        bem2text.setText(String.valueOf(count));
    }
}
