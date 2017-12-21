package src.by.htp.state;

class District {
	private int squareDistrict;
    private int populationDistrict;
    District(){
        squareDistrict = 1000;
        populationDistrict = 110000;
    }

    public int getSquareDistrict(int num) {
        return squareDistrict * num;
    }

    public int getPopulationDistrict(int num) {
        return populationDistrict * num;
    }
}
