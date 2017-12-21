package src.by.htp.state;

class City {
	private String capitalCountry;
    private String capitalRegion;
    private String capitalCity;
    private int index;
    private static String[] capitalArr = {"Лондон ","Мадрид ", "Париж ", "Минск ", "Лисабон ", "Рим", "Ванкувер"};
    
    private static String[] capitalCsountryArr = {"Сочи ", "а.г. Берёзкино ","Нью Йорк ","Дамаск ", " Детройт ", 
        "Дисней Лэнд ", "Ратомка ", "Гарворд ", "Канзас Сити "};
    City(){
    	
    }
    City(int number){
        this.capitalRegion = capitalCsountryArr[number];
        
    }
    public String getCapitalRegion(int n){
        return capitalCsountryArr[n]/*CapitalRegion*/;
    }

    public void setCapitalCity(int cap) {        
        this.capitalCity = capitalArr[cap];
        
    }

    public String getCapitalCity() {
        return capitalCity;
    }

}
