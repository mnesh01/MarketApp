package com.example.marketapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 1. AdapterView
    RecyclerView recyclerView;


    // 2. Data source
    List<Item> itemList;

    // 3. Adapter
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // bind all the three parts the dataset/modal class with the adapterview(recyclerview) using the adapter
        // 1. AdapterView
        recyclerView = findViewById(R.id.recyclerView);

        itemList = new ArrayList<>();
        Item item1 = new Item(R.drawable.fruit, "Fruits", "Fresh Fruits from the Garden");
        Item item2 = new Item(R.drawable.vegitables, "Vegetables", "Delicious Vegetables ");
        Item item3 = new Item(R.drawable.bread, "Bakery", "Bread, Wheat and Beans");
        Item item4 = new Item(R.drawable.beverage, "Beverage", "Juice, Tea, Coffee and Soda");
        Item item5 = new Item(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt");
        Item item6 = new Item(R.drawable.popcorn, "Snacks", "Pop Corn, Donut and Drinks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);


        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);

        // need to add a linear layout manager to view the list

    }
}