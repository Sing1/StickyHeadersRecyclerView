package sing.stickyheadersrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sing.sticky.StickyRecyclerHeadersDecoration;
import sing.sticky.StickyRecyclerHeadersTouchListener;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        adapter = new MyAdapter(getList());
        recyclerView.setAdapter(adapter);

        // Set layout manager
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Add the sticky headers decoration
        final StickyRecyclerHeadersDecoration headersDecor = new StickyRecyclerHeadersDecoration(adapter);
        recyclerView.addItemDecoration(headersDecor);

        // Add decoration for dividers between list items
        recyclerView.addItemDecoration(new DividerDecoration(this));

        // Add touch listeners
        StickyRecyclerHeadersTouchListener touchListener = new StickyRecyclerHeadersTouchListener(recyclerView, headersDecor);
        touchListener.setOnHeaderClickListener(new StickyRecyclerHeadersTouchListener.OnHeaderClickListener() {
            @Override
            public void onHeaderClick(View header, int position, long headerId) {
                Toast.makeText(MainActivity.this, "Header position: " + position + ", id: " + headerId, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.addOnItemTouchListener(touchListener);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, getList().get(position).description, Toast.LENGTH_SHORT).show();
            }
        }));
        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onChanged() {
                headersDecor.invalidateHeaders();
            }
        });
    }

    private List<MainBean> getList(){
        List<MainBean> list = new ArrayList<>();
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-12","2016-12-12"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-13","2016-12-13"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-14","2016-12-14"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        list.add(new MainBean("2016-12-15","2016-12-15"));
        return list;
    }
}