package com.example.a34_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKomponen;
    private ArrayList<Komponen> list = new ArrayList<>();
    private void showSelectedKomponen (Komponen komponen) {
        Toast.makeText(this, "Kamu memilih " + komponen.getNama(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKomponen = findViewById(R.id.rv_komponen);
        rvKomponen.setHasFixedSize(true);

        list.addAll(KomponenData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKomponen.setLayoutManager(new LinearLayoutManager(this));
        ListKomponenAdapter listKomponenAdapter = new ListKomponenAdapter(list);
        rvKomponen.setAdapter(listKomponenAdapter);

        listKomponenAdapter.setOnItemClickCallback(new ListKomponenAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Komponen data) {
                showSelectedKomponen(data);
            }
        });
    }

}