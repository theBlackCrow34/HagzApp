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
import proff.freelancer.sherif.hagzapp.adapters.AdapterMailList;
import proff.freelancer.sherif.hagzapp.adapters.AdapterNotifications;
import proff.freelancer.sherif.hagzapp.models.ModelMail;
import proff.freelancer.sherif.hagzapp.models.ModelNotification;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterNotifications adapterNotifications;
    List<ModelNotification> list;

    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_notifications_fragment);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();

        addData();

        return view;
    }

    private void addData() {

        list.add(new ModelNotification(R.drawable.test_photo,"تم شراء الخدمة","uy65"));
        list.add(new ModelNotification(R.drawable.logo,"تم شراء الخدمة","uy65"));
        list.add(new ModelNotification(R.drawable.test_photo,"تم شراء الخدمة","uy65"));
        list.add(new ModelNotification(R.drawable.logo,"تم شراء الخدمة","uy65"));
        adapterNotifications = new AdapterNotifications(getActivity(),list);
        adapterNotifications.notifyDataSetChanged();
        recyclerView.setAdapter(adapterNotifications);
    }

}
