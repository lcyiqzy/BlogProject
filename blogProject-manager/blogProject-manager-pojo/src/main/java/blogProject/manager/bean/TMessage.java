package blogProject.manager.bean;

public class TMessage {
    private Integer id;

    private String messageContent;

    private Integer messageSenderId;

    private Integer messageReceiverId;

    private String messageDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public Integer getMessageSenderId() {
        return messageSenderId;
    }

    public void setMessageSenderId(Integer messageSenderId) {
        this.messageSenderId = messageSenderId;
    }

    public Integer getMessageReceiverId() {
        return messageReceiverId;
    }

    public void setMessageReceiverId(Integer messageReceiverId) {
        this.messageReceiverId = messageReceiverId;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate == null ? null : messageDate.trim();
    }
}