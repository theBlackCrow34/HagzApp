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

import proff.freelancer.sherif.hagzapp.DrawerActivity;
import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.adapters.TabsAccessorAdapter;

public class MainAppBarActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsAccessorAdapter tabsAccessorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_bar);

        toolbar = (Toolbar) findViewById(R.id.main_page_toolbar_p);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("مناسبات");

        viewPager = (ViewPager) findViewById(R.id.main_tabs_pager_p);
        tabsAccessorAdapter = new TabsAccessorAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabsAccessorAdapter);

        tabLayout = (TabLayout) findViewById(R.id.main_tabs_patient);
        tabLayout.setupWithViewPager(viewPager);
        setIconToTabs();
    }
    private void setIconToTabs()
    {
        for (int i=0 ; i<4 ;i++)
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
                return R.drawable.notification_ubactive;

            case 2 :
                return R.drawable.mail;

            case 3 :
                return R.drawable.profile_down;

                default:
                    return 10;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.nav_profile:
                Intent intentp = new Intent(getApplicationContext(),RegisterUser.class);
                startActivity(intentp);
                break;
            case R.id.nav_logout :
                Intent intentl = new Intent(getApplicationContext(),MainOptionLogin.class);
                startActivity(intentl);
                finishAffinity();
                Toast.makeText(this, "تم تسجيل الخروج", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_basket :
                Intent intent = new Intent(getApplicationContext(),MyBagActivity.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(getApplicationContext(),"no thing",Toast.LENGTH_SHORT).show();
                break;
        }
        return true ;
    }
}
