package com.mapp.bookhub;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class Chapters_physics extends AppCompatActivity {
    List<Chapters_physics_books> productList;
    ImageButton imageButton;

    //the recyclerview
    RecyclerView recyclerView;

    public Chapters_physics(){

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapters_physics);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();

        //adding some items to our list
        productList.add(
                new Chapters_physics_books(
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)"));

        productList.add(
                new Chapters_physics_books(

                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)"
                ));

        productList.add(
                new Chapters_physics_books(

                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)"
                ));

        productList.add(
                new Chapters_physics_books(

                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)"
                ));

        productList.add(
                new Chapters_physics_books(

                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)"
                ));

        productList.add(
                new Chapters_physics_books(

                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)"
                ));
        //creating recyclerview adapter
        Chapters_physics_books_adapter adapter = new Chapters_physics_books_adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

}
