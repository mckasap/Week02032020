package org.kasapbasi.week02032020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MyList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.ulkeler))
        );
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        l.getAdapter().getItem(position).toString();
        l.getAdapter().getItem(position).toString();

                // Toast.makeText(this, ((TextView) v).getText(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,  l.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

    }
}
