package com.example.jabumeri.homcook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
/**
 * Created by jabumeri on 10/1/16.
 */

public class buyameal extends Activity{

    TextView nameTextView;
    TextView phoneTextView;
    TextView addressTextView;
    TextView emailTextView;
    Button   submitButton;

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mNameReference = mRootRef.child("Name");
    DatabaseReference mPhoneReference = mRootRef.child("Phone");
    DatabaseReference mAddressReference = mRootRef.child("Address");
    DatabaseReference mEmailReference = mRootRef.child("Email");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyameal);

        //Get UI elements
        nameTextView = (TextView) findViewById(R.id.TBName);
        phoneTextView = (TextView) findViewById(R.id.TBPhone);
        addressTextView = (TextView) findViewById(R.id.TBAddress);
        emailTextView = (TextView) findViewById(R.id.TBEmail);
        submitButton = (Button) findViewById(R.id.submitButton);


    }
    @Override
    protected void onStart() {
        super.onStart();
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View veiw) {
                mNameReference.setValue(nameTextView.getText().toString());
            }
        });
    }
}
