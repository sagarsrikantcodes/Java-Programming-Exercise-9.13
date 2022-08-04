package package1;

class Location {
	// public data fields 
	static int row;
	static int column;
	static double maxValue;
	
	Location(double[][] a){
		
	}
	
	// Method that returns an instance of Location 
	public static Location locateLargest(double[][] a) {
		Location obj1 = new Location(a);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;	
				}	
			}
		}
		
		return obj1;
	}
	

}
