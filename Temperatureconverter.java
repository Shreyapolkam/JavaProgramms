public class Temperatureconverter{
    public static void main (String[] args){
        //int celsius=25;//int type

        // to perform type casting from int data type to float data type.

		//double fahrenheit= celsius*9/5+32; // formula of celsius is celsius *9/5
		//System.out.println("Temperture in celsius :"+celsius);
		//System.out.println("Temperature in fahrenheit : "+fahrenheit);
		
		double fahrenheit= 77.0;
		int celsius= (int) ((fahrenheit-32)*5/9);
		System.out.println("Temperature in fahrenheit : "+fahrenheit);
		System.out.println("Temperture in celsius :"+celsius);
		
	}	
}               
	               
