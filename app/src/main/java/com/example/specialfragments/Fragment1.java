package com.example.specialfragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by kairat.aitpayev on 9/17/2014.
 */
public class Fragment1 extends ListFragment {

    String[] presidents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstateState)
    {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstateState)
    {
        super.onCreate(savedInstateState);
        presidents = getResources().getStringArray(R.array.presidents_array);

        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, presidents));
    }

    public void onListItemClick(ListView parent, View v, int position, long id)
    {
        Toast.makeText(getActivity(), "You have selected " + presidents[position], Toast.LENGTH_SHORT).show();
    }
}
