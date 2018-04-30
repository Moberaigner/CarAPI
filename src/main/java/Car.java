
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name="Car.findAll", query="select c from Car c")
@XmlRootElement
public class Car {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String make;
    String model;
    String displacement;
    String cylinders;
    String transmission;
    String drive;
    String fuel;
    String buildyear;

    public Car(String make, String model, String displacement, String cylinders, String transmission, String drive, String fuel, String year) {
        this.make = make;
        this.model = model;
        this.displacement = displacement;
        this.cylinders = cylinders;
        this.transmission = transmission;
        this.drive = drive;
        this.fuel = fuel;
        this.buildyear = year;
    }

    public Car(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getCylinders() {
        return cylinders;
    }

    public void setCylinders(String cylinders) {
        this.cylinders = cylinders;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getBuildyear() {
        return buildyear;
    }

    public void setBuildyear(String year) {
        this.buildyear = buildyear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
