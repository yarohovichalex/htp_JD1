package src.by.htp.univer;

public class MainApp {

	public static void main(String[] args) {
		
		
		
		Student student = null;
		student  = new Student();  //перем. ссылочного типа, не хранит значение только ссылается на объект
		
		student.age =20;
		student.name = "Igor";
		student.surname = "Blinov";
		student.enterYear = 2015;
		
	
		Student student2 = null;
		student2 = new Student();		
		
		student2.age = 26;
		student2.name = "Anna";
		student2.surname = "Ivanova";
		student2.enterYear = 2014;
		
		Student student3 = null;
		student3 = new Student();		
		
		student3.age = 25;
		student3.name = "Anna12";
		student3.surname = "Ivanova";
		student3.enterYear = 2012;
		
		Student student4 = null;
		student4 = new Student();		
		student4.age = 24;
		student4.name = "Anna";
		student4.surname = "Ivanova";
		student4.enterYear = 2012;
		
		Student student5 = null;
		student5 = new Student();		
		student5.age = 27;
		student5.name = "Anna";
		student5.surname = "Ivanova";
		student5.enterYear = 2012;
		
		Group group = new Group();
		group.number = 1;
		group.students = new Student[10];
		
		group.students[0] = student2;
		//group.null[0]
		group.students[1] = student;
		group.students[2] = student3;
		group.students[3] = student4;
		group.students[4] = student5;



		
		group.greetNewStudent();
		
		
		System.out.println(group.calculateAvgAge());
		group.yearEnt();
		System.out.println("In 2015 received: " + group.receivedInYear());
		
		
	}

}
