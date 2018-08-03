package com.example.ahmed.pionears;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ahmed.pionears.DatatClasess.Explore;

import java.util.List;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {
    private Context mContext;
    private List<Explore> mExploreList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mCompanyName, mJobStyle, mDiscription;

        public ViewHolder(View itemView) {
            super(itemView);
            mCompanyName = itemView.findViewById(R.id.company_name);
            mJobStyle = itemView.findViewById(R.id.job_style);
            mDiscription = itemView.findViewById(R.id.job_discribtion);

        }

    }

    public ExploreAdapter(Context context, List<Explore> list) {
        mContext = context;
        mExploreList = list;
    }

    @Override
    public ExploreAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.explore_items, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ExploreAdapter.ViewHolder holder, int position) {

        Explore p = mExploreList.get(position);

        holder.mCompanyName.setText(p.getmCompanyName());
        holder.mJobStyle.setText(p.getmJobStyle());
        holder.mDiscription.setText(p.getmDiscription());

    }


    @Override
    public int getItemCount() {
        return mExploreList.size();
    }
}
