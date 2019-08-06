package proff.freelancer.sherif.hagzapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import proff.freelancer.sherif.hagzapp.fragment.ExploreFragment;
import proff.freelancer.sherif.hagzapp.fragment.MailFragment;
import proff.freelancer.sherif.hagzapp.fragment.NotificationsFragment;
import proff.freelancer.sherif.hagzapp.fragment.ProfileFragmentPres;
import proff.freelancer.sherif.hagzapp.fragment.ProfileFragmentUser;

public class TabsAccessorPresAdapter extends FragmentPagerAdapter {

    public TabsAccessorPresAdapter(FragmentManager fm) {
        super(fm);
    } //changed frm fragmentManager

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 :
                ProfileFragmentPres profileFragmentPres = new ProfileFragmentPres();
                return profileFragmentPres;
            case 1 :
                MailFragment mailFragment = new MailFragment();
                return mailFragment;

            case 2 :
                NotificationsFragment notificationsFragment = new NotificationsFragment();
                return notificationsFragment;

            default:
                return null;
        }
    }

    ///////////////////////////count of fragments///////////////////////
    @Override
    public int getCount() {
        return 3;
    }

}
