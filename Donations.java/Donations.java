
public class Donations {
	
	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
	private double amtBusiness;
	private int numOther;
	private int amtOther;
	
	public void processDonations(String cat, Double donation) {
		
		if (cat == "individual") {
			if (donation < 0) {
				numIndividual--;
				}
		else {
			numIndividual++;
			}
			amtIndividual += donation;
		}
	
		
		else if (cat == "business") {
			if (donation < 0) {
				numBusiness--;
			}
		else {
			numBusiness++;
		}
			amtBusiness += donation;
		}
		else if (cat == "other") {
			if (donation < 0) {
				numOther--;
			}
			else {
				numOther++;
			}
			amtOther += donation;
		}
	}
	
	public void getStatistics() {
		System.out.println();
		System.out.println("Individual: #:" + numIndividual + " $" + amtIndividual);
		System.out.println("Business: #:" + numBusiness + " $" + amtBusiness);
		System.out.println("Other: #:" + numOther + " $" + amtOther);
		
	}
		
	}