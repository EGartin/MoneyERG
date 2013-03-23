package com.moneyerg;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button button;
    private Editable hoursWorked;
    private Editable wageRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = (EditText) findViewById(R.id.hoursWorked);
        hoursWorked = text.getText();

        EditText text1 = (EditText) findViewById(R.id.wageAmount);
        wageRate = text1.getText();

        button = (Button) findViewById(R.id.calculateButton);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                double result = Double.parseDouble(hoursWorked.toString()) * Double.parseDouble(wageRate.toString());

                // Toast.makeText(getApplicationContext(), "$$$: " + result,
                // Toast.LENGTH_LONG).show();

                TextView text = (TextView) findViewById(R.id.totalWages);
                text.setText(Double.toString(result));

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
