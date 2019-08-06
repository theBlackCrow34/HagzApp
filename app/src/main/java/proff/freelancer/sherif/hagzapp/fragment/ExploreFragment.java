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
import proff.freelancer.sherif.hagzapp.models.ModelExplore;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterExplore adapterExplore;
    List<ModelExplore> list;

    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_explore_fragment);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();

        addData();


        return view;
    }

    private void addData() {


        list.add(new ModelExplore(R.drawable.test_service_two,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية","خدمة عامة",1.0f,"جدة-السعودية",20,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية"," عامة",3.0f,"جدة-السعودية",10,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service_two,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية","خدمة ",5.0f,"الرياض-السعودية",30,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية","خدمة عامة",1.0f,"جدة-السعودية",20,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service_two,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية"," عامة",3.0f,"جدة-السعودية",10,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية","خدمة ",5.0f,"الرياض-السعودية",30,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service_two,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية","خدكة عامة",1.0f,"جدة-السعودية",20,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية"," عامة",3.0f,"جدة-السعودية",10,"sherif mohamed"));
        list.add(new ModelExplore(R.drawable.test_service_two,"qw123"," و هذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصليةهذه خدمة تجرسبية لحين اعداد الخدمة الأصلية","خدمة ",5.0f,"الرياض-السعودية",30,"sherif mohamed"));

        adapterExplore = new AdapterExplore(getActivity(),list);
        adapterExplore.notifyDataSetChanged();
        recyclerView.setAdapter(adapterExplore);
    }

}
