package com.example.android.berlianafebrianti_1202150240_si3908;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuListAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuListAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);
//        recyclerView.addOnItemTouchListener(new RecycleView.Item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Ayam Geprek", 22000, R.drawable.restauran_ayamgeprek, "Geprekan ayam dengan cabai rawit + Nasi + Tahu + Tempe"));
        data.add(new MenuModel("Ayam Bakar", 21273, R.drawable.restaurant_ayambakar, "Ayam Bakar + Nasi + Sambal Pedas + Sambal Manis + Tahu + Tempe"));
        data.add(new MenuModel("Ayam Goreng", 14000, R.drawable.restaurant_ayamgoreng, "Ayam Goreng + Nasi + Sambal trasi "));
        data.add(new MenuModel("Mie Ayam", 14000, R.drawable.restaurant_mieayam, "Mie Ayam dengan cita rasa Asin Pedas"));
        data.add(new MenuModel("Nasi Goreng", 18040, R.drawable.restaurant_nasigoreng, "Nasi goreng + Telur Mata Sapi"));
        data.add(new MenuModel("Ramen", 18182, R.drawable.restaurant_ramen, "Mie Ramen + Telur + Ayam potong + Sayuran"));
        data.add(new MenuModel("Spagety", 19909, R.drawable.restaurant_spagety, "Spagety + Daging cincang"));
        data.add(new MenuModel("Mie Goreng", 19909, R.drawable.restaurant_miegoreng, "Mie Goreng + Bakso + Sosis"));
        return data;
    }
}
