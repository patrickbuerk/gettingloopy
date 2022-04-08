import java.util.Scanner;

public class CtoF {
    {
        {
            boolean done=false;
            double celsiusTemperature = 0;
            String trash ="";
            do
            {
                Scanner in = new Scanner(System.in);
                System.out.printf("Enter the temperature in Celsius: ");
                if(in.hasNextDouble()) {
                    //should read as double only
                    celsiusTemperature = in.nextDouble();
                    in.nextLine();
                    double fTemp = (celsiusTemperature * 9/5) +32;
                    System.out.println(fTemp);
                    done = true;
                }
                else{
                    trash = in.nextLine();
                    System.out.println("You did not enter a valid number for Celsius the number you entered was: "+ trash );
                    done = false;
                    System.out.println("Try again!");
                }


            }while (!done );




        }



    }
}
