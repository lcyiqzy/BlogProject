package blogProject.manager.bean;

import java.util.Date;

public class TCommit {

    private Integer id;

    private String commitContent;

    private Integer commitUserId;

    private Integer commitArticleId;

    private Date commitDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommitContent() {
        return commitContent;
    }

    public void setCommitContent(String commitContent) {
        this.commitContent = commitContent == null ? null : commitContent.trim();
    }

    public Integer getCommitUserId() {
        return commitUserId;
    }

    public void setCommitUserId(Integer commitUserId) {
        this.commitUserId = commitUserId;
    }

    public Integer getCommitArticleId() {
        return commitArticleId;
    }

    public void setCommitArticleId(Integer commitArticleId) {
        this.commitArticleId = commitArticleId;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    @Override
    public String toString() {
        return "TCommit [id=" + id + ", commitContent=" + commitContent + ", commitUserId=" + commitUserId
                + ", commitArticleId=" + commitArticleId + ", commitDate=" + commitDate + "]";
    }

}
