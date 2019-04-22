package com.bwei.zhoukao2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwei.zhoukao2.R;
import com.bwei.zhoukao2.bean.home.ShopBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 17:53
 * @Description：描述信息
 */
public class PzshAdapter extends RecyclerView.Adapter<PzshAdapter.PzshVieWHolder>{
    private Context context;
    private List<ShopBean.ResultBean.PzshBean.CommodityListBeanX> commodityList = new ArrayList<>();

    public PzshAdapter(Context context, List<ShopBean.ResultBean.PzshBean.CommodityListBeanX> commodityList) {
        this.context = context;
        this.commodityList = commodityList;
    }

    @NonNull
    @Override
    public PzshVieWHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context,R.layout.pzsh_irem,null);
        PzshVieWHolder holder = new PzshVieWHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PzshVieWHolder pzshVieWHolder, int i) {
        pzshVieWHolder.title.setText(commodityList.get(i).getCommodityName());
        pzshVieWHolder.price.setText("￥" + commodityList.get(i).getPrice()+"");
        Glide.with(context).load(commodityList.get(i).getMasterPic()).into(pzshVieWHolder.iamge);
    }

    @Override
    public int getItemCount() {
        return commodityList.size();
    }

    public class PzshVieWHolder extends RecyclerView.ViewHolder {
        TextView title,price;
        ImageView iamge;
        public PzshVieWHolder(@NonNull View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.tv_title);
            price=(TextView) itemView.findViewById(R.id.price);
            iamge=(ImageView) itemView.findViewById(R.id.image_view);
        }
    }
}
