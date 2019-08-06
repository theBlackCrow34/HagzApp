package proff.freelancer.sherif.hagzapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import proff.freelancer.sherif.hagzapp.fragment.ExploreFragment;
import proff.freelancer.sherif.hagzapp.fragment.MailFragment;
import proff.freelancer.sherif.hagzapp.fragment.NotificationsFragment;
import proff.freelancer.sherif.hagzapp.fragment.ProfileFragmentUser;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    } //changed frm fragmentManager

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 :
                ExploreFragment exploreFragment = new ExploreFragment();
                return exploreFragment;
            case 1 :
                NotificationsFragment notificationsFragment = new NotificationsFragment();
                return notificationsFragment;
            case 2 :
                MailFragment mailFragment = new MailFragment();
                return mailFragment;

            case 3 :
                ProfileFragmentUser profileFragmentUser = new ProfileFragmentUser();
                return profileFragmentUser;
            default:
                return null;
        }
    }

    ///////////////////////////count of fragments///////////////////////
    @Override
    public int getCount() {
        return 4;
    }

}
