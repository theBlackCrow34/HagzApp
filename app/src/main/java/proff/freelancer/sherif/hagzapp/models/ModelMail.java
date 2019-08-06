package proff.freelancer.sherif.hagzapp.models;

public class ModelMail {

    private int img;
    private String presId;
    private String message;
    private String presName;
    private String time;

    public ModelMail() {
    }

    public ModelMail(int img, String presId, String message, String presName, String time) {
        this.img = img;
        this.presId = presId;
        this.message = message;
        this.presName = presName;
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPresId() {
        return presId;
    }

    public void setPresId(String presId) {
        this.presId = presId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPresName() {
        return presName;
    }

    public void setPresName(String presName) {
        this.presName = presName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
