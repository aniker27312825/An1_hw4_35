package com.geektech.an1_hw4_35;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Song> list= new ArrayList<>();
    private ItemListener itemListener;

    public void setItemListener(ItemListener itemListener) {
        this.itemListener = itemListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_item, parent, false);
        return new ViewHolder(view);
    }

    public void setList(ArrayList<Song> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView number, name, singer, time;

        public ViewHolder(View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.tv_num);
            name = itemView.findViewById(R.id.tv_name);
            singer = itemView.findViewById(R.id.tv_singer);
            time = itemView.findViewById(R.id.tv_time);
        }

        public void onBind(Song song) {
            number.setText(song.getNumber());
            name.setText(song.getName());
            singer.setText(song.getSinger());
            time.setText(song.getTime());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemListener.OnItemClick(song);
                }
            });
        }
    }

    public interface ItemListener {
        void OnItemClick(Song song);
    }
}
