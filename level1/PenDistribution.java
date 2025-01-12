class PenDistribution{
	public static void main(String[] args){
		
		// Total number of Pens and Students
		int Pen = 14;
		int Student = 3;
		
		// Equally Distributed Pens = floor(Student/Pen)
		int DistributedPen = Pen/Student;
		
		// Undistributed Pen or Number of Pens left
		int UndistributedPen = Pen%Student;
		
		System.out.print("The Pen Per Student is " + DistributedPen + " and the remaining pens not distributed are " + UndistributedPen);
	}
}