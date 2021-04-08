package com.example.csc250mergesortasignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);
    }

    public void onFactorialButtonClicked(View v)
    {
        String currValue = this.inputET.getText().toString();
        this.answerTV.setText(currValue);
    }

    public static class FactorialProgram
    {
        static int factorial(int n)
        {
            if (n == 0)
                return 1;
            else
                return(n * factorial(n-1));
        }
        public static void main(String[] args)
        {
            int fact;
            int number=8;
            fact = factorial(number);
            System.out.println("Factorial of "+number+" is = "+fact);
        }
    }


}