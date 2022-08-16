package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = name.getText().toString();
                textView.setText(a +" " + "is the GOAT");
            }
        });
    }

    public void show_toast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_SHORT);
        View v1 = toast.getView();
        TextView text = v1.findViewById(android.R.id.message);
        text.setTextSize(20);
        text.setTextColor(Color.CYAN);
        View toastView = toast.getView();
        toastView.setBackgroundResource(R.drawable.toast_drawable);
//        toast.setGravity(Gravity.TOP, 0,250);
        toast.show();
    }
}