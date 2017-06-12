package com.example.dharanyuvi.new1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class addItem extends AppCompatActivity {
    final ArrayList<String> mUsernames = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=(EditText)findViewById(R.id.editText);
                 mUsernames.add(editText.toString());
            }
        });

    }


    public void click(View v)

    {

        LinearLayout t = (LinearLayout) findViewById(R.id.activity_add_item);

        int index=0;
        while(index<mUsernames.size())
        {
            TextView textView=new TextView(this);
            textView.setText(mUsernames.get(index));
            t.addView(textView);
            index++;
        }
    }
}