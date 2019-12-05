package com.example.mercado.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mercado.R;
import com.example.mercado.models.compras;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<compras> pais;

    public RecyclerViewAdapter(List<compras> list) {
        this.pais = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recyclerview_adapter_item, parent, false);

        return new RecyclerViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        compras d = pais.get(position);

        holder.nome.setText(d.getName());
        holder.imagem.setImageResource(d.getImagem());
    }

    @Override
    public int getItemCount() {
        return pais.size();
    }
}
