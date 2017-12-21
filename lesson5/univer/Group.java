package src.by.htp.univer;

public class Group {
	
	int number;	
	Student students[]; //можно сразу проиницвлиз
	
	public void greetNewStudent() {
		System.out.println("Hello new Student!");
		//student.enterYear = 1999;
	}
	
	public int calculateAvgAge() {
		int sum = 0;
		int countStud=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i]!= null) {
			 sum += students[i].age; 
			 countStud++;
			}			
		}
		int ag = sum/countStud;		
		return ag;
	}
	
	public void yearEnt() {
		int maxYear = 0;
		int numberOfYears = 0;		
		int indexYear = 0;		
		for(int i = 0; i < students.length; i++) {
			numberOfYears = 0;
			if(students[i]!=null) {				
				int yearOfReceipt = students[i].enterYear;
				for (int j = 0; j < students.length; j++) {
					if(students[j] != null && yearOfReceipt == students[j].enterYear) {
						numberOfYears++;
					}
				}
				if(numberOfYears > maxYear) {
					maxYear = numberOfYears;
					indexYear = i;
				}
			}
		}
		System.out.println("максимальное количество поступивших: " + maxYear + " " + students[indexYear].enterYear + " год");
	}
	public int receivedInYear() {
		int received = 2015;
		int receivedStud = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null && received == students[i].enterYear) {
				receivedStud++;
			}
		}
		return receivedStud;
	}
}
