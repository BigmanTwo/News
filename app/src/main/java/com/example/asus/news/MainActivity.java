package com.example.asus.news;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.asus.news.adapter.MyFragmentAdapter;
import com.example.asus.news.fragments.MyFragmentMain;
import com.example.asus.news.fragments.MyFragmentSec;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private List<TabFragment> mList;
    private TabLayout mTabLayout,mTabLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager=(ViewPager)findViewById(R.id.view_pager);
        mTabLayout=(TabLayout)findViewById(R.id.tab_layout1);
        mTabLayout2=(TabLayout)findViewById(R.id.tab_layout2);
        mTabLayout2.addTab(mTabLayout2.newTab().setText("新闻"));
        mTabLayout2.addTab(mTabLayout2.newTab().setText("阅读"));
        mTabLayout2.addTab(mTabLayout2.newTab().setText("讨论"));
        mTabLayout2.addTab(mTabLayout2.newTab().setText("视屏"));
        mTabLayout2.addTab(mTabLayout2.newTab().setText("我"));
        mList=new ArrayList<>();
        mList.add(new TabFragment(new MyFragmentMain(),"头条"));
        mList.add(new TabFragment(new MyFragmentSec(),"科技"));
        mList.add(new TabFragment(new MyFragmentSec(),"热点"));
        mList.add(new TabFragment(new MyFragmentSec(),"娱乐"));
        mList.add(new TabFragment(new MyFragmentSec(),"经济"));
        mList.add(new TabFragment(new MyFragmentSec(),"历史"));
        mList.add(new TabFragment(new MyFragmentSec(),"体育"));
        mList.add(new TabFragment(new MyFragmentSec(),"搞笑"));
        mList.add(new TabFragment(new MyFragmentSec(),"直播"));
        mList.add(new TabFragment(new MyFragmentSec(),"看客"));
        MyFragmentAdapter adapter=new MyFragmentAdapter(getSupportFragmentManager(),mList);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }


}
