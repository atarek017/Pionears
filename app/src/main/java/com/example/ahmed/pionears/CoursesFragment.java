package com.example.ahmed.pionears;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmed.pionears.DatatClasess.Explore;

import java.util.ArrayList;

public class CoursesFragment extends Fragment {
    View myView;
    String Ttype = "";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.explore_layout, container, false);

        final RecyclerView recyclerView = myView.findViewById(R.id.recyclerViewTasks);

        final ArrayList<Explore> explores = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            if(i<2){
                Ttype="Free";
            }
            else {
                Ttype="20 $";
            }

            explores.add(new Explore("Course :" + i, Ttype, "course invention and manging " + i, null));
        }

        final ExploreAdapter exploreAdapter = new ExploreAdapter(getContext(), explores);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(exploreAdapter);
        return myView;


    }
}
