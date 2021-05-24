package fetch_data_from_soap;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Demo {

	public static void main(String[] args) 
	{
		CountryInfoService info = new CountryInfoService();
		
		CountryInfoServiceSoapType a1 = info.getCountryInfoServiceSoap();
		
		System.out.println(a1.capitalCity("CN"));
		
		System.out.println(a1.countryFlag("IN"));

	}

}
