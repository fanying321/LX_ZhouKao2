package com.bwei.zhoukao2.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bwei.zhoukao2.R;
import com.bwei.zhoukao2.adapter.RecyclerAdapter;
import com.bwei.zhoukao2.bean.banner.MyResult;
import com.bwei.zhoukao2.bean.banner.PicBean;
import com.bwei.zhoukao2.bean.home.AllBean;
import com.bwei.zhoukao2.bean.home.ShopBean;
import com.bwei.zhoukao2.mvp.model.ShowModel;
import com.bwei.zhoukao2.mvp.presenter.ShowPresenter;
import com.bwei.zhoukao2.mvp.view.ShowView;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.stx.xhb.xbanner.XBanner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 10:32
 * @Description：描述信息
 */
public class ShouFragment extends Fragment implements ShowView {

    private XBanner banner;
    private XRecyclerView recyclerView;
    private String PicUrl = "http://172.17.8.100/small/commodity/v1/bannerShow";
    private String ShowUrl = "http://172.17.8.100/small/commodity/v1/commodityList";
    private ShowPresenter presenter;
    private RecyclerAdapter adapter;
    //jid
    private List<AllBean> allBeans = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shou,container,false);
        //初始化组件
        banner = view.findViewById(R.id.banner);
        recyclerView = view.findViewById(R.id.recycler);
        presenter = new ShowPresenter(new ShowModel(), this);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //设置图片
        banner.loadImage(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                MyResult result = (MyResult) model;
                Glide.with(getActivity()).load(result.getImageUrl()).into((ImageView) view);
            }
        });
        //创建布局适配器
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //设置布局管理器
        recyclerView.setLayoutManager(manager);
        //设置适配器
        adapter = new RecyclerAdapter(getActivity());
        //设置适配器
        recyclerView.setAdapter(adapter);
        //获取XBanner图片
        presenter.Showget(0,PicUrl);
        presenter.Showget(1,ShowUrl);
    }

    @Override
    public void success(int type, String data) {
        //轮播
        if (type == 0){
            Gson gson = new Gson();
            PicBean picBean = gson.fromJson(data, PicBean.class);
            List<MyResult> results = picBean.getResult();
            banner.setBannerData(results);
        }else if (type == 1){
            ShopBean shopBean = new Gson().fromJson(data, ShopBean.class);
            ShopBean.ResultBean result = shopBean.getResult();
            // 热销新品的bean
            ShopBean.ResultBean.RxxpBean rxxp = result.getRxxp();
            //魔力时尚的bean
            ShopBean.ResultBean.MlssBean mlss = result.getMlss();
            //品质生活的bean
            ShopBean.ResultBean.PzshBean pzsh = result.getPzsh();

            //空的allBean
            allBeans.add(rxxp);
            allBeans.add(mlss);
            allBeans.add(pzsh);
            adapter.setData(allBeans);
        }
    }

    @Override
    public void fail(String error) {
        Toast.makeText(getActivity(),error,Toast.LENGTH_SHORT);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }
}
