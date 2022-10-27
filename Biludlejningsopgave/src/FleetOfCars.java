import java.util.ArrayList;

public class FleetOfCars extends ACar implements Car{
    String registrationNumber;



    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){

    }
    int getTotalRegistrationFeeForFleet = 0;



    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }


}

