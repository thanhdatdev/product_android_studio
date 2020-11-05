package com.example.recycleviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);
        Intent intent = getIntent();
        int position = intent.getIntExtra("i", 0);
        ProductEntity product = (ProductEntity) intent.getSerializableExtra("obj");
        ((TextView)findViewById(R.id.txtNameDetails)).setText(product.getName());
        ((TextView)findViewById(R.id.txtPriceDetails)).setText(String.valueOf(product.getPrice()));
        ((ImageView)findViewById(R.id.imageDetails)).setImageResource(product.getImage());
    }
}
