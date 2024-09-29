package com.example.unconvert;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android .widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textview;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
                // A toast is a short informational message that an app displays briefly near the bottom of the screen
                // control slash is a shortcut for commenting
                String s = editText.getText().toString();  // Get the value of edittext as string
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;  // In java decimal values are by default double
                textview.setText("The corresponding value in pounds is"+" "+ pound);
            }
        });
    }

    // Below is another method using onclick attribute... uncomment it and try
//        public void calculate(View view){
//            Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
//            // A toast is a short informational message that an app displays briefly near the bottom of the screen
//            // control slash is a shortcut for commenting
//            String s = editText.getText().toString();  // Get the value of edittext as string
//            int kg = Integer.parseInt(s);
//            double pound = 2.205 * kg;  // In java decimal values are by default double
//            textview.setText("The corresponding value in pounds is" + pound);
//        }

}