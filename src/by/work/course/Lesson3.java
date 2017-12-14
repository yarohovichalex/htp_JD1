package by.work.course;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
	//для вывода массива
	public static void arrayOutput(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	//перегружен, вывод массива char
	public static void arrayOutput(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	//#2вывод четных элементов
    public static void two(int array[]){
        for(int i=0;i<array.length;i++ ){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }
    }
    //#3 разность
    public static int three(int[] arr){
    	int difference = 0;
		for( int i = 0 ; i < arr.length ; ++i) {
			if( (arr[i]&1) == 1) {
				difference = difference - arr[i];
			}
		}
		return difference;
}
    //#4 количество четных и нечетных эллементов в массиве
    public static void four(int array[]){
        int chElem=0;
        int neChElem=0;
        for(int i=0;i<array.length;i++ ){
            if(array[i]%2==0){
                chElem++;
            }else{
                neChElem++;
            }
            if(i==array.length-1){
                System.out.println("kol ch:"+chElem);
                System.out.println("kol neCh:"+neChElem);
            }
        }
    }
    //#5 Найти и вывести на экран максимальный / минимальный элемент
    public static void five(int array[]){
        int max = 0;
        int min; //вместо max указываем min и выводит min
        for(int index = 0; index < array.length-1; index++ ){
            if(array[index] > array[index+1] && max < array[index]){
                max = array[index];
            }else if(max < array[index+1]){
                max = array[index+1];
            }
        }
        System.out.println("max: "+max);
    }
    //#6 Найти максимальный и минимальный элемент среди чётных/нечётных элементов
    public static void six(int array[]){
        int maxEven = 0;
        int maxNotEven = 0;
        int minEven = 100;
        int minNotEven = 100;

        for(int index=0;index<array.length-1;index++ ){
            if(array[index]%2==0 && array[index]>array[index+1] && maxEven<array[index]){
                maxEven = array[index];
            }else if(array[index+1]%2==0 && maxEven<array[index+1]){
                maxEven = array[index+1];
            };
            if(array[index]%2==0 && array[index]<array[index+1] && minEven>array[index]){
                minEven = array[index];
            }else if(array[index+1]%2==0 && minEven>array[index+1]){
                minEven = array[index+1];
            }
        }
        System.out.println("max even element: "+maxEven);
        System.out.println("min even element: "+minEven);
        
        for(int i=0;i<array.length-1;i++ ){
            if(array[i]%2!=0 && array[i]>array[i+1] && maxNotEven<array[i]){
                maxNotEven = array[i];
            }else if(array[i+1]%2!=0 && maxNotEven<array[i+1]){
                maxNotEven = array[i+1];
            }
        }
        System.out.println("max not even element: "+maxNotEven);
        for(int i=0;i<array.length-1;i++ ){
            if(array[i]%2!=0 && array[i]<array[i+1] && minNotEven>array[i]){
                minNotEven = array[i];
            }else if(array[i+1]%2!=0 && minNotEven>array[i+1]){
                minNotEven = array[i+1];
            }
        }
        System.out.println("min not even element: "+minNotEven);
    }
    //#7 Сохранить в массив типа char свою фамилию и имя (размер массива не должен превышать количество 
    //    символов в фамилии пробела и имени.
    public static char[] seven(){        
        char[] name = new char[16];
        name[0] = 'Я';
        name[1] = 'р';
        name[2] = 'о';
        name[3] = 'х';
        name[4] = 'о';
        name[5] = 'в';
        name[6] = 'и';
        name[7] = 'ч';
        name[8] = ' ';
        name[9] = 'А';
        name[10] = 'л';
        name[11] = 'е';
        name[12] = 'к';
        name[13] = 'с';
        name[14] = 'е';
        name[15] = 'й'; 
        return name;
    }
    //#7.1 Реализовать считывание фио для задачи 7 с клавиатуры
    public static void sevenOne(){
        char[] name = new char[16];
        Scanner in = new Scanner(System.in);        
        for(int index = 0; index < name.length; index++){
            System.out.println("Entered symbol:");
            name[index] = in.nextLine().charAt(0);
        }
        arrayOutput(name);        
    }
    //#8  Добавить в массив из задания 7 пробел и отчество
    public static void eight(char[] arr) {    	 
    	char[] middleName = {' ','В', 'л', 'а', 'д', 'и','м','и','р','о','в','и','ч'};
    	char[] fullName = new char[29];    	
    	for(int i = 0,j = 0,k = 0; i<fullName.length ; i++) {    		
    		if(j<arr.length) {						//вводим имя и фамилию из массива 7
    			fullName[i] = arr[j];						
    			j++;										
    		}else if(k < middleName.length) {		//вводим отчество
    			fullName[i] = middleName[k];
    			k++;
    		}
    		if(i==fullName.length-1) {
    			arrayOutput(fullName);			//печатаю результат
    		}
    	}
    }
    //#9  Удалить из массива (1е задание) все элементы, кратные 3
    public static void nine(int[] array) {
    	for (int i = 0; i < array.length; i++) {
    		if(array[i]%3==0) {
    			array[i]=-1;					//если кратен 3 присваиваем -1
    		}
			
		}
    	arrayOutput(array);						// промежуточный результ    	
    } 
    //#9.1  Привести размер массива из задания 9 в соответствие с реальным количеством хранимых элементов
    public static int[] nineOne(int[] array) {
    	int decrease=0;							//значение на которое уменьшим новый массив
    	int[] newArray = null;					
    	for (int i = 0; i < array.length; i++) {
			while(array[i]==-1 && i<array.length) {
				for(int j = i; j < array.length; j++) {
					if(j == array.length-1) {
						decrease++;
						array[j] = -2;
						break;
					} 
					array[j] = array[j+1];
					
				}
 			}
		}
    	   	newArray = new int[array.length-decrease];   	//Приводим размер массива к требуемому
        	for(int t = 0; t<newArray.length; t++)
        	newArray[t] = array[t];
        	return newArray;
    }
    public static void tenOne(int[] arr) { 
    	//10.1 сортировка пузырьком по возрастанию
    		
        for (int barrier = 0; barrier <arr.length-1; barrier++) {
            for (int index = barrier+1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
        arrayOutput(arr);
    }
    public static void tenTwo(int[] arr) {
    	//10.2 выборками по возрастанию
    	for (int barrier = 0; barrier < arr.length-1; barrier++) {
    		for(int index=barrier+1; index < arr.length; index++) {
    			if(arr[barrier] > arr[index]) {
    				int tmp = arr[index];
    				arr[index] = arr[barrier];
    				arr[barrier] = tmp;
    			}
    		}
			
		}
    	arrayOutput(arr);
    }
    public static void tenThree(int[] arr) {
    	//10.3 вставками по возрастанию
    	for (int barrier = 1; barrier < arr.length; barrier++) {
    		int newElement = arr[barrier];
    		int location = barrier-1;
    		while(location>=0 && arr[location]>newElement) {
    			arr[location+1] = arr[location];
    			location--;
    		}
    		arr[location+1] = newElement;
    	}
    	arrayOutput(arr);
    	}
    //10.4 быстрая сортировак (работает!!!)
    public static void tenFour(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0
 
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
 
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
 
            while (array[j] > opora) {
                j--;
            }
 
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
 
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            tenFour(array, low, j);
 
        if (high > i)
            tenFour(array, i, high);
    }
    
    //#11 Найти в массиве и вывести на экран все элементы в заданном диапазоне (например от 20 до 23)
    public static void eleven(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=20 && arr[i]<=23) {
				System.out.println("Входит в диапазон: "+arr[i]);
			}
		}
    }

    
        	
	public static void main(String[] args) {
		// #1 заполняем массив случайными элементами
		int num;
		int[] arr = new int[100];
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			num = 0 + random.nextInt(100 - 0);
			arr[i] = num;
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		/*two(arr);
		three(arr);
		four(arr);
		five(arr);
		six(arr);*/
		seven();
		sevenOne();
		eight(Lesson3.seven());
		
		
		 //при проверке методы 9 и 9.1 необходимо запускать вместе и закоментировать методы 2-6;
		nine(arr);

		// 9.1
		int[] newLength = nineOne(arr);
		System.out.println();
		for (int i = 0; i < newLength.length; i++) {
			System.out.print(" "+newLength[i]);
		}

		tenOne(arr);
		tenTwo(arr);
		tenThree(arr);
       
        
        //быстрая сортировка
        int low = 0;
        int high = arr.length - 1;
        tenFour(arr, low, high);
    	arrayOutput(arr);
        eleven(arr);
        


	}

}
