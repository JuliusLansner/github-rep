import java.util.Scanner;

public class GasolineCar extends AFuelCar{

        private String typeOfFuel;
        private int cost;

// ive chosen to make a full method in here as of right now to choose the car type,
// it should be moved to a more fitting class
 public String getFuelType() {
       /* System.out.println("Choose between Gasoline and Diesel: ");
            String type = scanner.nextLine();
            if ("gasoline".equalsIgnoreCase(type) /*|| "diesel".equalsIgnoreCase(type)) {
                typeOfFuel = type;
                System.out.println("You chose: "+type);
                return typeOfFuel;

            } else if("diesel".equalsIgnoreCase(type)){
                typeOfFuel = type;
                System.out.println("You chose: "+type);
                return typeOfFuel;
        }
            else{
                System.out.println("Try again.\nYou can choose between gasoline and diesel.");
                getFuelType();
            }
                return type; */

        typeOfFuel = "Gasoline";
        return typeOfFuel;
    }


    @Override
    public int getRegistrationFee() {

       int regFee=0;
       if(kmPrLiter>=20 && kmPrLiter <=50) {
           regFee=330;
       }

       if(kmPrLiter>=15 && kmPrLiter <=20){
           regFee=1050;
       }

       if(kmPrLiter>=10 && kmPrLiter <=15){
           regFee=2340;

       }
       if(kmPrLiter>=5 && kmPrLiter <=10){
           regFee = 5500;
       }
       if(kmPrLiter<5){
           regFee=10470;
       }
       cost = regFee;
       return cost;
    }

    @Override
    public String toString() {
        return "Fuel type: "+ typeOfFuel + ", Registration Fee" + cost + super.toString();
    }
}
