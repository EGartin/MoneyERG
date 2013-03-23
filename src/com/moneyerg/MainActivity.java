package com.moneyerg;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button button;
    private String hoursWorked;
    private String wageRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = (EditText) findViewById(R.id.hoursWorked);
        hoursWorked = text.getText().toString();

        EditText text1 = (EditText) findViewById(R.id.wageRate);
        wageRate = text1.

        button = (Button) findViewById(R.id.calculateButton);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                double result = Double.parseDouble(hoursWorked) * Double.parseDouble(wageRate);

                // System.out.println(result);

                Toast.makeText(getApplicationContext(), "hours worked!!:" + result, Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
