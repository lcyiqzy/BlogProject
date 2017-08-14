package blogProject.manager.bean;

public class TArticle {

    private Integer id;

    private String articleName;

    private String articleAuthor;

    private String articleUrl;

    private Integer articleReadNum;

    private Integer articleLikeNum;

    private Integer articleFollowNum;

    private Integer articleCommitNum;

    private String articleDate;

    private String articlePicUrl;

    private Integer authorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor == null ? null : articleAuthor.trim();
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public Integer getArticleReadNum() {
        return articleReadNum;
    }

    public void setArticleReadNum(Integer articleReadNum) {
        this.articleReadNum = articleReadNum;
    }

    public Integer getArticleLikeNum() {
        return articleLikeNum;
    }

    public void setArticleLikeNum(Integer articleLikeNum) {
        this.articleLikeNum = articleLikeNum;
    }

    public Integer getArticleFollowNum() {
        return articleFollowNum;
    }

    public void setArticleFollowNum(Integer articleFollowNum) {
        this.articleFollowNum = articleFollowNum;
    }

    public Integer getArticleCommitNum() {
        return articleCommitNum;
    }

    public void setArticleCommitNum(Integer articleCommitNum) {
        this.articleCommitNum = articleCommitNum;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticlePicUrl() {
        return articlePicUrl;
    }

    public void setArticlePicUrl(String articlePicUrl) {
        this.articlePicUrl = articlePicUrl == null ? null : articlePicUrl.trim();
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "TArticle [id=" + id + ", articleName=" + articleName + ", articleAuthor=" + articleAuthor
                + ", articleUrl=" + articleUrl + ", articleReadNum=" + articleReadNum + ", articleLikeNum="
                + articleLikeNum + ", articleFollowNum=" + articleFollowNum + ", articleCommitNum=" + articleCommitNum
                + ", articleDate=" + articleDate + ", articlePicUrl=" + articlePicUrl + ", authorId=" + authorId + "]";
    }

}
