package src.by.htp.state;

public class MainApp {

	public static void main(String[] args) {
		 State st = new State("United Kingdom");
	     System.out.println("State population: " + st.getPopulation());
	     System.out.println("State square: " + st.getSquareCountry());
	     System.out.println("capital: " + st.getCapitalName());


		
	}

}
