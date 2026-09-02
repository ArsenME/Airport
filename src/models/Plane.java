package models;

public class Plane {
    private String name;
    private String country;
    private int year;
    private int hoursInAir;
    private boolean military;
    private double weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double coast;

    public Plane(String name, String country, int year, int hoursInAir, boolean military, double weight, int wingspan, int topSpeed, int seats, double coast) {
        this.name = name;
        this.country = country;
        if (year >= 1903 && year <= 2021) {
            this.year = year;
        }
        if (hoursInAir > 0 && hoursInAir <= 10000) {
            this.hoursInAir = hoursInAir;
        }
        this.military = military;
        if (weight > 10000 && wingspan <= 160000) {
            this.weight = weight;
        }
       if (wingspan> 0 && seats <= 45) {
           this.wingspan = wingspan;
       }
       if(topSpeed > 0 && seats <= 1000) {
           this.topSpeed = topSpeed;
       }

       if (seats  > 0 ){
           this.seats = seats;
       }
        if(coast > 0){
            this.coast = coast;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2021) {
            this.year = year;
        }

    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        if (hoursInAir > 0 && hoursInAir <= 10000) {
            this.hoursInAir = hoursInAir;
        }


    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        if (weight > 10000 && wingspan <= 160000) {
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan> 0 && seats <= 45) {
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed > 0 && seats <= 1000) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats  > 0 ){
            this.seats = seats;
        }
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(float coast) {
        if(coast > 0){
            this.coast = coast;
        }
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Hours in air: " + hoursInAir);
        System.out.println("Military: " + military);
        System.out.println("Weight: " + weight);
        System.out.println("Wing span: " + wingspan);
        System.out.println("Top speed: " + topSpeed);
        System.out.println("Seats: " + seats);
        System.out.println("Coast: " + coast);

    }

}
