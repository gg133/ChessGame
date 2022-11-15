package com.example.chessai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Models.ResaultsIn;
import io.paperdb.Paper;

public class Resaults extends AppCompatActivity {

    private String resault;
    private int reTime;
    ArrayList<ResaultsIn> states = new ArrayList<ResaultsIn>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resaults);



        Paper.init(this);
//        ResaultsIn resaultsIn = Paper.book().read("resault");
//        resault = resaultsIn.getResName();
//        reTime = resaultsIn.getResTime();

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        // создаем адаптер
        Adapter adapter = new Adapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        List<String> allKeys = Paper.book().getAllKeys();
        for(int i = 0; i < allKeys.size(); i++){
            ResaultsIn resaultsIn = Paper.book().read(allKeys.get(i));
            states.add(resaultsIn);
        }


    }

}