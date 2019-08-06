package proff.freelancer.sherif.hagzapp.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.adapters.TabsAccessorAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainAppBarFragment extends Fragment {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsAccessorAdapter tabsAccessorAdapter;

    public MainAppBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_app_bar, container, false);

        toolbar = (Toolbar) view.findViewById(R.id.main_page_toolbar_p);

        viewPager = (ViewPager) view.findViewById(R.id.main_tabs_pager_p);
        tabsAccessorAdapter = new TabsAccessorAdapter(getFragmentManager());
        viewPager.setAdapter(tabsAccessorAdapter);

        tabLayout = (TabLayout) view.findViewById(R.id.main_tabs_patient);
        tabLayout.setupWithViewPager(viewPager);
        setIconToTabs();

        return view;
    }

    private void setIconToTabs()
    {
        for (int i=0 ; i<3 ;i++)
        {
            tabLayout.getTabAt(i).setIcon(getResources(i));
        }
    }
    private int getResources(int res)
    {
        switch (res)
        {
            case 0 :
                return R.drawable.explore;

            case 1 :
                return R.drawable.white_profile;

            case 2 :
                return R.drawable.notification_ubactive;

            default:
                return 10;
        }
    }
}
