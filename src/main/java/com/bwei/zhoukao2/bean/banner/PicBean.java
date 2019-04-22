package com.bwei.zhoukao2.bean.banner;

import java.util.List;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 11:44
 * @Description：描述信息
 */
public class PicBean {
    private List<MyResult> result;
    private String message;
    private  String status;

    @Override
    public String toString() {
        return "PicBean{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public List<MyResult> getResult() {
        return result;
    }

    public void setResult(List<MyResult> result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PicBean(List<MyResult> result, String message, String status) {
        this.result = result;
        this.message = message;
        this.status = status;
    }
}
