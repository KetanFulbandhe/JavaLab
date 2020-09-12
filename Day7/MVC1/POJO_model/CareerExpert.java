package mypack;

public class CareerExpert {
	public String getAdvice(String qualification)
	{
			if(qualification.equalsIgnoreCase("BE"))
			{
				return "DAC";
			}
			else if(qualification.equalsIgnoreCase("ME"))
			{
				return "M-TECH";
			}
			else if(qualification.equalsIgnoreCase("BTech"))
			{
				return "MSC IT";
			}
			else
			{
				return "Enter Valid Qualification";
			}
	}

}
