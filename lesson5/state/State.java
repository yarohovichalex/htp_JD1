package src.by.htp.state;

class State {
	private String capitalName;
    private String nameState;
    private Region region;
	private int population;
    private int squareCountry;
	//private City capital;
        int numReg;
	//private Region region;
    City capital = new City();
	private double totalSquare;
	State(String name){
            this.nameState = name;
            numReg = 1 + (int) (Math.random() * 9);
            region = new Region(numReg);
            int index = 1 + (int)(Math.random() * 6);
            //City capital = new City();
            capital.setCapitalCity(index);
	}

    public String getCapitalName() {
		return capital.getCapitalCity();
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public int getPopulation() {
        int population = 0;            
            population = region.getRegionPopulation();           
        return population;
    }

    public int getSquareCountry() {
        int square = 0;        
            square = region.getRegionSquare();        
        return square;
    }
}
