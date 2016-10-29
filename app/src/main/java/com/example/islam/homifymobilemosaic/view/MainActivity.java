package com.example.islam.homifymobilemosaic.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.islam.homifymobilemosaic.R;
import com.example.islam.homifymobilemosaic.adapter.ItemObjects;
import com.example.islam.homifymobilemosaic.adapter.SolventRecyclerViewAdapter;
import com.example.islam.homifymobilemosaic.presenter.MosaicPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MosaicView{
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        new MosaicPresenter(this).processData();
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);


    }
    public void showMosaicView(List<ItemObjects> itemObjectses) {

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(MainActivity.this, itemObjectses);
        recyclerView.setAdapter(rcAdapter);
    }
}
