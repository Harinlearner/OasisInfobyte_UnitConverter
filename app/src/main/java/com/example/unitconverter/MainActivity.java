package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        List<String> items = new ArrayList<>();
        items.add("Fahrenheit");
        items.add("Celsius");
        items.add("Kilograms");
        items.add("Pounds");
        items.add("Feet");
        items.add("Meters");
        items.add("Seconds");
        items.add("Minutes");
        items.add("Hours");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(adapter);

        Spinner spinner2 = findViewById(R.id.spinner2);

        List<String> items2 = new ArrayList<>();
        items2.add("Fahrenheit");
        items2.add("Celsius");
        items2.add("Kilograms");
        items2.add("Pounds");
        items2.add("Feet");
        items2.add("Meters");
        items2.add("Seconds");
        items2.add("Minutes");
        items2.add("Hours");

        // Create an ArrayAdapter using the list of items and a default spinner layout
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items2);

        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

        Button btn=(Button) findViewById(R.id.button);
        EditText ed=(EditText)findViewById(R.id.editTextNumber);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=spinner.getSelectedItem().toString();
                String s1=spinner2.getSelectedItem().toString();
                String n= ed.getText().toString();
                Evaluate(s,s1,Double.parseDouble(n));

            }
        });

    }
    public void Evaluate(String s1,String s2,double d)
    {
        TextView st=(TextView) findViewById(R.id.textView2);

        if(s1.equals("Fahrenheit") && s2.equals("Celsius"))
        {
            d-=32;
            d*=5;
            d/=9;
            st.setText(d+"");
        }
        else if(s2.equals("Fahrenheit") && s1.equals("Celsius"))
        {
            d+=32;
            d*=9;
            d/=5;
            st.setText(d+"");
        }
        else if(s1.equals("Kilograms") && s2.equals("Pounds"))
        {
            d*=2.20462;
            st.setText(d+"");
        }
        else if(s2.equals("Kilograms") && s1.equals("Pounds"))
        {
            d*=0.453592;
            st.setText(d+"");
        }
        else if(s1.equals("Feet") && s2.equals("Meters"))
        {
            d*=0.3048;
            st.setText(d+"");
        }
        else if(s2.equals("Feet") && s1.equals("Meters"))
        {
            d*=3.28084;
            st.setText(d+"");
        }
        else if(s1.equals("Hours") && s2.equals("Minutes"))
        {
            d*=60;
            st.setText(d+"");
        }
        else if(s2.equals("Hours") && s1.equals("Minutes"))
        {
            d/=60;
            st.setText(d+"");
        }
        else if(s1.equals("Hours") && s2.equals("Seconds"))
        {
            d*=3600;
            st.setText(d+"");
        }
        else if(s2.equals("Hours") && s1.equals("Seconds"))
        {
            d/=3600;
            st.setText(d+"");
        }
        else if(s1.equals("Hours") && s2.equals("Seconds"))
        {
            d*=3600;
            st.setText(d+"");
        }
        else if(s2.equals("Hours") && s1.equals("Seconds"))
        {
            d/=3600;
            st.setText(d+"");
        }
        else if(s1.equals("Minutes") && s2.equals("Seconds"))
        {
            d*=60;
            st.setText(d+"");
        }
        else if(s2.equals("Minutes") && s1.equals("Seconds"))
        {
            d/=60;
            st.setText(d+"");
        }
        else
        {
            st.setText("INVALID");
        }
    }
}