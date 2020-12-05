package com.android.mytugasakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final ArrayList<BuahSayur> list = new ArrayList<>();
    Button buttonMulai;
    private RecyclerView rvBusa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMulai = (Button) findViewById(R.id.bStart);

        buttonMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mulai = new Intent(getApplicationContext(), HalamanUtama.class);
                startActivity(mulai);

                Button btnMoveActivity2 = findViewById(R.id.btn_buah);
                btnMoveActivity2.setOnClickListener(this);
                Button btnMoveActivity3 = findViewById(R.id.btn_sayurk);
                btnMoveActivity3.setOnClickListener(this);

                rvBusa = findViewById(R.id.rv_hero);
                rvBusa.setHasFixedSize(true);

                list.addAll(BuahData.getListData());
                showRecyclerList();
            }
        });


    }

    private void showRecyclerList() {
        rvBusa.setLayoutManager(new GridLayoutManager(this, 2));
        ListBuahAdapter listHeroAdapter = new ListBuahAdapter(list);
        rvBusa.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ListBuahAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(BuahSayur data) {
                showSelectedBuah(data);
            }

            private void showSelectedBuah(BuahSayur data) {
            }


        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.btn_buah:
                Intent moveIntent2 = new Intent(MainActivity.this, MoveActivity2.class);
                startActivity(moveIntent2);
                break;
            case R.id.btn_sayurk:
                Intent moveIntent3 = new Intent(MainActivity.this, MoveActivity3.class);
                startActivity(moveIntent3);
                break;


        }
    }
}