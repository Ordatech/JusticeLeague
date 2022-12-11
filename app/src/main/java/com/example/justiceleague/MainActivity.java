package com.example.justiceleague;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity{

    private ArrayList<DataModel> dataSet = new ArrayList<>();
    private RecyclerView recyclerView;
    private LinearLayoutManager LayoutManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.mRecyclerView);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        LayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LayoutManager);

        for(int i=0; i<MyData.nameHero.length; i++) {
            dataSet.add(new DataModel(MyData.nameHero[i],
                    MyData.privateName[i],
                    MyData.id_[i],
                    MyData.drawableArray[i],
                    MyData.Description[i]));
        }
        CustomAdapter Adapter = new CustomAdapter(dataSet);
        recyclerView.setAdapter(Adapter);

    }
//need to add fragment, for clicking one card item to move the fragment.
}