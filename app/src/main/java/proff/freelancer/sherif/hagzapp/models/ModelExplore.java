package proff.freelancer.sherif.hagzapp.models;

public class ModelExplore {
    private int img;
    private String presId;
    private String description;
    private String title;
    private Float rate;
    private String address;
    private int salary;
    private String namePres;

    public String getNamePres() {
        return namePres;
    }

    public void setNamePres(String namePres) {
        this.namePres = namePres;
    }

    public ModelExplore(int img, String presId, String description, String title, Float rate, String address, int salary, String namePres) {

        this.img = img;
        this.presId = presId;
        this.description = description;
        this.title = title;
        this.rate = rate;
        this.address = address;
        this.salary = salary;
        this.namePres = namePres;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ModelExplore() {

    }

    public ModelExplore(int img, String presId, String description, String title, Float rate, String address, int salary) {

        this.img = img;
        this.presId = presId;
        this.description = description;
        this.title = title;
        this.rate = rate;
        this.address = address;
        this.salary = salary;
    }
}
