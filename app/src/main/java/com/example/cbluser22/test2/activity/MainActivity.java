package com.example.cbluser22.test2.activity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.cbluser22.test2.R;
import com.example.cbluser22.test2.adapters.MyFragmentAdapter;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewPager;
    CollapsingToolbarLayout collapsingToolbarLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        collapsingToolbarLayout.setTitle(" ");

        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);
        MyFragmentAdapter myFragmentAdapter=new MyFragmentAdapter(getSupportFragmentManager(),3);

        viewPager.setAdapter(myFragmentAdapter);
        tablayout.setupWithViewPager(viewPager);






    }

    private void init() {
        toolbar=(Toolbar)findViewById(R.id.toolbar_main);
        tablayout=(TabLayout)findViewById(R.id.tablayout_main);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collapsing);

    }
}
