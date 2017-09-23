package com.example.pc.smartbookapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class ListBook extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Book> arrayList;
    BookAdapter bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listbook);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //tuy chinh recycler view
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ListBook.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        //tao du lieu mang arrayList
        arrayList = new ArrayList<Book>();
        arrayList.add(new Book(R.drawable.dacnhantam, "Đắc Nhân Tâm", 5));
        arrayList.add(new Book(R.drawable.duxasedulasequen, "Đủ Xa Sẽ Đủ Lạ Sẽ Quên", 4));
        arrayList.add(new Book(R.drawable.nhagiakim, "Nhà Giả Kim", 4));
        arrayList.add(new Book(R.drawable.tuoitredanggiabaonhieu, "Tuổi Trẻ Đáng Giá Bao Nhiêu", 5));
        //tao adapter
        bookAdapter = new BookAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(bookAdapter);

    }
}