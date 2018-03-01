package com.example.hassa.flipflop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HowToPlay extends AppCompatActivity {
    TextView howtoplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
        howtoplay=(TextView)findViewById(R.id.howtoplay);
        howtoplay.setText("It is a Memory game.You can play this to sharpen your memory.\n"+"To play this game click " +
                "randomly on an image then on second image if both pictures are same both pictures will disapper.And \n "+
                " you will awarded one point.Else if pictures not matced then you have to try again.Keep doing this till end.");
    }
}
