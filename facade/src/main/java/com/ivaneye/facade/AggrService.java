package com.ivaneye.facade;

/**
 * @author ivaneye
 * @since 2021-02-09 15:31:16
 */
public class AggrService {

    public String detailInfo() {
        // 获取商品详情
        String prodDetail = new ProdService().prodDetail();
        // 获取商品评论
        String commentList = new CommentService().commentList();
        // 获取商品推荐
        String recommendList = new RecommendService().recommendList();
        // 组装结果
        StringBuilder sb = new StringBuilder();
        sb.append(prodDetail).append("\n")
                .append(commentList).append("\n")
                .append(recommendList).append("\n");
        return sb.toString();
    }
}
