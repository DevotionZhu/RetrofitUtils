package com.example.network.api;

import java.util.List;

public class BannerBean {


    /**
     * errcode : 0
     * errmsg : 调用成功
     * total : 3
     * list : [{"carTypeName":"WEY VV5","carTypeImg":"https://amp-test.gwm.com.cn/web/resource/weymall/vv5_0105.png","mallHref":"http://mall.wey.com/m/item-index-g379.html"},{"carTypeName":"WEY VV6","carTypeImg":"https://amp-test.gwm.com.cn/web/resource/weymall/vv6.png","mallHref":"http://mall.wey.com/m/item-index-g358.html"},{"carTypeName":"WEY VV7","carTypeImg":"https://amp-test.gwm.com.cn/web/resource/weymall/vv7.png","mallHref":"http://mall.wey.com/m/item-index-g2.html"}]
     * object : {}
     */

    private int errcode;
    private String errmsg;
    private int total;
    private ObjectBean object;
    private List<ListBean> list;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ObjectBean getObject() {
        return object;
    }

    public void setObject(ObjectBean object) {
        this.object = object;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ObjectBean {
    }

    public static class ListBean {
        /**
         * carTypeName : WEY VV5
         * carTypeImg : https://amp-test.gwm.com.cn/web/resource/weymall/vv5_0105.png
         * mallHref : http://mall.wey.com/m/item-index-g379.html
         */

        private String carTypeName;
        private String carTypeImg;
        private String mallHref;

        public String getCarTypeName() {
            return carTypeName;
        }

        public void setCarTypeName(String carTypeName) {
            this.carTypeName = carTypeName;
        }

        public String getCarTypeImg() {
            return carTypeImg;
        }

        public void setCarTypeImg(String carTypeImg) {
            this.carTypeImg = carTypeImg;
        }

        public String getMallHref() {
            return mallHref;
        }

        public void setMallHref(String mallHref) {
            this.mallHref = mallHref;
        }
    }
}
