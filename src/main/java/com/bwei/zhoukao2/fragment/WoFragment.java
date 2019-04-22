package com.bwei.zhoukao2.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.zhoukao2.R;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 10:32
 * @Description：描述信息
 */
public class WoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wo,container,false);
        return view;
    }
}
