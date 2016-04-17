package com.example.asus.news.fragments;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.news.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 2016/4/15.
 */
public class MyFragmentMain extends Fragment implements AdapterView.OnItemClickListener{
    private List<Map<String,Object>> list;
    private ListView listView;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview_frag,null);
        listView=(ListView)view.findViewById(R.id.fragment_listview);
        listView.setOnItemClickListener(this);

        list=new ArrayList<>();
        for(int i=0;i<20;i++){
            Map map=new HashMap();
            map.put("image",R.mipmap.carrot);
            map.put("text","在中国具有苏-30血统的战机，有多少？");
            list.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(getActivity(),list,R.layout.fragment_style,
                new String[]{"image","text"},
                new int[]{R.id.image_fragment_style,R.id.text_fragment1});

        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent();
        intent.setComponent(new ComponentName(getActivity(),NewsActivity.class));
        startActivity(intent);
    }
}
