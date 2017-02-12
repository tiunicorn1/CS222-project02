import java.util.Scanner;

/**
 * Created by s1419209 on 2/6/2017.
 */
public class Main
{
    public static double calcTotalCirclePerimeter(int[] radiusArray)
    {
        //perimeter (circumference) = 2 * pi * radius

        int radiusTotal = 0;

        for (int r = 0; r < radiusArray.length; r++)
        {
           radiusTotal += radiusArray[r];
        }


        return (2 * Math.PI * radiusTotal);

    }

    public static double calcTotalCircleArea(int[] radiusArray)
    {
        // area = pi * radius * radius

        double radiusTotalArray[] = new double[radiusArray.length];

        double radiusTotal = 0.00;

        for (int r = 0; r < radiusArray.length; r++)
            {
                radiusTotalArray[r] = radiusArray[r] * radiusArray[r] * Math.PI;
                radiusTotal += radiusTotalArray[r];


            }


       return radiusTotal;

    }

    public static void main(String[] args)
    {
        Scanner scannerIn = new Scanner(System.in);

        int count = 0;


        // Ask for # of circles

        System.out.print("Enter the number of circles to process: ");
        count = scannerIn.nextInt();


        // define array & introduce averages

        int[] circleRadiusArray = new int[ count];

        double aveCirclePerimeter = calcTotalCirclePerimeter(circleRadiusArray) / count;
        double aveCircleArea = calcTotalCircleArea(circleRadiusArray) / count;


        // Ask for radius

        for (int radius = 0; radius < circleRadiusArray.length; radius++)
        {
            System.out.print("Enter the integer radius of a circle: ");
           circleRadiusArray[radius] = scannerIn.nextInt();

        }

        // System Print

        System.out.println(String.format("Total circle perimeter: %.2f", calcTotalCirclePerimeter(circleRadiusArray)));
        System.out.println(String.format("Total circle area: %.2f", calcTotalCircleArea(circleRadiusArray)));
        System.out.println(String.format("Average circle perimeter: %.2f", aveCirclePerimeter));
        System.out.println(String.format("Average circle area: %.2f", aveCircleArea));









    }
}
