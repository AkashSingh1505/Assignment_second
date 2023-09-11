package com.akash.assignment_second.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akash.assignment_second.R;


import java.util.ArrayList;

public class NotificationRecycleViewAdapter extends RecyclerView.Adapter<NotificationRecycleViewAdapter.Viewholder>{
    Context context;
    ArrayList<NotificationCard_modelClass> list;

    public NotificationRecycleViewAdapter(Context context, ArrayList<NotificationCard_modelClass> list){
        this.context=context;
        this.list=list;
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notification_card_layout,parent,false);
        Viewholder v = new Viewholder(view);
        return v;
    }



    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.content.setText(list.get(position).getContent());
        setAnimation(holder.itemView,position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
        TextView title,content;

        LinearLayout card;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.notification_title_id);
            content=itemView.findViewById(R.id.notification_content_id);
            card=itemView.findViewById(R.id.notfication_row_id);

        }
    }
    private void setAnimation(View item,int position){
        Animation animation = AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left);
        item.setAnimation(animation);
    }
}
