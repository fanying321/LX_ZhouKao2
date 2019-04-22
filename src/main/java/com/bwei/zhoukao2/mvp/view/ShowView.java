package com.bwei.zhoukao2.mvp.view;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 11:20
 * @Description：描述信息
 */
public interface ShowView {
    void success(int type,String data);//成功

    void fail(String error);//失败
}
