import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args)throws FileNotFoundException  {
		Donations giveToMe = new Donations();
		System.out.print("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		Scanner userReply = new Scanner(System.in);
		String Userinput = userReply.nextLine();
		
		if (Userinput.equals("Yes")) {
			
		File inputFile = new File("Donations.txt");
		Scanner fileReader = new Scanner(inputFile);
		
		while (fileReader.hasNextLine()) {
		String sc2 = fileReader.nextLine();
		if (sc2.equals("<EOF>")) {
		break;
		}

		else if(sc2.startsWith("<individual donation>")) {
			sc2 = sc2.replaceAll("<individual donation>","");
			 Double replace1 = Double.parseDouble(sc2);
			 giveToMe.processDonations("individual",replace1);
			 //System.out.println(sc2);
		}
		else if(sc2.startsWith("<business donation>")) {
				sc2 = sc2.replaceAll("<business donation>","");
				Double replace1 = Double.parseDouble(sc2);
				giveToMe.processDonations("business",replace1);
		}

		else if(sc2.startsWith("<other donation>")) {
				sc2 = sc2.replaceAll("<other donation>","");
				Double replace1 = Double.parseDouble(sc2);
				giveToMe.processDonations("other",replace1);
		}
		
		}
		
		giveToMe.getStatistics();
		fileReader.close();
		}
		else {
		System.out.println("Ending now without processing donations");
		System.exit(0);
		}
	}
}		
	
