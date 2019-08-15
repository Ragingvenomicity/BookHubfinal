package com.mapp.bookhub;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class DiscreteScrollAdapter extends RecyclerView.Adapter<DiscreteScrollAdapter.ScrollViewHolder>{


    ArrayList<DiscreteScrollClass> items;

    public DiscreteScrollAdapter()
    {
        items = new ArrayList<DiscreteScrollClass>();
        items.add(new DiscreteScrollClass("Praesent ac lacus eu turpis viverra hendrerit in eget leo. Nulla tincidunt rhoncus turpis pulvinar egestas. Phasellus eget sem nibh. Nulla non mauris vel erat dapibus eleifend sed lobortis orci. In a tempor neque." +
                "Praesent ac lacus eu turpis viverra hendrerit in eget leo. Nulla tincidunt rhoncus turpis pulvinar egestas. Phasellus eget sem nibh. Nulla non mauris vel erat dapibus eleifend sed lobortis orci. In a tempor neque." +
                " \"Praesent ac lacus eu turpis viverra hendrerit in eget leo. Nulla tincidunt rhoncus turpis pulvinar egestas. Phasellus eget sem nibh. Nulla non mauris vel erat dapibus eleifend sed lobortis orci. In a tempor neque. \n\n\n" +
                " \"Praesent ac lacus eu turpis viverra hendrerit in eget leo. Nulla tincidunt rhoncus turpis pulvinar egestas. Phasellus eget sem nibh. Nulla non mauris vel erat dapibus eleifend sed lobortis orci. In a tempor neque. \n\n" +
                " \"Praesent ac lacus eu turpis viverra hendrerit in eget leo. Nulla tincidunt rhoncus turpis pulvinar egestas. Phasellus eget sem nibh. Nulla non mauris vel erat dapibus eleifend sed lobortis orci. In a tempor neque. "));

    }

    public ArrayList<DiscreteScrollClass> setList(){
        return items;
    }

    @NonNull
    @Override
    public ScrollViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.chem_book_example,parent,false);
        return new ScrollViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScrollViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ScrollViewHolder extends RecyclerView.ViewHolder{



        public ScrollViewHolder(View itemView) {
            super(itemView);
        }
    }

}
