package com.kekiel.mysunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastDummy = new String[]{
                "Heavy clouds - 01",
                "But no rain - 02",
                "Weather today - 03",
                "In fact, there will be - 04"
        };

        ArrayList<String> forecastStrings = new ArrayList<>(Arrays.asList(forecastDummy));

        ArrayAdapter<String> weatherAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecastStrings);

        ListView weatherListView = (ListView) fragmentView.findViewById(R.id.listview_forecast);
        weatherListView.setAdapter(weatherAdapter);

        return fragmentView;
    }
}
