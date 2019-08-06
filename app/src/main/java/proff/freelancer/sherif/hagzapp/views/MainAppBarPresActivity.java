package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.adapters.TabsAccessorAdapter;
import proff.freelancer.sherif.hagzapp.adapters.TabsAccessorPresAdapter;

public class MainAppBarPresActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsAccessorPresAdapter tabsAccessorpresAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_bar_pres);

        toolbar = (Toolbar) findViewById(R.id.main_page_toolbar_pres);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("مناسبات");

        viewPager = (ViewPager) findViewById(R.id.main_tabs_pager_pres);
        tabsAccessorpresAdapter = new TabsAccessorPresAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabsAccessorpresAdapter);

        tabLayout = (TabLayout) findViewById(R.id.main_tabs_patient_pres);
        tabLayout.setupWithViewPager(viewPager);
        setIconToTabs();
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
                return R.drawable.profile_down;

            case 1 :
                return R.drawable.mail;

            case 2 :
                return R.drawable.notification_ubactive;


            default:
                return 10;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pres,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.nav_logout_pres :
                Intent intentl = new Intent(getApplicationContext(),MainOptionLogin.class);
                startActivity(intentl);
                finishAffinity();
                Toast.makeText(this, "تم تسجيل الخروج", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),"no thing",Toast.LENGTH_SHORT).show();
                break;
        }
        return true ;
    }
}
