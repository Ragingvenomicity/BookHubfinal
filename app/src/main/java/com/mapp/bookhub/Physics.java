package com.mapp.bookhub;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Physics extends Fragment {
    List<phy_books> productList;

    //the recyclerview
    RecyclerView recyclerView;

    public Physics(){

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new phy_books(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground,R.drawable.ic_thumb_up_black_24dp));

        productList.add(
                new phy_books(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground,R.drawable.ic_thumb_up_black_24dp));

        productList.add(
                new phy_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,

                        R.drawable.ic_launcher_foreground,R.drawable.ic_thumb_up_black_24dp));

        productList.add(
                new phy_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground,R.drawable.ic_thumb_up_black_24dp));

        productList.add(
                new phy_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground,R.drawable.ic_thumb_up_black_24dp));

        productList.add(
                new phy_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground,R.drawable.ic_thumb_up_black_24dp));
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.physics, container, false);
        //getting the recyclerview from xml

        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //creating recyclerview adapter
        phy_books_adapter adapter = new phy_books_adapter(getActivity(), productList);

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}

