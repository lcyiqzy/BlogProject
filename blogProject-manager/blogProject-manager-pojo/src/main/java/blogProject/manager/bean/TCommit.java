package blogProject.manager.bean;

public class TCommit {
    private Integer id;

    private String commitContent;

    private Integer commitUserId;

    private Integer commitArticleId;

    private String commitDate;

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

    public String getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(String commitDate) {
        this.commitDate = commitDate == null ? null : commitDate.trim();
    }
}