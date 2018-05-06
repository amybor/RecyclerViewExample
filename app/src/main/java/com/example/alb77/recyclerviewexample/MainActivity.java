package com.example.alb77.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Walking Dead","Categorie Book","Description book",R.drawable.thewalkingdead));
        lstBook.add(new Book("The Talking Dead","Categorie Book","Description book",R.drawable.thetalkingdead));
        lstBook.add(new Book("The Dancing Dead","Categorie Book","Description book",R.drawable.thedancingdead));
        lstBook.add(new Book("The Laughing Dead","Categorie Book","Description book",R.drawable.thelaughingdead));
        lstBook.add(new Book("Game of Thrones","Categorie Book","Description book",R.drawable.gameofthrones));
        lstBook.add(new Book("Outlander","Categorie Book","Description book",R.drawable.outlander));
        lstBook.add(new Book("Canning","Categorie Book","Description book",R.drawable.canning));
        lstBook.add(new Book("Gardening","Categorie Book","Description book",R.drawable.gardening));
        lstBook.add(new Book("Fruit","Categorie Book","Description book",R.drawable.fruit));
        lstBook.add(new Book("Eating Healthy","Categorie Book","Description book",R.drawable.eatinghealthy));
        lstBook.add(new Book("Clifford","Categorie Book","Description book",R.drawable.clifford));
        lstBook.add(new Book("Fred","Categorie Book","Description book",R.drawable.fred));
        lstBook.add(new Book("Rugrats","Categorie Book","Description book",R.drawable.rugrats));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this.lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
