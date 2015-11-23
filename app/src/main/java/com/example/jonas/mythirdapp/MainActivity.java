package com.example.jonas.mythirdapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isClicked = false;
    private int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Is called by the numeric buttons in the activity_main
    public void buttonOnClick(View v) {
        Button b = (Button) v;
        String bText = b.getText().toString();
        int value = Integer.parseInt(bText);
        total+=value;

        TextView myTextView = (TextView)
                findViewById(R.id.textView);
        myTextView.setText(Integer.toString(total));
    }
}
