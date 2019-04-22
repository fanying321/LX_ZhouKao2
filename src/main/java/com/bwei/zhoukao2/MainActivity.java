package com.bwei.zhoukao2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bwei.zhoukao2.fragment.ShouFragment;
import com.bwei.zhoukao2.fragment.WoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private RadioGroup mRadio;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.viewpager);
        mRadio = findViewById(R.id.raiodgroup);
        list = new ArrayList<>();
        list.add(new ShouFragment());
        list.add(new WoFragment());
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return list.get(i);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                mRadio.check(mRadio.getChildAt(i).getId());
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        mRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.rb2:
                        mViewPager.setCurrentItem(1);
                        break;
                }
            }
        });
    }
}
