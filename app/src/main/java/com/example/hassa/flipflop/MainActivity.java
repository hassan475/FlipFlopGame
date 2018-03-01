package com.example.hassa.flipflop;

import android.content.DialogInterface;
import android.os.Handler;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
//import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {
    TextView p1,p2;
    ImageView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;
    Integer [] cardsArray={101,102,103,104,105,106,201,202,203,204,205,206};
    int image101, image102,image103,image104,image105,image106, image201,image202,image203,image204,image205,image206;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber=1;
    int turn=1;
    int playerPoints=0,cpuPoints=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //p1=(TextView) findViewById(R.id.p1);
        //p2=(TextView) findViewById(R.id.p2);

        a1=(ImageView) findViewById(R.id.a1);
        a2=(ImageView) findViewById(R.id.a2);
        a3=(ImageView) findViewById(R.id.a3);

        a4=(ImageView) findViewById(R.id.a4);
        a5=(ImageView) findViewById(R.id.a5);
        a6=(ImageView) findViewById(R.id.a6);

        a7=(ImageView) findViewById(R.id.a7);
        a8=(ImageView) findViewById(R.id.a8);
        a9=(ImageView) findViewById(R.id.a9);

        a10=(ImageView) findViewById(R.id.a10);
        a11=(ImageView) findViewById(R.id.a11);
        a12=(ImageView) findViewById(R.id.a12);

        a1.setTag("0");

        a2.setTag("1");

        a3.setTag("2");

        a4.setTag("3");

        a5.setTag("4");

        a6.setTag("5");

        a7.setTag("6");

        a8.setTag("7");

        a9.setTag("8");

        a10.setTag("9");

        a11.setTag("10");

        a12.setTag("11");

        frontOfCards();
        Collections.shuffle(Arrays.asList(cardsArray));
       // p2.setTextColor(Color.GRAY);
        a1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a1,theCard);

                                  }
                              }
        );
        a2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a2,theCard);

                                  }
                              }
        );
        a3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a3,theCard);

                                  }
                              }
        );
        a4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a4,theCard);

                                  }
                              }
        );
        a5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a5,theCard);

                                  }
                              }
        );
        a6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a6,theCard);

                                  }
                              }
        );
        a7.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view)
                                  {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a7,theCard);

                                  }
                              }
        );
        a8.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view)
                                  {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a8,theCard);

                                  }
                              }
        );
        a9.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view)
                                  {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a9,theCard);

                                  }
                              }
        );
        a10.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view)
                                  {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a10,theCard);

                                  }
                              }
        );
        a11.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view)
                                  {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a11,theCard);

                                  }
                              }
        );
        a12.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view)
                                  {
                                      int theCard=Integer.parseInt((String) view.getTag());
                                      doStuff(a12,theCard);

                                  }
                              }
        );
    }
    private void doStuff(ImageView v,int card)
    {
        if(cardsArray[card]==101)
        {
            v.setImageResource(image101);
        }
        else if(cardsArray[card]==102)
        {
            v.setImageResource(image102);
        }
        else if(cardsArray[card]==103)
        {
            v.setImageResource(image103);
        }
        else if(cardsArray[card]==104)
        {
            v.setImageResource(image104);
        }
        else if(cardsArray[card]==105)
        {
            v.setImageResource(image105);
        }
        else if(cardsArray[card]==106)
        {
            v.setImageResource(image106);
        }
        else if(cardsArray[card]==201)
        {
            v.setImageResource(image201);
        }
        else if(cardsArray[card]==202)
        {
            v.setImageResource(image202);
        }
        else if(cardsArray[card]==203)
        {
            v.setImageResource(image203);
        }
        else if(cardsArray[card]==204)
        {
            v.setImageResource(image204);
        }
        else if(cardsArray[card]==205)
        {
            v.setImageResource(image205);
        }
        else if(cardsArray[card]==206)
        {
            v.setImageResource(image206);
        }
        if(cardNumber ==1)
        {
            firstCard=cardsArray[card];
            if(firstCard>200)
            {
                firstCard=firstCard-100;
            }
            cardNumber=2;
            clickedFirst=card;
            v.setEnabled(false);
        }
        else if (cardNumber == 2)
        {
                secondCard = cardsArray[card];
                if (secondCard > 200) {
                    secondCard = secondCard - 100;
                }
                cardNumber = 1;
                clickedSecond = card;
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
                a5.setEnabled(false);
                a6.setEnabled(false);
                a7.setEnabled(false);
                a8.setEnabled(false);
                a9.setEnabled(false);
                a10.setEnabled(false);
                a11.setEnabled(false);
                a12.setEnabled(false);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        calculate();
                    }
                },1000);


        }
    }
    private void calculate(){
        if(firstCard==secondCard)
        {
            if(clickedFirst==0)
            {
                a1.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==1)
            {
                a2.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==2)
            {
                a3.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==3)
            {
                a4.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==4)
            {
                a5.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==5)
            {
                a6.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==6)
            {
                a7.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==7)
            {
                a8.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==8)
            {
                a9.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==9)
            {
                a10.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==10)
            {
                a11.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst==11)
            {
                a12.setVisibility(View.INVISIBLE);
            }



            if(clickedSecond==0)
            {
                a1.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==1)
            {
                a2.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==2)
            {
                a3.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==3)
            {
                a4.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==4)
            {
                a5.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==5)
            {
                a6.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==6)
            {
                a7.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==7)
            {
                a8.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==8)
            {
                a9.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==9)
            {
                a10.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==10)
            {
                a11.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond==11)
            {
                a12.setVisibility(View.INVISIBLE);
            }

            /*if(turn==1)
            {
                playerPoints++;
                p1.setText("P1: " + playerPoints);
            }
            else if(turn==2)
            {
                cpuPoints++;
                p2.setText("P2: " + cpuPoints);

            }*/

        }
        else
        {
            a1.setImageResource(R.drawable.back);
            a2.setImageResource(R.drawable.back);
            a3.setImageResource(R.drawable.back);
            a4.setImageResource(R.drawable.back);
            a5.setImageResource(R.drawable.back);
            a6.setImageResource(R.drawable.back);
            a7.setImageResource(R.drawable.back);
            a8.setImageResource(R.drawable.back);
            a9.setImageResource(R.drawable.back);
            a10.setImageResource(R.drawable.back);
            a11.setImageResource(R.drawable.back);
            a12.setImageResource(R.drawable.back);

            //change the player turn
            /*if(turn==1)
            {
                turn=2;
                p1.setTextColor(Color.GRAY);
                p2.setTextColor(Color.BLACK);
            }
            else if(turn==2)
            {
                turn=1;
                p2.setTextColor(Color.GRAY);
                p1.setTextColor(Color.BLACK);
            }*/
        }
        a1.setEnabled(true);
        a2.setEnabled(true);
        a3.setEnabled(true);
        a4.setEnabled(true);
        a5.setEnabled(true);
        a6.setEnabled(true);
        a7.setEnabled(true);
        a8.setEnabled(true);
        a9.setEnabled(true);
        a10.setEnabled(true);
        a11.setEnabled(true);
        a12.setEnabled(true);
        checkEnd();
    }
    private void checkEnd()
    {
        if(a1.getVisibility()==View.INVISIBLE && a2.getVisibility()==View.INVISIBLE &&
                a3.getVisibility()==View.INVISIBLE &&
                a4.getVisibility()==View.INVISIBLE &&
                a5.getVisibility()==View.INVISIBLE &&
                a6.getVisibility()==View.INVISIBLE &&
                a7.getVisibility()==View.INVISIBLE &&
                a8.getVisibility()==View.INVISIBLE &&
                a9.getVisibility()==View.INVISIBLE &&
                a10.getVisibility()==View.INVISIBLE &&
                a11.getVisibility()==View.INVISIBLE &&
                a12.getVisibility()==View.INVISIBLE)
        {
            AlertDialog.Builder adb=new AlertDialog.Builder(MainActivity.this);
            adb
                    .setMessage("Your game time : " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW",new DialogInterface.OnClickListener()
		    {
                        public void onClick(DialogInterface di,int i)
                        {
                            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }

                    })
                    .setNegativeButton("EXIT",new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface di,int i)
                        {
                            finish();
                        }

                    });
            AlertDialog ad=adb.create();
            ad.show();
        }
    }
    private void frontOfCards()
    {
        image101=R.drawable.img1;
        image102=R.drawable.img3;
        image103=R.drawable.img5;
        image104=R.drawable.img7;

        image105=R.drawable.img9;
        image106=R.drawable.img11;
        image201=R.drawable.img2;
        image202=R.drawable.img4;

        image203=R.drawable.img6;
        image204=R.drawable.img8;
        image205=R.drawable.img10;
        image206=R.drawable.img12;
    }
}
