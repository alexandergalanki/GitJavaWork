import java.util.HashMap;
import java.util.Map;
public class AirIndia implements AirFare {
    
	public Double showFare(String sourceCity, String destinationCity) {
		AirIndia ai= new AirIndia();                             //Creating object for method AirIndia
		Map<String, Double> fares = ai.getAirIndiaFares();      //Getting fares map from getAirIndiaFares method
		double price=fares.get(sourceCity+"-"+destinationCity); //get values using destination and source combination as key
		return price;
	}
	
	
	//don't change this method
	public Map<String, Double> getAirIndiaFares() {
		Map<String, Double> fares =  new HashMap<String, Double>();
		fares.put("LONDON-NEWYORK", 21963D);
		fares.put("LONDON-PARIS", 4995D);
		fares.put("LONDON-DUBAI", 25223D);
		fares.put("LONDON-MUMBAI", 34990D);
		fares.put("NEWYORK-PARIS", 20789D);
		fares.put("NEWYORK-DUBAI", 44210D);
		fares.put("NEWYORK-MUMBAI", 47337D);
		fares.put("PARIS-DUBAI", 32547D);
		fares.put("PARIS-MUMBAI", 40017D);
		fares.put("DUBAI-MUMBAI", 4999D);
		fares.put("NEWYORK-LONDON", 21963D);
		fares.put("PARIS-LONDON", 4995D);
		fares.put("DUBAI-LONDON", 25223D);
		fares.put("MUMBAI-LONDON", 34990D);
		fares.put("PARIS-NEWYORK", 20789D);
		fares.put("DUBAI-NEWYORK", 44210D);
		fares.put("MUMBAI-NEWYORK", 47337D);
		fares.put("DUBAI-PARIS", 32547D);
		fares.put("MUMBAI-PARIS", 40017D);
		fares.put("MUMBAI-DUBAI", 4999D);
		return fares;
	}
}
