package proff.freelancer.sherif.hagzapp.models;

public class ModelNotification {

    private int image;
    private String message;
    private String presId;

    public ModelNotification() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPresId() {
        return presId;
    }

    public void setPresId(String presId) {
        this.presId = presId;
    }

    public ModelNotification(int image, String message, String presId) {

        this.image = image;
        this.message = message;
        this.presId = presId;
    }
}
