package com.bwei.zhoukao2.mvp.presenter;

import com.bwei.zhoukao2.mvp.model.Model;
import com.bwei.zhoukao2.mvp.view.ShowView;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 11:32
 * @Description：描述信息
 */
public class ShowPresenter implements Presenter, Model.CallBack {
    private Model model;
    private ShowView showView;
    public ShowPresenter(Model model, ShowView showView){
        this.model = model;
        this.showView = showView;
    }
    @Override
    public void Showget(int type, String url) {
        model.showData(type,url,this);
    }

    @Override
    public void success(int type, String data) {
        showView.success(type,data);
    }

    @Override
    public void fail(String error) {
        showView.fail(error);
    }
    //销毁
    public void destroy(){
        if (model != null){
            model = null;
        }
        if (showView != null){
            showView = null;
        }
    }
}
