package com.example.calculator2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    NumberController nc;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nc = new NumberController();
        tv = (TextView) findViewById(R. id. textView6);
    }

    public void onDel(View view){
        nc.setDisplay(tv);

        nc.clearLastDigit();
    }

    public void onClr(View view){
        nc.setDisplay(tv);
        nc.clear();
    }

    public void onBtn(View view){
        nc.setDisplay(tv);
        String btn = ((TextView)view).getText().toString();
        nc.addDigit(Integer.parseInt(btn));}


}
