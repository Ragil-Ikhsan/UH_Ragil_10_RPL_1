package com.example.ptsgenap10rpl25;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private List<Siswa> DaftarSiswa= Arrays.asList(new Siswa("Budi Santoso","081234567890","40272000001", "Jakarta Timur"));
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.Recycle);
        SiswaAdapter siswaAdapter = new SiswaAdapter(this,DaftarSiswa);
        recyclerView.setAdapter(siswaAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}