class findAverage{
	public static void main(String[] args){
		
		// Marks in every subject
		int Maths = 94;
		int Physics = 95;
		int Chemistry = 96;
		
		double Marks_obtained = Maths+Physics+Chemistry;
		double Total_Marks = 300;
		
		// Percentage = (Marks obtained/Total Marks)*100
		
		double Avg_Percentage = (Marks_obtained/Total_Marks)*100;
		System.out.print("Sam's average marks in PCM is " + Avg_Percentage);
	}
}