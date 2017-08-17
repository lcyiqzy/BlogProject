package blogProject.manager.bean;

public class TUserToken {
    private Integer id;

    private Integer userId;

    private String pswToken;

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

    public String getPswToken() {
        return pswToken;
    }

    public void setPswToken(String pswToken) {
        this.pswToken = pswToken == null ? null : pswToken.trim();
    }
}