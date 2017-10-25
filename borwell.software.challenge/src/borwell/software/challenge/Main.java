package borwell.software.challenge;
import java.text.DecimalFormat;
import java.util.Scanner;
import borwell.software.challenge.Calculation;

public class Main {
	
	public static Scanner ioScan = new Scanner(System.in);
	public static DecimalFormat decimalFormat = new DecimalFormat();
	
	public static double flrWidth, flrDepth, wallWidth, wallHeight, wndWidth, wndHeight, roomWidth, roomHeight, roomDepth;
	public static int amountOfWindows, amountOfDoors, amountOfWalls;
	
	public static void main(String[] args) {
		decimalFormat.setMaximumFractionDigits(2);
		
		// Input all values.
		System.out.println("Please enter the floor width: ");
		flrWidth = ioScan.nextDouble();
		
		System.out.println("Please enter the floor depth: ");
		flrDepth = ioScan.nextDouble();
		
		System.out.println("Please enter the wall width: ");
		wallWidth = ioScan.nextDouble();
		
		System.out.println("Please enter the wall height: ");
		wallHeight = ioScan.nextDouble();
		
		System.out.println("Please enter the window width: ");
		wndWidth = ioScan.nextDouble();
		
		System.out.println("Please enter the window height: ");
		wndHeight = ioScan.nextDouble();
		
		System.out.println("Please enter the room width: ");
		roomWidth = ioScan.nextDouble();
		
		System.out.println("Please enter the room height: ");
		roomHeight = ioScan.nextDouble();
		
		System.out.println("Please enter the room depth: ");
		roomDepth = ioScan.nextDouble();
		
		System.out.println("Please enter the number of windows in the room: ");
		amountOfWindows = ioScan.nextInt();
		
		System.out.println("Please enter the number of doors in the room: ");
		amountOfDoors = ioScan.nextInt();
		
		System.out.println("Please enter the number of walls in the room: ");
		amountOfWalls = ioScan.nextInt();
		
		double floorArea = Calculation.FloorArea(flrWidth, flrDepth);
		double paintRequired = Calculation.PaintRequired(wallWidth, wallHeight, wndWidth, wndHeight, amountOfWalls, amountOfDoors, amountOfWindows);
		double roomVolume = Calculation.roomVolume(roomWidth, roomHeight, roomDepth);
		
		System.out.print("\n______\n\nThe area of the floor is: " + decimalFormat.format(floorArea) + " metres squared.\nThe required amount of paint is: " + decimalFormat.format(paintRequired) + " litres.\nThe recommended amount of paint is: " + decimalFormat.format(paintRequired + 1) + " litres.\nThe volume of the room is: " + decimalFormat.format(roomVolume) + " metres cubed.");
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
