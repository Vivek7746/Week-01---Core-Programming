class Distance_Conversion{
	public static void main(String[] args){
		
		// Given distance in kilometers
		double Kilometers = 10.8;
		
		// 1 km = 0.62 miles
		double Miles = Kilometers*0.62;
		
		// Distance in Miles
		System.out.print("The distance " + Kilometers + " km in miles is " + Miles);
	}
}