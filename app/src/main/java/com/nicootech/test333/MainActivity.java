package com.nicootech.test333;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MessageData> list = new ArrayList<>();
        MessageData d = new MessageData();
        d.topText = "Update your Barclays";
        d.buttonText = "connection in the next 15 days  ";
        d.imageBank = getDrawable(R.drawable.bank);
        d.imageChev = getDrawable(R.drawable.chevron);
        list.add(d);

        MyAdapter adapter = new MyAdapter(list,this);
        RecyclerView.LayoutManager mgr= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        RecyclerView recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(mgr);




    }

    public void openToast(View view){
        Toast.makeText(getApplicationContext(), "you clicked",
                Toast.LENGTH_SHORT).show();
    }
    public  void openActivity(View view){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        startActivity(intent);

    }
}
