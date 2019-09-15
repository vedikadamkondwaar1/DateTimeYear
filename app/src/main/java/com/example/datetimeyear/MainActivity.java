package com.example.datetimeyear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button buttonop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText2);
        buttonop=findViewById(R.id.button3);
        textView=findViewById(R.id.Result);
        buttonop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Toast.makeText(MyAndroidAppActivity.this, password.getText(),
                // Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "password" +editText.getText(), Toast.LENGTH_SHORT).show();
                textView.setText(String.valueOf(editText.getText()));
            }
        });
    }
}