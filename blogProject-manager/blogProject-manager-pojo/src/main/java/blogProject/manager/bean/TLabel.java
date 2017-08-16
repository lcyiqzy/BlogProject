package blogProject.manager.bean;

public class TLabel {
    private Integer id;

    private String labelName;

    private String labelPicUrl;

    private String labelRealUrl;

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

    public String getLabelRealUrl() {
        return labelRealUrl;
    }

    public void setLabelRealUrl(String labelRealUrl) {
        this.labelRealUrl = labelRealUrl == null ? null : labelRealUrl.trim();
    }
}