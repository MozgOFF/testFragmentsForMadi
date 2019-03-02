package com.example.testappwithfragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

import com.example.testappwithfragments.Adapter.FragmentAdapter;
import com.example.testappwithfragments.MainFragmentView.FirstFragment;
import com.example.testappwithfragments.MainFragmentView.SecondFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private android.support.v7.widget.Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(mToolbar);

        initUI();
    }

    private void initUI() {
        mViewPager = findViewById(R.id.mainViewPager);
        mTabLayout = findViewById(R.id.mainTabLayout);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        fragmentAdapter.AddFragment(new FirstFragment(), "First Fragment");
        fragmentAdapter.AddFragment(new SecondFragment(), "Second Fragment");

        mViewPager.setAdapter(fragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mToolbar.setTitle("Title");
        mToolbar.setSubtitle("Subtitle");
    }
}
