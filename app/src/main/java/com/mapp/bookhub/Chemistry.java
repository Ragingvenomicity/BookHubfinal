package com.mapp.bookhub;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Chemistry extends Fragment {
    List<chem_books> productList;

    //the recyclerview
    RecyclerView recyclerView;

    public Chemistry(){

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new chem_books(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground));

        productList.add(
                new chem_books(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground));

        productList.add(
                new chem_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,

                        R.drawable.ic_launcher_foreground));

        productList.add(
                new chem_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground));

        productList.add(
                new chem_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground));

        productList.add(
                new chem_books(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        R.drawable.ic_launcher_foreground));
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.mathematics, container, false);
        //getting the recyclerview from xml

        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //creating recyclerview adapter
        chem_books_adapter adapter = new chem_books_adapter(getActivity(), productList);

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}

