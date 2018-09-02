package com.example.tkid.last.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.example.tkid.last.Kartinachki;
import com.example.tkid.last.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Adapterix extends RecyclerView.Adapter<Adapterix.ViweHolderim> {


    private List<Kartinachki> list = new ArrayList<>();
    public void setItem (Collection<Kartinachki> kartinachki){
        list.addAll(kartinachki);
        notifyDataSetChanged();
    }
    class ViweHolderim extends RecyclerView.ViewHolder{

        private ImageView imageView,imageView1,imageView2,imageView3,imageView4,imageView5;

        public ViweHolderim(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            imageView1 = itemView.findViewById(R.id.imageView2);
            imageView2 = itemView.findViewById(R.id.imageView3);
            imageView3 = itemView.findViewById(R.id.imageView4);
            imageView4 = itemView.findViewById(R.id.imageView5);
            imageView5 = itemView.findViewById(R.id.imageView6);

        }
        public void bind (Kartinachki kartinachki){
            Picasso.get().load(kartinachki.getIv1()).into(imageView);
            Picasso.get().load(kartinachki.getIv2()).into(imageView1);
            Picasso.get().load(kartinachki.getIv3()).into(imageView2);
            Picasso.get().load(kartinachki.getIv4()).into(imageView3);
            Picasso.get().load(kartinachki.getIv5()).into(imageView4);
            Picasso.get().load(kartinachki.getIv6()).into(imageView5);

        }

    }
    @Override
    public ViweHolderim onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imageview, parent, false);

        return new ViweHolderim(view);
    }

    @Override
    public void onBindViewHolder(ViweHolderim holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
