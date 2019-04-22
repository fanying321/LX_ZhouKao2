package com.bwei.zhoukao2.mvp.model;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 11:21
 * @Description：描述信息
 */
public interface Model {
    public interface CallBack{
        void success(int type,String data);
        void fail(String error);
    }
    void showData(int type,String url,CallBack callBack);
}
