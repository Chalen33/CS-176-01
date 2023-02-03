import java.util.Scanner;
public class HousePainting{
	
	public static void main(String[] args) {
 
Scanner scnr = new Scanner(System.in);

double houseWidth, houseHeight, houseLength, houseWindows, windowLength;
double windowWidth, houseDoors, doorLength, doorWidth, painterCost;

//Inputs
System.out.print("Please enter the cost per square foot: ");
painterCost = scnr.nextDouble();

System.out.print("Please enter the length of the house: ");
houseLength = scnr.nextDouble();

System.out.print("Please enter Width of the house: ");
houseWidth = scnr.nextDouble();

System.out.print("Please enter Height of the house: ");
houseHeight = scnr.nextDouble();

System.out.print("Please enter the number of windows: ");
houseWindows = scnr.nextDouble();

System.out.print("Please enter the length of a window: ");
windowLength = scnr.nextDouble();

System.out.print("Please enter the width of a window: ");
windowWidth = scnr.nextDouble();

System.out.print("Please enter the number of doors: ");
houseDoors = scnr.nextDouble();

System.out.print("Please enter the length of a door: ");
doorLength = scnr.nextDouble();

System.out.print("Please enter the width of a door: ");
doorWidth = scnr.nextDouble();

//Calculations
double normalSides = 2 * (houseWidth * houseLength);
double peakSides = houseLength * houseWidth + .5 *(houseLength*(houseHeight - houseWidth));
peakSides = peakSides * 2;
double windowTotal = houseWindows * (windowLength * windowWidth);
double doorTotal = houseDoors * (doorLength * doorWidth);
double houseSides = normalSides + peakSides;
double totalPaintArea = houseSides - (windowTotal + doorTotal);
double totalCost = totalPaintArea * painterCost;

System.out.printf("Your total paintable surface area is %.0f square feet.\n",totalPaintArea);
System.out.printf("Your estimate is %.0f dollars.\n", totalCost);

 

	
	
	
	}}

