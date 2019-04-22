package com.bwei.zhoukao2.bean.banner;

import com.stx.xhb.xbanner.entity.SimpleBannerInfo;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 11:40
 * @Description：描述信息
 */
public class MyResult extends SimpleBannerInfo {
    private  String imageUrl;
    private  String jumpUrl;
    private  String rank;
    private  String title;

    @Override
    public String toString() {
        return "MyResult{" +
                "imageUrl='" + imageUrl + '\'' +
                ", jumpUrl='" + jumpUrl + '\'' +
                ", rank='" + rank + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MyResult(String imageUrl, String jumpUrl, String rank, String title) {
        this.imageUrl = imageUrl;
        this.jumpUrl = jumpUrl;
        this.rank = rank;
        this.title = title;
    }

    @Override
    public Object getXBannerUrl() {
        return null;
    }
}
