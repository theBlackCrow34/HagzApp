package proff.freelancer.sherif.hagzapp.models;

public class ModelChat {

    private String message;
    private String send;
    private String receiver;
    private String time;

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public ModelChat(String message, String send, String receiver, String time) {

        this.message = message;
        this.send = send;
        this.receiver = receiver;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public ModelChat() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
