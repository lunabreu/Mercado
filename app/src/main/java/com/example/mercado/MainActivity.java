package com.example.mercado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.mercado.models.compras;
import com.example.mercado.utils.RecyclerViewAdapter;
import com.example.mercado.utils.RecyclerViewOnItemTouchListener;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private List<compras> compra = new ArrayList<compras>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        this.insertData();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new RecyclerViewAdapter(compra));

        recyclerView.addOnItemTouchListener(
                new RecyclerViewOnItemTouchListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerViewOnItemTouchListener.OnItemClickListener() {

                            @Override
                            public void onItemClick(View view, int position) {
                                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                                intent.putExtra("nome", compra.get(position).getName());
                                intent.putExtra("imagem", compra.get(position).getImagem());


                                startActivity(intent);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );
    }



    public void insertData() {
        compra.add(new compras("Arroz", R.drawable.aaaaaaa));
        compra.add(new compras("Feijão" , R.drawable.bb));
        compra.add(new compras("Batata", R.drawable.cc));
        compra.add(new compras("Carne", R.drawable.dd));
        compra.add(new compras("Macarrão", R.drawable.ee));


    }
}
