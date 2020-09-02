package com.example.borshon.sd4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = new String[]{"বাংলা","ইংরেজী","সাধারণ জ্ঞান","পরীক্ষা"};
        description = new String[]{"","","",""};
        icon = new int[]{R.drawable.b,R.drawable.e,R.drawable.s,R.drawable.x};

        listView = findViewById(R.id.listViewId);

        for(int i= 0;i<title.length;i++){
            Model model = new Model(title[i],description[i],icon[i]);
            arrayList.add(model);
        }

        //pass the result to listviewAdapter
        adapter = new ListViewAdapter(this,arrayList);

        //bind the adapter to the list view
        listView.setAdapter(adapter);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);

        android.support.v7.widget.SearchView searchView = (android.support.v7.widget.SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                if(TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }

                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();
        if(id==R.id.action_seting){

            Intent intent  = new Intent(MainActivity.this,About_us.class);
            startActivity(intent);

            return true;
        }
        if(id==R.id.exit){

            finish();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
