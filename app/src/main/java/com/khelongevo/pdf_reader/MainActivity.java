package com.khelongevo.pdf_reader;

import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    // Initialize reference of class pdfView
    public PDFView pdfView;

    private static final String TAG = "MainActivity";
    private PartPagerAdapter sectionPagerAdapter;
    private ViewPager viewPager;

    private BottomNavigationView mMainBottomNav;
    private FrameLayout mMainFrame;
    private HomeFragment homeFragment;
    private FileFragment fileFragment;
    private SearchFragment searchFragment;
    //private CharSequence mTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Add tab with action bar home
        sectionPagerAdapter = new PartPagerAdapter(getSupportFragmentManager());

        viewPager = findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.list_view_icon);
        tabLayout.getTabAt(1).setIcon(R.drawable.grid_view_icon);

    }

    public void setupViewPager(ViewPager viewPager) {
        PartPagerAdapter adapter = new PartPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new GridViewFragment());
        adapter.addFragment(new ListViewFragment());
        viewPager.setAdapter(adapter);
    }


//    public void restoreActionBar() {
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
//        actionBar.setDisplayShowTitleEnabled(true);
//        actionBar.setTitle(mTitle);
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        if (!mMainBottomNav.isEnabled()) {
//            getMenuInflater().inflate(R.menu.navigation_item, menu);
//            restoreActionBar();
//            return true;
//        }
//        return super.onCreateOptionsMenu(menu);
//    }
}
