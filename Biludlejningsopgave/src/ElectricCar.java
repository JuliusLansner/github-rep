import java.util.Scanner;

public class ElectricCar extends ACar{
    //
    //
    int cost;
   private double batteryCapKwh = 0;
    private double maxRangeKm = 0;
    private double whPrKm = batteryCapKwh/maxRangeKm;



    private double getBatteryCapacityKWh() {
        System.out.println("Enter the battery capacity of your car: ");
        int answer = scanner.nextInt();
        batteryCapKwh = answer;
        return batteryCapKwh;
    }
    private  double getMaxRangeKm(){
        System.out.println("Enter the max range of your car:  ");
        int answer = scanner.nextInt();
        maxRangeKm = answer;
        return maxRangeKm;
    }
    private double getWhPrKm(){
        double whKmToL = (100 / (whPrKm / 91.25));
        System.out.println("your Wh/km is: " +whKmToL);
        return whKmToL;
    }


    @Override
    public int getRegistrationFee() {
        int regFee=0;
        if(getWhPrKm()>=20 && getWhPrKm() <=50) {
            regFee=330;
        }

        if(getWhPrKm()>=15 && getWhPrKm() <=20){
            regFee=1050;
        }

        if(getWhPrKm()>=10 && getWhPrKm() <=15){
            regFee=2340;

        }
        if(getWhPrKm()>=5 && getWhPrKm() <=10){
            regFee = 5500;
        }
        if(getWhPrKm()<5){
            regFee=10470;
        }
        cost = regFee;
        return cost;
    }

    @Override
    public String toString() {
        return "ElectricCar: " + ", Registration cost: " + cost + ", Battery capacity: " + batteryCapKwh + ", Maximum range in KM" + maxRangeKm + ", wh/ km: " + whPrKm + "} " + super.toString();
    }


}
