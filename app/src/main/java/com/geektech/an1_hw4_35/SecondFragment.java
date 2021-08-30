package com.geektech.an1_hw4_35;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private ArrayList<Song> list;
    private Adapter adapter;
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Song("1","Un break my heart","Tony Braxton","2:32"));
        list.add(new Song("2","Allegro Ventigo","Dan Balan","5:36"));
        list.add(new Song("3","Lendo Calendo","Dan Balan","4:51"));
        list.add(new Song("4","Ia Shaman","Skolot","3:41"));
        list.add(new Song("5","Ti","Bloody","5:33"));
        list.add(new Song("6","Na chille","Geegan","5:33"));
        list.add(new Song("7","Viva Forever","Spice Girls","5:33"));
        list.add(new Song("8","Angel","Saro Vardanyan","5:33"));
        list.add(new Song("9","Nochnaia jrica","Olya Polyakova","5:33"));
        list.add(new Song("10","He's comin","Nana","5:33"));
    }

    private void initRecycler(View view) {
        adapter = new Adapter();
        recyclerView = view.findViewById(R.id.rv);
        adapter.setList(list);
        recyclerView.setAdapter(adapter);

        adapter.setItemListener(new Adapter.ItemListener() {
            @Override
            public void OnItemClick(Song song) {
                startActivity(new Intent(requireActivity(),SongActivity.class).putExtra("song",song));
            }
        });
    }
}