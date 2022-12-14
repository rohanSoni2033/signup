package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCreateAccountButtonClick(View view){
        EditText username = findViewById(R.id.username);
        EditText emailAddress = findViewById(R.id.emailAddress);
        EditText phoneNumber = findViewById(R.id.phoneNumber);
        EditText password = findViewById(R.id.password);

        TextView userText = findViewById(R.id.userText);

//        userText.setText("congratulations!! your account is created");
//        System.out.println(username+ ", " + emailAddress + ", " + ", " + phoneNumber + ", " + password);
        StringBuilder userInputs =new  StringBuilder();
        userInputs.append("\nusername : ");
        userInputs.append(username.getText().toString());
        userInputs.append("\nemail address : ");
        userInputs.append(emailAddress.getText().toString());
        userInputs.append("\nphone number : ");
        userInputs.append(phoneNumber.getText().toString());
        userInputs.append("\npassword : ");
        userInputs.append(password.getText().toString());
        userText.setText(userInputs);
    }
}