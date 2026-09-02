package services;

import models.Plane;

public class PlaneService {
    public void Task1(Plane plane) {
        plane.printInfo();
    }

    public void Task2(Plane plane) {
        if (plane.isMilitary() == true) {
            System.out.println("Plane Coast is: " + plane.getCoast());
            System.out.println("Plane topSpeed is: " + plane.getTopSpeed());

        } else {
            System.out.println("Plane name is:" + plane.getName());
            System.out.println("Plane country is:" + plane.getCountry());
        }
    }

    public Plane Task3(Plane plane1, Plane plane2) {
        if (plane1.getYear() > plane2.getYear() || plane1.getYear() == plane2.getYear()) {
            return plane1;

        } else {
            return plane2;
        }

    }

    public String Task4(Plane plane1, Plane plane2) {
        if (plane1.getWingspan() < plane2.getWingspan() || plane1.getWingspan() == plane2.getWingspan()) {
            return plane2.getName();

        } else {
            return plane1.getName();
        }

    }

    public void Task5(Plane plane1, Plane plane2, Plane plane3) {

        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats()) {
            System.out.println(plane1.getCountry());

        } else if (plane2.getSeats() < plane3.getSeats() && plane2.getSeats() < plane1.getSeats()) {
            System.out.println(plane2.getCountry());
        } else if (plane3.getSeats() < plane1.getSeats() && plane3.getSeats() < plane2.getSeats()) {
            System.out.print(plane3.getCountry());
        } else {
            System.out.println(plane1.getCountry());
        }
    }

    public void Task6(Plane[] planes) {
        int index = 0;
        for (Plane x : planes) {
            if (x.isMilitary() == false) {
                index++;
                System.out.print(index + ") ");
                x.printInfo();
                System.out.println(" ");

            }


        }

    }

    public void Task7(Plane[] planes) {
        for (Plane x : planes) {
            if (x.isMilitary() == true) {
                if (x.getHoursInAir() > 100) {
                    x.printInfo();
                }
            }


        }

    }

    public Plane Task8(Plane[] planes) {
        Plane plane = planes[0];

        for (int i = 1; i < planes.length - 1; i++) {

            if (planes[i].getWeight() > planes[i + 1].getWeight()) {
                plane = planes[i];
            } else if (planes[i].getWeight() == planes[i + 1].getWeight()) {
                plane = planes[i + 1];
            }

        }
        return plane;
    }

    public Plane Task9(Plane[] planes) {

        Plane plane = planes[0];
        int index = 0;
        for (int j = 1; j < planes.length -1; j++) {
            if (planes[j].isMilitary() == true) {
                index = j;
                break;
            }
        }

        for (int i = 0; i < planes.length - 1; i++) {

            if (planes[index].getCoast() < planes[i].getCoast() && planes[i].isMilitary() == true && planes[i+1].isMilitary() == true) {
               plane = planes[i];
               index = i;

            }
        }
        return plane;
    }

    public void Task10(Plane[] planes) {
        Plane temp  = planes[0];
        for (int i = 1; i < planes.length - 1 ; i++) {

               if(temp.getYear() > planes[i+1].getYear()) {
                   planes[i+1] = temp;
                   temp = planes[i];


            }

        }
        for(Plane x : planes) {
            x.printInfo();
        }
    }
}
