package com.mapp.bookhub;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class chem_books_adapter  extends RecyclerView.Adapter<chem_books_adapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<chem_books> productList;

    //getting the context and product list with constructor
    public chem_books_adapter(FragmentActivity mCtx, List<chem_books> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public chem_books_adapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.chem_books, null);
        return new chem_books_adapter.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(chem_books_adapter.ProductViewHolder holder, int position) {
        //getting the product of the specified position
        chem_books product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.imageView2.setImageDrawable(mCtx.getResources().getDrawable(product.getImage2()));

        holder.imageView1.setImageDrawable(mCtx.getResources().getDrawable(product.getImage1()));

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView1,imageView2;
        TextView textViewTitle, textViewShortDesc, textViewRating;
        public ProductViewHolder(final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), Chapters_chem.class));
                }
            });

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);

            imageView1 = itemView.findViewById(R.id.imageView1);
            imageView2 = itemView.findViewById(R.id.imageView2);
        }
    }
}
