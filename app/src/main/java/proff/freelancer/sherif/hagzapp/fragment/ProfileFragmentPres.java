package proff.freelancer.sherif.hagzapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.views.AddServiceActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragmentPres extends Fragment {

    LinearLayout linearLayout;

    public ProfileFragmentPres() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_fragment_pres, container, false);

        linearLayout = view.findViewById(R.id.linear_add_service);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(),AddServiceActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
