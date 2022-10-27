import java.util.Scanner;

public class DieselCar extends AFuelCar{


    int filterTax = 0;
    private String typeOfFuel;
    private int cost;
    private final int doors =5;
    int dieselRegFee = 0;
    @Override
    String getFuelType() {
        typeOfFuel = "Diesel";
        return typeOfFuel;

    }




    public int getRegistrationFee() {
        int regFee=0;
        int equalizationTax=0;
        if(kmPrLiter>=20 && kmPrLiter <=50) {
            regFee=330;
            equalizationTax = 130;

        }

        if(kmPrLiter>=15 && kmPrLiter <=20){
            regFee=1050;
            equalizationTax = 1390;

        }

        if(kmPrLiter>=10 && kmPrLiter <=15){
            regFee=2340;
            equalizationTax = 1850;

        }
        if(kmPrLiter>=5 && kmPrLiter <=10){
            regFee = 5500;
            equalizationTax = 2770;

        }
        if(kmPrLiter<5){
            regFee=10470;
            equalizationTax = 15260;

        }

        dieselRegFee =  regFee + equalizationTax + filterTax;
        return dieselRegFee;
    }


    public String hasParticleFilter(){
        System.out.print("Does the car have a particle filter? y/n: ");
        String filterAnswer = scanner.nextLine();
        if ("y".equalsIgnoreCase(filterAnswer)){
            filterTax = 0;

        }
        else if ("n".equalsIgnoreCase(filterAnswer)){
            filterTax = 1000;

        } else {
            System.out.println("the correct answers are y/n, try again.");
            hasParticleFilter();
        }

        return filterAnswer;
    }

    @Override
    public String toString() {
        return "Fuel type: "+ typeOfFuel +", Registration Fee" + dieselRegFee + super.toString();
    }

}
