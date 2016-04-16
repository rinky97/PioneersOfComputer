package com.example.android.pioneersofcomputer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder (View view)
    {TextView message=(TextView)findViewById(R.id.test1);
        String displaymessage="BORN:June23,1912\nNATIONALITY:UK\nINVENTIONS: Cryptanalysis of the Enigma,turing machine,turing test\n";
        message.setText(displaymessage);}

    public void info (View view)
    {TextView message=(TextView)findViewById(R.id.test2);
        String displaymessage="Born:May17,1940\n" +
                "NATIONALITY:USA\n"+"INVENTIONS:Dynabook,Smalltalk,Graphical User Interface,Windows";
        message.setText(displaymessage);}

    public void about (View view)
    {TextView message=(TextView)findViewById(R.id.test3);
        String displaymessage="BORN:Sept4,1936\nNATIONALITY:Israeli\nINVENTIONS:Artificial Intelligence,Bayesian Networks";
        message.setText(displaymessage);}

    public void details (View view)
{TextView message=(TextView)findViewById(R.id.test4);
    String displaymessage="BORN:June8,1955\nNATIONALITY:UK\nINVENTIONS:World Wide Web Consortium,World Wide Web Foundation ";
    message.setText(displaymessage);
}

    public void q_one (View view)
    {TextView message=(TextView)findViewById(R.id.quote1);
        String displaymessage="* “Those who can imagine anything, can create the impossible.”\n* “Sometimes it is the people no one can imagine anything of who do the things no one can imagine.” ";
        message.setText(displaymessage);
    }

    public void q_two (View view)
    {TextView message=(TextView)findViewById(R.id.quote2);
        String displaymessage="* “Training one student in quality and unbiased reporting is tantamount to enlightening thousands and thousands of future readers.”";
        message.setText(displaymessage);
    }

    public void q_three (View view)
    {TextView message=(TextView)findViewById(R.id.quote3);
        String displaymessage="* “The best way to predict the future is to invent it.”\n" +
                "* “People who are really serious about software should make their own hardware.”\n" +
                "* “Technology is anything that wasn’t around when you were born.”\n";
        message.setText(displaymessage);
    }

    public void q_four (View view)
    {TextView message=(TextView)findViewById(R.id.quote4);
        String displaymessage="* “Anyone who has lost track of time when using a computer knows the propensity to dream, the urge to make dreams come true and the tendency to miss lunch.”";
        message.setText(displaymessage);
    }
    }


