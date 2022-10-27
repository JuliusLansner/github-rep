import java.util.Scanner;

public abstract class ACar implements Car {
    // Numberplate
    private String registrationNumber;
    //model of car
    private String model;
    //brand of car
    private String make;

    //decided to make doors final, seeing as I'm only using on cars with 4 passenger doors and a trunk door.
    private final int doors=5;
    protected static final Scanner scanner = new Scanner(System.in);
    public String getRegistrationNumber() {
        if(registrationNumber != null)
        {
            return registrationNumber;
        }
        System.out.print("Enter the Registration number on the car: ");
        registrationNumber = scanner.nextLine();

        return registrationNumber;
    }


    public String getMake() {
        if(make != null)
        {
            return make;
        }
        System.out.print("Enter the make of the car: ");
        make = scanner.nextLine();
        return make;

    }


    public String getModel() {
        if(model != null)
        {
            return model;
        }
        System.out.print("Enter the model of the car: ");
        model = scanner.nextLine();
        return model;
    }


    public int getNumberOfDoors() {
        //not making an input for this, seeing as I've already decided that the doors of the cars in the program is limited to 5
        // I've done that by making doors final. However, it is not necessary
        return doors;
    }

    @Override
    public String toString() {
        return "info aobut the car: " + "registrationNumber: " + registrationNumber + '\'' + ", model: " + model + '\'' + ", make: " + make + '\'' + ", doors: " + doors;
    }
}
