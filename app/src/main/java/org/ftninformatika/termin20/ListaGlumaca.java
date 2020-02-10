package org.ftninformatika.termin20;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaGlumaca extends Fragment {

    ListView lvGlumci;
    ArrayList<String> imena=new ArrayList<>();
    List<Glumac> glumci=new ArrayList<>();
    Datap datap=new Datap();

    public ListaGlumaca() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_glumaca, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvGlumci=view.findViewById(R.id.lvGlumci);
        glumci=datap.getInstance().getGlumci();
        for (int i=0;i<glumci.size();i++){
            imena.add(glumci.get(i).getIme()+" "+glumci.get(i).getPrezime());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,imena);
        lvGlumci.setAdapter(adapter);
        lvGlumci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
