package blogProject.manager.bean;

public class TLabel {

    private Integer id;

    private String labelName;

    private String labelPicUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public String getLabelPicUrl() {
        return labelPicUrl;
    }

    public void setLabelPicUrl(String labelPicUrl) {
        this.labelPicUrl = labelPicUrl == null ? null : labelPicUrl.trim();
    }

    @Override
    public String toString() {
        return "TLabel [id=" + id + ", labelName=" + labelName + ", labelPicUrl=" + labelPicUrl + "]";
    }

}
