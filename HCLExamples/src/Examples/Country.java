package Examples;

import java.util.Currency;

public class Country {

	private String countryName;
	private Examples.Currency currency;
	
	Country(){}
	
	public Country(String countryName,Examples.Currency currency2) {
		super();
		this.countryName = countryName;
		this.currency = currency2;
	}

	@Override
	public String toString() {
		return countryName+""+currency;
	
	}

}
