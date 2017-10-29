public class Main {
    public static void main(String[] args)
    {
        //Instancing.
        Outputs outputs = new Outputs();
        Inputs inputs = new Inputs();
        Calculation calculation = new Calculation();

        //Take user input.
        inputs.Collect();

        //Run calculations and store the returned values.
        double floorArea = calculation.FloorArea(inputs.parsedInputs[0], inputs.parsedInputs[1]);
        double paintRequired = calculation.PaintRequired(inputs.parsedInputs[2], inputs.parsedInputs[3], inputs.parsedInputs[4], inputs.parsedInputs[5], inputs.parsedInputs[11], inputs.parsedInputs[10], inputs.parsedInputs[9]);
        double roomVolume = calculation.RoomVolume(inputs.parsedInputs[6], inputs.parsedInputs[7], inputs.parsedInputs[8]);

        //Print values.
        outputs.Send(floorArea, paintRequired, roomVolume);
    }

}
