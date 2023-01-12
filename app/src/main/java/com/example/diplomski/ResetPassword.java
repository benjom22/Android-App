package com.example.diplomski;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ResetPassword extends AppCompatActivity {

    Button reset;
    EditText email;

    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        reset = findViewById(R.id.button);
        email = findViewById(R.id.email_reset);

        auth = FirebaseAuth.getInstance();

        //reset button functionality
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetPassword();
            }
        });

    }

    public void resetPassword(){
        String Email = email.getText().toString().trim();

        if(Email.isEmpty()){
            email.setError("Please provide your email");
            email.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
            email.setError("Provide valid email address");
            email.requestFocus();
            return;
        }

        auth.sendPasswordResetEmail(Email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(ResetPassword.this, "Email has been sent!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(ResetPassword.this, MainActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(ResetPassword.this, "Error occurred, try again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}