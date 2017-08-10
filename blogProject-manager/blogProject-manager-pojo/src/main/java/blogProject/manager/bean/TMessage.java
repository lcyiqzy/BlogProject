package blogProject.manager.bean;

import java.util.Date;

public class TMessage {

    private Integer id;

    private String messageContent;

    private Integer messageSenderId;

    private Integer messageReceiverId;

    private Date messageDate;

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

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public String toString() {
        return "TMessage [id=" + id + ", messageContent=" + messageContent + ", messageSenderId=" + messageSenderId
                + ", messageReceiverId=" + messageReceiverId + ", messageDate=" + messageDate + "]";
    }

}
