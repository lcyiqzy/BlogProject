package blogProject.manager.bean;

public class TUserArticle {
    private Integer id;

    private Integer userId;

    private Integer writeArticleId;

    private Integer likeArticleId;

    private Integer followArticleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWriteArticleId() {
        return writeArticleId;
    }

    public void setWriteArticleId(Integer writeArticleId) {
        this.writeArticleId = writeArticleId;
    }

    public Integer getLikeArticleId() {
        return likeArticleId;
    }

    public void setLikeArticleId(Integer likeArticleId) {
        this.likeArticleId = likeArticleId;
    }

    public Integer getFollowArticleId() {
        return followArticleId;
    }

    public void setFollowArticleId(Integer followArticleId) {
        this.followArticleId = followArticleId;
    }
}