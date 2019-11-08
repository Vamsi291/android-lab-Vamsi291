package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String matchingnumbers = "Congratulations!";
    int score = 0;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                roll_the_dice();
            }
        });
    }

    public void on_button_click(View view) {
        TextView numberW = this.findViewById(R.id.textView);
        EditText tvW = this.findViewById(R.id.editText);
        TextView scoreW =this.findViewById(R.id.textView3);
        Random r = new Random();
        int dicenumber = r.nextInt((6-1) + 1) + 1;
        numberW.setText(Integer.toString(dicenumber));

        try {
            int number = Integer.parseInt(numberW.getText().toString());
            int tv = Integer.parseInt(tvW.getText().toString());
                if(number==tv){
                    score++;
                    Toast.makeText(getApplicationContext(), matchingnumbers, Toast.LENGTH_SHORT).show();
                    scoreW.setText("Your score is = " + score);
            }

        }
        catch (Exception ex) {
            Log.e("Button Errors", ex.toString());
        }
    }
    public void roll_the_dice(){
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}

