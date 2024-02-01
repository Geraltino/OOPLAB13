package ie.atu.productv4;

public class Tv extends Product {

    private String screensize;
    private String manufacture;

    public Tv() {
        super();
        screensize = "";
        manufacture = "";
        count++;
    }

    public void setscreensize(String screensize) {
        this.screensize = screensize;
    }
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public String getScreensize() {
        return screensize;
    }
    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture + "\n" + screensize;
    }
}
