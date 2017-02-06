package com.example.cbluser22.test2.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cbluser22.test2.R;
import com.example.cbluser22.test2.models.FragmentModel3;

import java.util.List;

/**
 * Created by cbluser22 on 6/2/17.
 */

public class Fragment3Adapter extends RecyclerView.Adapter<Fragment3Adapter.RecyclerViewHolder> {
    Activity activity;
    List<FragmentModel3> mList3;

    public Fragment3Adapter(Activity activity,List<FragmentModel3> mList3)
    {
        this.activity=activity;
        this.mList3=mList3;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(activity);
        View view=layoutInflater.inflate(R.layout.fragment_3_item,parent,false);
        RecyclerViewHolder viewHolder=new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tvName.setText(mList3.get(position).name);
        holder.tvDays.setText(mList3.get(position).days);
        holder.tvComment.setText(mList3.get(position).comment);
    }

    @Override
    public int getItemCount() {
        return mList3.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvComment;
        TextView tvDays;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvName=(TextView)itemView.findViewById(R.id.tv_name);
            tvDays=(TextView)itemView.findViewById(R.id.tv_days);
            tvComment=(TextView)itemView.findViewById(R.id.tv_comment);
        }
    }
}
