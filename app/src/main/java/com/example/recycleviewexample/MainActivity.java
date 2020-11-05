package com.example.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<ProductEntity> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        products = new ArrayList<>();

        products.add(new ProductEntity("Áo thun", R.drawable.aothun, 100000 ));
        products.add(new ProductEntity("Áo thun", R.drawable.aothun, 100000 ));
        products.add(new ProductEntity("Áo thun", R.drawable.aothun, 100000 ));
        products.add(new ProductEntity("Áo thun", R.drawable.aothun, 100000 ));

        productAdapter = new ProductAdapter(this,products);
        recyclerView.setAdapter(productAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }
}