package blogProject.manager.bean;

import java.util.Date;

public class TUser {

    private Integer id;

    private String userLonginacct;

    private String userName;

    private String userEmail;

    private String userPhone;

    private Integer userPermission;

    private Integer followNum;

    private Integer followedNum;

    private Integer registState;

    private String registCode;

    private String registEmailUrl;

    private String userPassword;

    private String passwordRetrieveUrl;

    private Date registDate;

    private Integer articleNum;

    private String userSelfIntroduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLonginacct() {
        return userLonginacct;
    }

    public void setUserLonginacct(String userLonginacct) {
        this.userLonginacct = userLonginacct == null ? null : userLonginacct.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(Integer userPermission) {
        this.userPermission = userPermission;
    }

    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

    public Integer getFollowedNum() {
        return followedNum;
    }

    public void setFollowedNum(Integer followedNum) {
        this.followedNum = followedNum;
    }

    public Integer getRegistState() {
        return registState;
    }

    public void setRegistState(Integer registState) {
        this.registState = registState;
    }

    public String getRegistCode() {
        return registCode;
    }

    public void setRegistCode(String registCode) {
        this.registCode = registCode == null ? null : registCode.trim();
    }

    public String getRegistEmailUrl() {
        return registEmailUrl;
    }

    public void setRegistEmailUrl(String registEmailUrl) {
        this.registEmailUrl = registEmailUrl == null ? null : registEmailUrl.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getPasswordRetrieveUrl() {
        return passwordRetrieveUrl;
    }

    public void setPasswordRetrieveUrl(String passwordRetrieveUrl) {
        this.passwordRetrieveUrl = passwordRetrieveUrl == null ? null : passwordRetrieveUrl.trim();
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Integer getArticleNum() {
        return articleNum;
    }

    public void setArticleNum(Integer articleNum) {
        this.articleNum = articleNum;
    }

    public String getUserSelfIntroduction() {
        return userSelfIntroduction;
    }

    public void setUserSelfIntroduction(String userSelfIntroduction) {
        this.userSelfIntroduction = userSelfIntroduction == null ? null : userSelfIntroduction.trim();
    }

    @Override
    public String toString() {
        return "TUser [id=" + id + ", userLonginacct=" + userLonginacct + ", userName=" + userName + ", userEmail="
                + userEmail + ", userPhone=" + userPhone + ", userPermission=" + userPermission + ", followNum="
                + followNum + ", followedNum=" + followedNum + ", registState=" + registState + ", registCode="
                + registCode + ", registEmailUrl=" + registEmailUrl + ", userPassword=" + userPassword
                + ", passwordRetrieveUrl=" + passwordRetrieveUrl + ", registDate=" + registDate + ", articleNum="
                + articleNum + ", userSelfIntroduction=" + userSelfIntroduction + "]";
    }

}
