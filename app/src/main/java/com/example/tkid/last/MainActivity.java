package com.example.tkid.last;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tkid.last.adapter.Adapterix;

import java.util.Arrays;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapterix adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        loadimge();
    }

    private Collection<Kartinachki> getImages(){
        return Arrays.asList(
                new Kartinachki("https://pp.userapi.com/c845221/v845221074/bcd23/9_ZWVUW3dfk.jpg","https://pp.userapi.com/c845221/v845221074/bcd9b/LqJYDQNXAuE.jpg",
                        "https://pp.userapi.com/c845221/v845221074/bcda5/0DDyPmjaVrQ.jpg","https://pp.userapi.com/c845221/v845221074/bcdb9/6dGz1UbNdNc.jpg",
                        "https://pp.userapi.com/c845221/v845221074/bcde1/c2bs6vEEdNc.jpg","https://pp.userapi.com/c845221/v845221074/bcdf5/InpxI6FstAY.jpg"),
                new Kartinachki("https://pp.userapi.com/c845221/v845221074/bce13/1nTK_DbYuvA.jpg","https://pp.userapi.com/c846217/v846217590/4f0d0/jBLJYn_M5Tk.jpg",
                        "https://pp.userapi.com/c639525/v639525303/5581d/NQ4mr-4tNB4.jpg","https://pp.userapi.com/c846217/v846217716/4aa8c/4sgHxL2epQY.jpg",
                        "https://pp.userapi.com/c846217/v846217716/4aab3/IQiL6-0RSG4.jpg","https://pp.userapi.com/c846217/v846217716/4aac7/2mA1AHnaG8M.jpg"),
                new Kartinachki("https://pp.userapi.com/c846217/v846217716/4aad1/_88lgAPhkNA.jpg","https://pp.userapi.com/c840237/v840237291/9a459/ZnSHRHdRea8.jpg",
                        "https://pp.userapi.com/c840237/v840237291/9a463/lRQIFTjlqGQ.jpg","https://pp.userapi.com/c840237/v840237291/9a46d/ew43aRUJBFk.jpg",
                        "https://pp.userapi.com/c840237/v840237291/9a48b/Pn7-ntIYdz0.jpg","https://pp.userapi.com/c840237/v840237291/9a4f9/tUbK8uuheR0.jpg")
        );
    }

    private void loadimge(){
        Collection<Kartinachki> images = getImages();
        adapter.setItem(images);

    }

    private void initRecyclerView(){
        recyclerView=findViewById(R.id.recyclerViwe);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapterix();
        recyclerView.setAdapter(adapter);
    }
}
