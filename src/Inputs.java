import java.util.Scanner;

public class Inputs {
    public static Scanner ioScan = new Scanner(System.in);

    public String[] lineEndings = {"floor width: ", "floor depth: ", "wall width: ", "wall height: ", "window width: ", "window height: ", "room width: ", "room height: ", "room depth: ", "number of windows in the room: ", "number of doors in the room: ", "number of walls in the room: "};
    public String[] inputs = new String[12];
    public Double[] parsedInputs = new Double[12];

    //Runs the input process.
    public void Collect()
    {
        //Run through the lineEnding array and print out the message whilst also storing the response to the corresponding point in the inputs array.
        for(int i=0; i <= 11; i++)
        {
            Boolean isParsed = false;
            System.out.println("Please enter the " + lineEndings[i]);
            inputs[i] = ioScan.nextLine();
            //Want to keep looping this in-case the user re-inputs another incorrect value.
            while(isParsed == false)
            {
                try
                {
                    parsedInputs[i] = Double.parseDouble(inputs[i]); //Try parsing string into double.
                    isParsed = true; //If it doesn't run into a NFE it will pass true and will break the loop.
                }
                catch(NumberFormatException ex) //If the parsing fails run this.
                {
                    System.out.println("That was not a valid number, please re-enter the " + lineEndings[i]);
                    inputs[i] = ioScan.nextLine();
                }
            }
        }
    }
}
