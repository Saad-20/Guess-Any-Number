package com.saadshahzad97.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//declaring the the randomNumber so we can use it publicly in any method
    int randomNumber;

    //In order to not create toast over again in any methhod we use 
    public void Toast(String string)
    {
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();
    }

    //The button onClick method 
    public void onClick(View view)
    {
        EditText number_editText = (EditText) findViewById(R.id.number_editText);

        //To convert the the textbox into integer 
        int Number = Integer.parseInt(number_editText.getText().toString());

        //To check if the number is higher then the random 
        if(Number > randomNumber)
        {
            Toast("The number is higher!");
        }

        //To check if the number is less then the random number 
        else if(Number < randomNumber)
        {
            Toast("The number is lesser!");
        }
       
        //you have guessed the correct number
        else
        {
            Toast("Congratulaions! You have guessed the number");
            Random random = new Random();
            randomNumber = random.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //As soon as the application is starts the randomNumber will start to initiate
        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;
    }
}
