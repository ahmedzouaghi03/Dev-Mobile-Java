package com.example.databasesql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button add, view;
    private EditText nom, mail, phone;
    DataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.add_btn);
        view = (Button)findViewById(R.id.view_btn);
        nom = (EditText)findViewById(R.id.editTextTextPersonName);
        mail = (EditText)findViewById(R.id.editTextTextEmailAddress);
        phone = (EditText)findViewById(R.id.editTextPhone);
        db = new DataBase(this);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDb();
            }
        });
    }

    protected void addDb(){
        if (!nom.getText().toString().equalsIgnoreCase("") &&
                !mail.getText().toString().equalsIgnoreCase("") &&
                !phone.getText().toString().equalsIgnoreCase(""))
        {
            Boolean inserted = db.insertData(nom.getText().toString(), mail.getText().toString(), phone.getText().toString());
            if (inserted){
                Toast.makeText(MainActivity.this, "Insertion avec succès",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(MainActivity.this, "Echec d'insertion",Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(MainActivity.this, "Tous les champs doivent etres remplis", Toast.LENGTH_SHORT).show();
        }
    }


    public void viewDb(View view) {
        Intent intent = new Intent(this, ManagingDB.class);
        startActivity(intent);
    }

}