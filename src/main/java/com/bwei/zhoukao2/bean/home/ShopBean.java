package com.bwei.zhoukao2.bean.home;

import java.util.List;

/**
 * @Author：莹
 * @E-mail： 2016906034@qq.com
 * @Date：2019/4/20 16:19
 * @Description：描述信息
 */
public class ShopBean {


    /**
     * message : 查询成功
     * result : {"mlss":{"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":0},{"commodityId":24,"commodityName":"百搭小白鞋 女款 时尚舒适板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/7/1.jpg","price":149,"saleNum":0}],"id":1003,"name":"魔力时尚"},"pzsh":{"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":0},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9,"saleNum":0},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":156},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":0}],"id":1004,"name":"品质生活"},"rxxp":{"commodityList":[{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","masterPic":"http://172.17.8.100/images/small/commodity/nx/ddx/5/1.jpg","price":278,"saleNum":0},{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/6/1.jpg","price":139,"saleNum":0},{"commodityId":17,"commodityName":"化妆镜","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31,"saleNum":0}],"id":1002,"name":"热销新品"}}
     * status : 0000
     */

    private String message;
    private ResultBean result;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        /**
         * mlss : {"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":0},{"commodityId":24,"commodityName":"百搭小白鞋 女款 时尚舒适板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/7/1.jpg","price":149,"saleNum":0}],"id":1003,"name":"魔力时尚"}
         * pzsh : {"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":0},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9,"saleNum":0},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":156},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":0}],"id":1004,"name":"品质生活"}
         * rxxp : {"commodityList":[{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","masterPic":"http://172.17.8.100/images/small/commodity/nx/ddx/5/1.jpg","price":278,"saleNum":0},{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/6/1.jpg","price":139,"saleNum":0},{"commodityId":17,"commodityName":"化妆镜","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31,"saleNum":0}],"id":1002,"name":"热销新品"}
         */

        private MlssBean mlss;
        private PzshBean pzsh;
        private RxxpBean rxxp;

        public MlssBean getMlss() {
            return mlss;
        }

        public void setMlss(MlssBean mlss) {
            this.mlss = mlss;
        }

        public PzshBean getPzsh() {
            return pzsh;
        }

        public void setPzsh(PzshBean pzsh) {
            this.pzsh = pzsh;
        }

        public RxxpBean getRxxp() {
            return rxxp;
        }

        public void setRxxp(RxxpBean rxxp) {
            this.rxxp = rxxp;
        }

        public static class MlssBean implements AllBean{
            /**
             * commodityList : [{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":0},{"commodityId":24,"commodityName":"百搭小白鞋 女款 时尚舒适板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/7/1.jpg","price":149,"saleNum":0}]
             * id : 1003
             * name : 魔力时尚
             */

            private int id;
            private String name;
            private List<CommodityListBean> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBean> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBean> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBean {
                /**
                 * commodityId : 32
                 * commodityName : 唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋
                 * masterPic : http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg
                 * price : 88
                 * saleNum : 0
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class PzshBean implements AllBean{
            /**
             * commodityList : [{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":0},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9,"saleNum":0},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":156},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":0}]
             * id : 1004
             * name : 品质生活
             */

            private int id;
            private String name;
            private List<CommodityListBeanX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanX {
                /**
                 * commodityId : 6
                 * commodityName : 轻柔系自然裸妆假睫毛
                 * masterPic : http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg
                 * price : 39
                 * saleNum : 0
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class RxxpBean implements AllBean{
            /**
             * commodityList : [{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","masterPic":"http://172.17.8.100/images/small/commodity/nx/ddx/5/1.jpg","price":278,"saleNum":0},{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/6/1.jpg","price":139,"saleNum":0},{"commodityId":17,"commodityName":"化妆镜","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31,"saleNum":0}]
             * id : 1002
             * name : 热销新品
             */

            private int id;
            private String name;
            private List<CommodityListBeanXX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanXX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanXX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanXX {
                /**
                 * commodityId : 29
                 * commodityName : 秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲
                 * masterPic : http://172.17.8.100/images/small/commodity/nx/ddx/5/1.jpg
                 * price : 278
                 * saleNum : 0
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }
    }
}
