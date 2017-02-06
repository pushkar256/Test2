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
import com.example.cbluser22.test2.adapters.Fragment3Adapter;
import com.example.cbluser22.test2.models.FragmentModel3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser22 on 6/2/17.
 */

public class Fragment3 extends Fragment{

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_3,container,false);
        List<FragmentModel3> mList3=new ArrayList<>();
        mList3.add(new FragmentModel3("SamualDurrant","jhksfgdhukfhksbhfghfjkhfjghsadfgbsknfklffgfuisdahfnafmnsbdanfgsda","2 Days Ago"));
        mList3.add(new FragmentModel3("SamualDurrant","jhksfgdhukfhksbhfghfjkhfjghsadfgbsknfklffgfuisdahfnafmnsbdanfgsda","2 Days Ago"));
        mList3.add(new FragmentModel3("SamualDurrant","jhksfgdhukfhksbhfghfjkhfjghsadfgbsknfklffgfuisdahfnafmnsbdanfgsda","2 Days Ago"));
        mList3.add(new FragmentModel3("SamualDurrant","jhksfgdhukfhksbhfghfjkhfjghsadfgbsknfklffgfuisdahfnafmnsbdanfgsda","2 Days Ago"));
        mList3.add(new FragmentModel3("SamualDurrant","jhksfgdhukfhksbhfghfjkhfjghsadfgbsknfklffgfuisdahfnafmnsbdanfgsda","2 Days Ago"));
        mList3.add(new FragmentModel3("SamualDurrant","jhksfgdhukfhksbhfghfjkhfjghsadfgbsknfklffgfuisdahfnafmnsbdanfgsda","2 Days Ago"));
        mList3.add(new FragmentModel3("SamualDurrant","jhksfgdhukfhksbhfghfjkhfjghsadfgbsknfklffgfuisdahfnafmnsbdanfgsda","2 Days Ago"));


        Fragment3Adapter fragment3Adapter=new Fragment3Adapter(getActivity(),mList3);
        RecyclerView rvFragment3=(RecyclerView)view.findViewById(R.id.rv_fragment3);
        rvFragment3.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        rvFragment3.setAdapter(fragment3Adapter);

        return view;
    }
}
