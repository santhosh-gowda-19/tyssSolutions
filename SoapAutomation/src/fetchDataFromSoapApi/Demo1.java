package fetchDataFromSoapApi;

import java.util.List;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TCountryCodeAndName;

public class Demo1 
{
	public static void main(String[] args) 
	{
		CountryInfoService info = new CountryInfoService();
		
		CountryInfoServiceSoapType a1 = info.getCountryInfoServiceSoap();
		
		ArrayOftCountryCodeAndName a2 = a1.listOfCountryNamesByName();
		
		List<TCountryCodeAndName> a3 = a2.getTCountryCodeAndName();
		
		for(TCountryCodeAndName a4:a3)
		{
			System.out.println(a4.getSISOCode()+"-----"+a4.getSName());
		}
	}
}
