package com.khelongevo.pdf_reader;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ListViewFragment extends Fragment {
    private static final String TAG = "ListViewFragment";


    public Button btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_fragment_layout, container, false);
        btn = (Button) view.findViewById(R.id.listViewBtn);


        btn.setClickable(true);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "ListView Fragment clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
