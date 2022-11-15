package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    String krest, nol;
    TextView textView ;
    int i = 0;
    int activePlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        krest = "X";
        nol = "0";


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        textView = findViewById(R.id.textView);
    }

    public void clkbtn1(View view) {

        if(i == 0){
            btn1.setText(krest);
            i++;
            btn1.setEnabled(false);

        }
        else {
            btn1.setText(nol);
            i--;
            btn1.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn2(View view) {
        if(i == 0){
            btn2.setText(krest);
            i++;
            btn2.setEnabled(false);
        }
        else {
            btn2.setText(nol);
            i--;
            btn2.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn3(View view) {
        if(i == 0){
            btn3.setText(krest);
            i++;
            btn3.setEnabled(false);

        }
        else {
            btn3.setText(nol);
            i--;
            btn3.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn4(View view) {
        if(i == 0){
            btn4.setText(krest);
            i++;
            btn4.setEnabled(false);

        }
        else {
            btn4.setText(nol);
            i--;
            btn4.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn5(View view) {
        if(i == 0){
            btn5.setText(krest);
            i++;
            btn5.setEnabled(false);

        }
        else {
            btn5.setText(nol);
            i--;
            btn5.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn6(View view) {
        if(i == 0){
            btn6.setText(krest);
            i++;
            btn6.setEnabled(false);

        }
        else {
            btn6.setText(nol);
            i--;
            btn6.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn7(View view) {
        if(i == 0){
            btn7.setText(krest);
            i++;
            btn7.setEnabled(false);

        }
        else {
            btn7.setText(nol);
            i--;
            btn7.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn8(View view) {
        if(i == 0){
            btn8.setText(krest);
            i++;
            btn8.setEnabled(false);

        }
        else {
            btn8.setText(nol);
            i--;
            btn8.setEnabled(false);
        }
        Win();
        Noll();
    }
    public void clkbtn9(View view) {
        if(i == 0){
            btn9.setText(krest);
            i++;
            btn9.setEnabled(false);

        }
        else {
            btn9.setText(nol);
            i--;
            btn9.setEnabled(false);
        }
        Win();
        Noll();
    }


    public void Win () {
        if (btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != ""&&
                btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != ""&&
                btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != "" )
        {
            textView.setText("Ничия");
        }

        if (btn1.getText() == krest && btn2.getText() == krest && btn3.getText() == krest )
        {

            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);

        }

        if (btn4.getText() == krest && btn5.getText() == krest && btn6.getText() == krest )
        {
            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }


        if (btn7.getText() == krest && btn8.getText() == krest && btn9.getText() == krest )
        {
            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn1.getText() == krest && btn4.getText() == krest && btn7.getText() == krest )
        {
            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn2.getText() == krest && btn5.getText() == krest && btn8.getText() == krest )
        {
            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn3.getText() == krest && btn6.getText() == krest && btn9.getText() == krest )
        {
            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn1.getText() == krest && btn5.getText() == krest && btn9.getText() == krest )
        {
            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn3.getText() == krest && btn5.getText() == krest && btn7.getText() == krest )
        {
            textView.setText("Крестики выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

    }
    public void Noll () {

        if (btn1.getText() == nol && btn2.getText() == nol && btn3.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn4.getText() == nol && btn5.getText() == nol && btn6.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn7.getText() == nol && btn8.getText() == nol && btn9.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn1.getText() == nol && btn4.getText() == nol && btn7.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn2.getText() == nol && btn5.getText() == nol && btn8.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn3.getText() == nol && btn6.getText() == nol && btn9.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn1.getText() == nol && btn5.getText() == nol && btn9.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }

        if (btn3.getText() == nol && btn5.getText() == nol && btn7.getText() == nol )
        {
            textView.setText("Нолики  выйграли");
            btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false); btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false); btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
        }
    }


    public void clkbtn10(View view) {
        btn1.setText(""); btn1.setEnabled(true);
        btn2.setText(""); btn2.setEnabled(true);
        btn3.setText(""); btn3.setEnabled(true);
        btn4.setText(""); btn4.setEnabled(true);
        btn5.setText(""); btn5.setEnabled(true);
        btn6.setText(""); btn6.setEnabled(true);
        btn7.setText(""); btn7.setEnabled(true);
        btn8.setText(""); btn8.setEnabled(true);
        btn9.setText(""); btn9.setEnabled(true);
        textView.setText("");
        i = 0;
    }
}