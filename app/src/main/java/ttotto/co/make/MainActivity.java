package ttotto.co.make;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Item> ItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleriew_show);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_show);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Intent intent = getIntent();
//
        String goal = intent.getStringExtra("goal");
        int peri = intent.getIntExtra("peri",0);
        ItemList.add(new Item(goal,peri));
        Log.v("태그","오류??"+ItemList.size());
//

        //mAdapter.notifyItemInserted(ItemList.size()-1);
        /*
        List<Item> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            dataList.add(new Item("내용",i+"번째 소원"));
        }

        */

        mAdapter = new MyAdapter(ItemList);
        Log.v("태그","오류!");
        recyclerView.setAdapter(mAdapter);
        Log.v("태그","오류!?");
    }


}
