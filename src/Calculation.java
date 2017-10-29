public class Calculation {

    // Returns the floor area.
    public double FloorArea(double flrWidth, double flrDepth)
    {
        double flrArea = flrWidth * flrDepth;

        return flrArea;
    }

    // Returns the paint required for the walls.
    public double PaintRequired(double wallWidth, double wallHeight, double wndWidth, double wndHeight, double amountOfWalls, double amountOfDoors, double amountOfWindows)
    {
        // Initial Areas
        double wallArea = wallWidth * wallHeight;
        double wndArea = wndHeight * wndWidth;
        double doorArea = 2.04 * 0.82; // According to google this is the most common size of a door (metres).

        // Multiply amounts
        double totalWallArea = wallArea * amountOfWalls;
        double totalWindowArea = wndArea * amountOfWindows;
        double totalDoorArea = doorArea * amountOfDoors;

        //Area Manipulation
        double manWallArea = totalWallArea - (totalWindowArea + totalDoorArea); // Only walls, no windows or doors.
        double paintRequired = manWallArea / 10; //1 litre of paint can cover 11 square metres.

        return paintRequired;
    }

    // Returns the room volume.
    public double RoomVolume(double roomWidth, double roomHeight, double roomDepth)
    {
        double roomVolume = roomWidth * roomHeight * roomDepth;

        return roomVolume;
    }
}

