package com.sanket.padaayi.ui.letters;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.sanket.padaayi.ui.letters.LettersLayout.BarakhadiLayout;
import com.sanket.padaayi.ui.letters.LettersLayout.ConsonantsLayout;
import com.sanket.padaayi.R;
import com.sanket.padaayi.ui.letters.LettersLayout.VowelsLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LettersFragment extends Fragment {

    private LettersViewModel lettersViewModel;
    ExpandableListView exp_list_letters;
    ExpandableListAdapter letters_adpater;
    List<String> expandableListTitle,ka1,cha1,tha1,ta1,pa1,ya1,sha1,ka,cha,tha,ta,pa,ya,sha;
    HashMap<String, List<String>> expandableListDetail;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lettersViewModel =
                ViewModelProviders.of(this).get(LettersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_letters, container, false);

        exp_list_letters = root.findViewById(R.id.exp_list_letters);
        expandableListDetail = ExpandableListDataPump.getData();

        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        letters_adpater = new CustomExpandableListAdapter(getActivity().getBaseContext(), expandableListTitle, expandableListDetail);
        exp_list_letters.setAdapter(letters_adpater);


        exp_list_letters.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                if (expandableListTitle.get(groupPosition).toString().equals("व्यंजन"))
                    startActivity(new Intent(getActivity(), ConsonantsLayout.class).putExtra("key",expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition)));
                else if (expandableListTitle.get(groupPosition).toString().equals("स्वर"))
                    startActivity(new Intent(getActivity(), VowelsLayout.class));
                else if (expandableListTitle.get(groupPosition).toString().equals("बाराखडी"))
                    startActivity(new Intent(getActivity(), BarakhadiLayout.class));

                return  true;
            }
        });

        return root;
    }


}