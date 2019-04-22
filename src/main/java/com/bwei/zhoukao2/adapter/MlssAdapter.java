package com.bwei.zhoukao2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bwei.zhoukao2.R;
import com.bwei.zhoukao2.bean.home.ShopBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 17:38
 * @Description：描述信息
 */
public class MlssAdapter extends RecyclerView.Adapter<MlssAdapter.MlssVieWHolder> {
    private Context context;
    private List<ShopBean.ResultBean.MlssBean.CommodityListBean> commodityList = new ArrayList<>();

    public MlssAdapter(Context context, List<ShopBean.ResultBean.MlssBean.CommodityListBean> commodityList) {
        this.context = context;
        this.commodityList = commodityList;
    }

    @NonNull
    @Override
    public MlssVieWHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, R.layout.mlss_item,null);
        MlssVieWHolder holder = new MlssVieWHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MlssVieWHolder mlssVieWHolder, int i) {
        mlssVieWHolder.title.setText(commodityList.get(i).getCommodityName());
        mlssVieWHolder.price.setText("￥" + commodityList.get(i).getPrice()+"");
        Glide.with(context).load(commodityList.get(i).getMasterPic()).into(mlssVieWHolder.iamge);
        Toast.makeText(context,commodityList.get(i).toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public int getItemCount() {
        return commodityList.size();
    }

    public class MlssVieWHolder extends RecyclerView.ViewHolder {
        TextView title,price;
        ImageView iamge;
        public MlssVieWHolder(@NonNull View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.tv_title);
            price=(TextView) itemView.findViewById(R.id.price);
            iamge=(ImageView) itemView.findViewById(R.id.image_view);
        }
    }
}
