import models.Plane;

import java.util.Scanner;

import services.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        Plane plane1 = new Plane("nn", "Madagaskar", 2000, 50, true, 150000, 15, 500, 500, 150.4);
        Plane plane2 = new Plane("naa", "USA", 2002, 150, false, 160000, 40, 1000, 259, 333.4);
        Plane plane3 = new Plane("fdwf", "Russia", 1990, 155, true, 150000, 15, 750, 600, 800);
        PlaneService service = new PlaneService();
        Plane[] planes = {plane1, plane2, plane3};
        Scanner input = new Scanner(System.in);

        {


            int num = input.nextInt();
            switch (num) {
                case 1:
                    service.Task1(plane1);
                    break;
                case 2:
                    service.Task2(plane2);
                    break;
                case 3:
                    service.Task3(plane3, plane1);
                    break;
                case 4:
                    service.Task4(plane2, plane3);
                    break;
                case 5:
                    service.Task5(plane1, plane2, plane3);
                    break;
                case 6:
                    service.Task6(planes);
                    break;
                case 7:
                    service.Task7(planes);
                    break;
                case 8:
                    service.Task8(planes);
                    break;
                case 9:
                    service.Task9(planes);
                    break;
                case 10:
                    service.Task10(planes);
                    break;


            }
        }


    }
}
