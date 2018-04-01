package com.deipayan.android.calculatordash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int operator = 0;
    public String out="";

    public void clearAll(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        editText.setText("");
    }

    public void Seven(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);

        Button button7 = (Button) findViewById(R.id.button7);
        String seven = button7.getText().toString();
        editText.setText(editText.getText().toString() + seven);
    }

    public void Eight(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button8 = (Button) findViewById(R.id.button8);
        editText.setText(editText.getText().toString() + button8.getText().toString());

    }

    public void Nine(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button9 = (Button) findViewById(R.id.button9);
        editText.setText(editText.getText().toString() + button9.getText().toString());

    }

    public void Four(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button4 = (Button) findViewById(R.id.button4);
        editText.setText(editText.getText().toString() + button4.getText().toString());

    }

    public void Five(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button5 = (Button) findViewById(R.id.button5);
        editText.setText(editText.getText().toString() + button5.getText().toString());

    }

    public void Six(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button6 = (Button) findViewById(R.id.button6);
        editText.setText(editText.getText().toString() + button6.getText().toString());

    }

    public void One(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button1 = (Button) findViewById(R.id.button1);
        editText.setText(editText.getText().toString() + button1.getText().toString());

    }

    public void Two(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button2 = (Button) findViewById(R.id.button2);
        editText.setText(editText.getText().toString() + button2.getText().toString());

    }

    public void Three(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        Button button3 = (Button) findViewById(R.id.button3);
        editText.setText(editText.getText().toString() + button3.getText().toString());

    }

    public void Addition(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        out = editText.getText().toString();
        operator = 1;
        editText.setText("");
    }

    public void Subtraction(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        out = editText.getText().toString();
        operator = 2;
        editText.setText("");

    }

    public void Multiply(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        out = editText.getText().toString();
        operator = 3;
        editText.setText("");

    }

    public void Division(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        out = editText.getText().toString();
        operator = 4;
        editText.setText("");

    }
    public void Remainder(View view){
        EditText editText=(EditText)findViewById(R.id.areaSpace);
        out = editText.getText().toString();
        operator=5;
        editText.setText("");

    }

    public void Equals(View view) {
        EditText editText = (EditText) findViewById(R.id.areaSpace);
        if (operator == 1) {
            String input2 = editText.getText().toString();
            double input_1 = Double.parseDouble(out);
            double input_2 = Double.parseDouble(input2);
            String output = String.valueOf(input_1 + input_2);
            editText.setText(output);
        }
        if (operator == 2) {
            String input2 = editText.getText().toString();
            double input_1 = Double.parseDouble(out);
            double input_2 = Double.parseDouble(input2);
            String output = String.valueOf(input_1 - input_2);
            editText.setText(output);
        }
        if (operator == 3) {
            String input2 = editText.getText().toString();
            double input_1 = Double.parseDouble(out);
            double input_2 = Double.parseDouble(input2);
            String output = String.valueOf(input_1 * input_2);
            editText.setText(output);
        }
        if (operator == 4) {
            String input2 = editText.getText().toString();
            double input_1 = Double.parseDouble(out);
            double input_2 = Double.parseDouble(input2);
            if (input_2 == 0) {
                Toast toast = Toast.makeText(this, "Cannot Divide By Zero", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                String output = String.valueOf(input_1 / input_2);
                editText.setText(output);
            }
        }
        if (operator == 5) {
            String input2 = editText.getText().toString();
            double input_1 = Double.parseDouble(out);
            double input_2 = Double.parseDouble(input2);
            if (input_2 == 0) {
                Toast toast = Toast.makeText(this, "Cannot Divide By Zero", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                String output = String.valueOf(input_1 % input_2);
                editText.setText(output);
            }
        }
        else {
            Toast toast = Toast.makeText(this,"nothing to operate with!!",Toast.LENGTH_SHORT);
            toast.show();
        }


    }


}
