package com.example.diplomski;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.MyViewHolder> {

    Context context;
    ArrayList<Model> list;

    public Adapter2(Context context, ArrayList<Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.intentory_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = list.get(position);
        holder.materijal.setText(model.getMaterijal());
        holder.materijal.setText(model.getKolicina());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView materijal, kolicina;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            materijal = itemView.findViewById(R.id.materijal_prikaz);
            kolicina = itemView.findViewById(R.id.kolicina_prikaz);

        }
    }
}
