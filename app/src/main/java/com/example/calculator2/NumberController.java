package com.example.calculator2;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumberController {
    Double value;
    TextView tv;
    String displayValue;
    TextView display;
    String lastOperation = "=";

    public NumberController() {
        displayValue = new String();
    }

    public void setDisplay(TextView display) {
        this.display = display;
    }


    public void addDigit(int d){
        if((d>0)&&(d<=9)&&(displayValue.length()<12)){
            displayValue=displayValue+Integer.toString(d);
            display();
        }
    }

    public void clear(){
        displayValue="";
        if(display != null){
            if(displayValue.equals("")) {
                display.setText("0");
            }else{
                display.setText(displayValue);
            }
        }
    }

    public void clearLastDigit(){
        if(displayValue.length()>0) {
            displayValue = displayValue.substring(0, displayValue.length() - 1);
            display();
        }
    }

    public void display(){
        if(display != null){
            if(displayValue.equals("")) {
                display.setText("0");
            }else{
                display.setText(displayValue);
            }
        }
    }
    public void onOperationClick(View view){

        Button button = (Button)view;
        String op = button.getText().toString();
    }


    private void performOperation(Double number, String operation){
        if(value ==null){
            value = number;
        }
        else{
            if(lastOperation.equals("=")){
                lastOperation = operation;
            }
            switch(lastOperation){
                case "=":
                    value =number;
                    break;
                case "/":
                    if(number==0){
                        value =0.0;
                    }
                    else{
                        value /=number;
                    }
                    break;
                case "*":
                    value *=number;
                    break;
                case "+":
                    value +=number;
                    break;
                case "-":
                    value -=number;
                    break;
            }
        }
        tv.setText(value.toString().replace('.', ','));
    }


}
