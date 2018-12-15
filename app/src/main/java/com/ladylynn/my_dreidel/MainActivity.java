package com.ladylynn.my_dreidel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView myDriedelImage = findViewById(R.id.myDreidel);

        final int[] myArray = {
                R.drawable.gimmel_side,
                R.drawable.hay_side,
                R.drawable.nun_side,
                R.drawable.shin_side
        };

        final Button myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("My_Driedel", "Dreidel Dreidel Dreidel");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);

                myDriedelImage.setImageResource(myArray[number]);
            }
        });
    }
}
