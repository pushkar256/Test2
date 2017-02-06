package com.example.cbluser22.test2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cbluser22.test2.R;
import com.example.cbluser22.test2.adapters.Fragment2Adapter;
import com.example.cbluser22.test2.models.FragmentModel2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser22 on 6/2/17.
 */

public class Fragment2 extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_2,container,false);

        List<FragmentModel2> list=new ArrayList<>();
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));
        list.add(new FragmentModel2("Code Brew ","2010-2015",R.mipmap.ic_launcher));

        Fragment2Adapter fragment2Adapter=new Fragment2Adapter(getActivity(),list);

        RecyclerView rvFrag2=(RecyclerView)view.findViewById(R.id.rv_frag2);
        rvFrag2.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        rvFrag2.setAdapter(fragment2Adapter);
        return view;
    }
}
