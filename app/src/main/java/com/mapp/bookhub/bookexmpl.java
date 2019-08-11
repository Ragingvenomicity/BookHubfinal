package com.mapp.bookhub;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.util.ArrayList;

public class bookexmpl extends Fragment implements DiscreteScrollView.OnItemChangedListener, View.OnClickListener{

    DiscreteScrollView scrollView;
    ArrayList<DiscreteScrollClass> items;
    DiscreteScrollAdapter adapter;
    TextView description;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.chem_book_example,container,false);

        description = rootview.findViewById(R.id.description);

        scrollView = rootview.findViewById(R.id.discreteScroll);

        //Discrete Scroll View
        adapter = new DiscreteScrollAdapter();

        items = new ArrayList<DiscreteScrollClass>();
        items = adapter.setList();

        scrollView.setOffscreenItems(4);
        scrollView.setOverScrollEnabled(true);
        scrollView.setAdapter(adapter);
        scrollView.addOnItemChangedListener(this);
        scrollView.setSlideOnFling(true);
        scrollView.setItemTransitionTimeMillis(150);
        scrollView.setItemTransformer(new ScaleTransformer.Builder()
                .setMinScale(0.8f)
                .build());
        onItemChanged(items.get(0));



        return rootview;

    }



    @Override
    public void onClick(View v) {

    }

    @Override
    public void onCurrentItemChanged(@NonNull RecyclerView.ViewHolder viewHolder, int adapterPosition) {
        onItemChanged(items.get(adapterPosition));
    }

    public void onItemChanged(DiscreteScrollClass obj)
    {
        description.setText(obj.getDes());
    }
}
