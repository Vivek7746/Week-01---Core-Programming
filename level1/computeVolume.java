class computeVolume{
	public static void main(String[] args){
		
		// Radius of Earth in KM
		double Radius = 6378;
		
		// Volume of Earth/Sphere with the given Radius 
		double VolumeinKM = (4/3) * (22/7) * Radius * Radius * Radius;
		double VolumeinMiles = VolumeinKM * 0.62;
		
		System.out.print("The volume of Earth in cubic kilometers is " + (long)VolumeinKM + " and cubic miles is " + (long)VolumeinMiles);
	}
}