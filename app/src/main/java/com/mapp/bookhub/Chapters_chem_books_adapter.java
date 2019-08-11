package com.mapp.bookhub;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Chapters_chem_books_adapter extends RecyclerView.Adapter<Chapters_chem_books_adapter.ProductViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Chapters_chem_books> productList;

    //getting the context and product list with constructor
    public Chapters_chem_books_adapter(FragmentActivity mCtx, List<Chapters_chem_books> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public Chapters_chem_books_adapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.chapters_chem_list, null);
        return new Chapters_chem_books_adapter.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Chapters_chem_books_adapter.ProductViewHolder holder, int position) {
        //getting the product of the specified position
        Chapters_chem_books product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle()); }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        public ProductViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View itemView) {
                    AppCompatActivity activity = (AppCompatActivity) itemView.getContext();
                    Fragment myFragment = new bookexmpl();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.cardV, myFragment).addToBackStack(null).commit();
                }
            });

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
        }
    }
}
