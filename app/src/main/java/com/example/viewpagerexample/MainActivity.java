package com.example.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(ViewPagerFragment.newInstance("Apple", "https://www.dialfredo.com/wp-content/uploads/2015/05/redapplepic.jpg"));
        fragmentList.add(ViewPagerFragment.newInstance("Orange", "https://colourchroma.files.wordpress.com/2011/08/orange.jpg"));
        fragmentList.add(ViewPagerFragment.newInstance("Banana", "https://target.scene7.com/is/image/Target/GUEST_f5d0cfc3-9d02-4ee0-a6c6-ed5dc09971d1?wid=488&hei=488&fmt=pjpeg"));

        ViewPager viewPager = findViewById(R.id.mainActivity_viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragmentList));
    }
}
