package com.example.androproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DetailsActivity extends AppCompatActivity {
    Button submit;
    EditText name , phone;
    DatabaseReference firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        submit = findViewById(R.id.submit);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        firebaseDatabase = FirebaseDatabase.getInstance().getReference("customer");

    }

    public void onSubmit(View view)
    {


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        String Name = name.getText().toString().trim();
        String Phone = phone.getText().toString().trim();

        String id = firebaseDatabase.push().getKey();
        firebaseDatabase.child(id).child("customer_id").setValue(Name.toString());
        firebaseDatabase.child(id).child("customer_phone").setValue(Phone.toString());
        Toast.makeText(DetailsActivity.this,"Registeration successfull.",Toast.LENGTH_SHORT);


        //Intent i = new Intent(DetailsActivity.this , FrontpageActivity.class);
        //
        // startActivity(i);

    }

}
