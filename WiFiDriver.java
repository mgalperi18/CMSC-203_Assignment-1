
public class WiFiDriver {

	public static void main(String[] args) { 
		// print the header
		System.out.println("If you have a problem with internet connectivity,"+
				" this WiFi Diagnosis might work.\n");
		  
		// call the WiFiDiagnosis function
		WiFiUtility diagnosis = new WiFiUtility();
		diagnosis.troubleShootWiFi();
		
		System.out.println("Programmer: Mira Galperina\n");
		}
}
		
		