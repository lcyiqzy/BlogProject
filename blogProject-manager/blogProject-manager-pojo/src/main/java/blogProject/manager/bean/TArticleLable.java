package blogProject.manager.bean;

public class TArticleLable {

    private Integer id;

    private Integer articleId;

    private Integer labelId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    @Override
    public String toString() {
        return "TArticleLable [id=" + id + ", articleId=" + articleId + ", labelId=" + labelId + "]";
    }

}
