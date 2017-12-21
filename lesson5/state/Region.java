package src.by.htp.state;

class Region {
	 private int numberOfRegions;
	    private int numberOfDistrict;
	    private int regionPopulation;
	    private int regionSquare;
	    private static String[] allNamesRegions = new String[] {"mountain region", "rural region", "urban region", "military region", "production region", "entertainment region", "training region", "educational region", "beliver region"};
	    private static String[] regionsOfTheCountry;
	    private Region[] reg1;
	    private City capitalCity;
	    private String nameRegion;
	    private String capitalOfRegion;
	    Region(int regions){
	            this.numberOfRegions = regions;
	            regionsOfTheCountry = new String[numberOfRegions];
	            int [] arrayOfNonRepeatedValues = new int[numberOfRegions];
	            reg1 = new Region[numberOfRegions];
	            for (int i = 0; i < regionsOfTheCountry.length; i++) {
	                    int index = 1 + (int)(Math.random() * 8);
	                    if(duplicateValues(arrayOfNonRepeatedValues, index)) {
	                            arrayOfNonRepeatedValues [i] = index;
	                            regionsOfTheCountry[i] = allNamesRegions[index];
	                            reg1[i] = new Region(allNamesRegions[index], index);
	                    }
	                    else {
	                            i--;
	                    }
	            }
	            System.out.println("reg: ");
	            for (int j = 0; j < regionsOfTheCountry.length; j++) {			
	                    System.out.println(regionsOfTheCountry[j]);
	            }		
	    }
	     Region(String name, int num){        
	        this.nameRegion = name;
	        capitalCity = new City(num);
	        capitalOfRegion = capitalCity.getCapitalRegion(num);
	        System.out.println("capital " + nameRegion + " " + capitalOfRegion);
	        numberOfDistrict = 1 + (int)(Math.random() * 6);
	        District dis = new District();
	        this.regionPopulation = dis.getPopulationDistrict(numberOfDistrict);
	        this.regionSquare = dis.getSquareDistrict(numberOfDistrict);
	         System.out.println("region population: " + regionPopulation);
	        //regionSquare = dis.getSquareDistrict(numberOfDistrict);
	        
	    }

	    static boolean duplicateValues(int [] arr, int value) {
	            boolean reiteration = false;
	            for (int i = 0; i < arr.length; i++) {
	                    if(arr[i] != 0) {
	                            if(arr[i] != value) {
	                                    reiteration = true;
	                            }
	                            else {
	                                    reiteration = false;
	                                    break;
	                            }
	                    }
	                    else if(arr[0] == 0) {
	                            reiteration = true;
	                    }
	            }
	            return reiteration;
		}

	    public int getNumberOfRegions() {
	        return numberOfRegions;
	    }

	    public int getRegionPopulation() {
	        int sum = 0;
	        for (int i = 0; i < reg1.length; i++) {
	            sum += reg1[i].regionPopulation;
	        }
	        return sum;
	    }

	    public int getRegionSquare() {
	    	int sum = 0;
	        for (int i = 0; i < reg1.length; i++) {
	            sum += reg1[i].regionSquare;
	        }
	        return sum;
	    }

	    public String getCapitalOfRegion() {
	        return capitalOfRegion;
	    }	
}