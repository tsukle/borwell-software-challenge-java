import java.text.DecimalFormat;

public class Outputs
{
    //Print out values to console.
    public void Send(double floorArea, double paintRequired, double roomVolume)
    {
        //Formatting double endings so that they aren't unnecessarily large.
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);

        //Spacers for console to clear it up a little.
        System.out.print("\n\n _______ \n\n");

        //Print out the values.
        System.out.println("The area of the floor is: " + decimalFormat.format(floorArea) + " metres squared.");
        System.out.println("The required amount of paint is: " + decimalFormat.format(paintRequired) + " litres.");
        System.out.println("The recommended amount of paint is: " + decimalFormat.format(paintRequired + 1) + " litres.");
        System.out.println("The volume of the room is: " + decimalFormat.format(roomVolume) + " metres cubed.");
    }
}
