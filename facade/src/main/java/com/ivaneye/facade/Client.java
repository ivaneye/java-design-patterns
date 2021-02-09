package com.ivaneye.facade;

/**
 * @author ivaneye
 * @since 2021-02-09 15:27:45
 */
public class Client {
    public static void main(String[] args) {
        // 分别调用
        // 获取商品详情
        String prodDetail = new ProdService().prodDetail();
        System.out.println(prodDetail);
        // 获取商品评论
        String commentList = new CommentService().commentList();
        System.out.println(commentList);
        // 获取商品推荐
        String recommendList = new RecommendService().recommendList();
        System.out.println(recommendList);
        System.out.println("============================");
        // 聚合服务调用
        String result = new AggrService().detailInfo();
        System.out.println(result);
    }
}
