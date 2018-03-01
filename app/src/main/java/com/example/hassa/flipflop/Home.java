package com.example.hassa.flipflop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
    }
    public void redirectToGame(View v)
    {
        startActivity(new Intent(this,MainActivity.class));

    }
    public void redirectToSignUp(View v)
    {
        startActivity(new Intent(this,Signup.class));

    }
    public void redirectToLogin(View v)
    {
        startActivity(new Intent(this,LoginActivity.class));

    }
    public void redirectToHowToPlay(View v)
    {
        startActivity(new Intent(this,HowToPlay.class));

    }




}
