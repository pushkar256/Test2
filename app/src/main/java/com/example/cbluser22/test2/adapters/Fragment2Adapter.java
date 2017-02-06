package com.example.cbluser22.test2.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cbluser22.test2.R;
import com.example.cbluser22.test2.models.FragmentModel2;

import java.util.List;

/**
 * Created by cbluser22 on 6/2/17.
 */

public class Fragment2Adapter extends RecyclerView.Adapter<Fragment2Adapter.RecyclerViewHolder>{
   Activity activity;
    List<FragmentModel2> mList2;

    public Fragment2Adapter(Activity activity,List<FragmentModel2> mList2)
    {
        this.activity=activity;
        this.mList2=mList2;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(activity);
        View view=layoutInflater.inflate(R.layout.fragment_2_item,parent,false);
        Fragment2Adapter.RecyclerViewHolder viewHolder=new Fragment2Adapter.RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tvYear.setText(mList2.get(position).year);
        holder.ivHoloGram.setImageResource(mList2.get(position).image);
        holder.tvCompany.setText(mList2.get(position).company);

    }

    @Override
    public int getItemCount() {
        return mList2.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvYear,tvCompany;
        ImageView ivHoloGram;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvCompany=(TextView)itemView.findViewById(R.id.tv_company);
            tvYear=(TextView)itemView.findViewById(R.id.tv_year);
            ivHoloGram=(ImageView)itemView.findViewById(R.id.iv_imageFrag2);
        }
    }
}
