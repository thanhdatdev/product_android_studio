package com.example.recycleviewexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<ProductEntity> products;

    public ProductAdapter(Context context, ArrayList<ProductEntity> products) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.products = products;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.shop_item, parent , false);
        return new ProductViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {
        ProductEntity product = products.get(position);
        holder.txtName.setText(product.getName());
        holder.txtPrice.setText(String.valueOf(product.getPrice()));
        holder.imgProduct.setImageResource(product.getImage());

        holder.imgProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductDetails.class);
                intent.putExtra("i", position);
                intent.putExtra("obj", product);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        ImageView imgProduct;
        TextView txtPrice;

        public ProductViewHolder(@NonNull View itemView, ProductAdapter productAdapter) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txText);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            imgProduct = itemView.findViewById(R.id.imageProduct);
        }
    }
}
