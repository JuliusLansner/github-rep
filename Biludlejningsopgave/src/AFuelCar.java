public abstract class AFuelCar extends ACar {
    int kmPrLiter;
    //returns gasoline or diesel
    abstract String getFuelType();



    // returns kilometres per 1litre of fuel
     int kmPrLitre(){
         System.out.println("Enter your km pr liter:   ");
         int answer = scanner.nextInt();
         kmPrLiter= answer;
         return kmPrLiter;
     }

    @Override
    public String toString() {
        return "km / liter "+ kmPrLiter + super.toString();
    }
}
