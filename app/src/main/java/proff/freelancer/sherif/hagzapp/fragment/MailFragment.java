package proff.freelancer.sherif.hagzapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.adapters.AdapterExplore;
import proff.freelancer.sherif.hagzapp.adapters.AdapterMailList;
import proff.freelancer.sherif.hagzapp.models.ModelExplore;
import proff.freelancer.sherif.hagzapp.models.ModelMail;

/**
 * A simple {@link Fragment} subclass.
 */
public class MailFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterMailList adapterMailList;
    List<ModelMail> list;

    public MailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mail, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_mail_fragment);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();

        addData();


        return view;
    }
    private void addData() {


        list.add(new ModelMail(R.drawable.test_photo,"idpre1","yes i will visit you for more details","أحمد صلاح","just now"));
        list.add(new ModelMail(R.drawable.logo,"idpre2","visit you for more details","محمد صلاح","2 hours later "));
        list.add(new ModelMail(R.drawable.test_photo,"idpre3","yes i will visit","أحمد محمود","just now"));
        list.add(new ModelMail(R.drawable.logo,"idpre4","yes i will visit you for more details","أحمد البدري","yesterday"));
        list.add(new ModelMail(R.drawable.test_photo,"idpre5"," for more details","شريف صلاح","13 june 2019"));
        adapterMailList = new AdapterMailList(getActivity(),list);
        adapterMailList.notifyDataSetChanged();
        recyclerView.setAdapter(adapterMailList);
    }
}
