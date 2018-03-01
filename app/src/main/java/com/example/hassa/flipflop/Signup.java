package com.example.hassa.flipflop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText email;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        firstName=(EditText)findViewById(R.id.firstName);
        lastName=(EditText)findViewById(R.id.lastName);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
    }
    public void back(View v)
    {
        startActivity(new Intent(this,LoginActivity.class));
    }
    public void btnSubmit(View v)
    {
        String first=firstName.getText().toString().trim();
        String last=lastName.getText().toString().trim();
        String e=email.getText().toString().trim();
        String pass=password.getText().toString().trim();
        try {
            UserDB db = new UserDB(this);
            db.open();
            db.createEntry(first,last,e,pass);
            db.close();
            Toast.makeText(Signup.this, "Successfully Added!!", Toast.LENGTH_SHORT).show();
            firstName.setText("");
            lastName.setText("");
            email.setText("");
            password.setText("");
        }
        catch(android.database.SQLException ex)
        {
            Toast.makeText(Signup.this, ex.getMessage(), Toast.LENGTH_SHORT).show();

        }



    }
}
