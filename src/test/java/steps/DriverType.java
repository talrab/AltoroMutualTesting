package steps;

/**
 * Created by tal on 25/01/2017.
 */
public enum DriverType {
    CHROME("Chrome"),IE("IE"), FIREFOX("Firefox");

    private String name;

    DriverType (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
