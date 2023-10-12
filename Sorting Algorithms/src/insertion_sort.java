import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		String text = "";
		int[] numbers = {4,3,2,10,12,1,5,6};
		try {
			sc = new Scanner(new File("student.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.nextLine();//First line of the file
		while(sc.hasNextLine()) {
			text = text + sc.nextLine() + "#";	
		}
		String[] students = text.split("#");
		String[] studentNames = new String[students.length];
		int[] studentNumbers = new int[students.length];
		for(int i = 0; i < students.length; i++) {
			String[] tempArr = students[i].split(",");
			studentNames[i] = tempArr[0] + " " + tempArr[1];
			studentNumbers[i] = Integer.valueOf(tempArr[2]);
		}
		insertion_sort(studentNumbers, studentNames);
		insertion_sort(numbers);
		System.out.println("Part one: \n");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Part two: \n");
		for(int i = 0; i < studentNames.length; i++) {
			System.out.println(studentNames[i] + " " + studentNumbers[i]);
		}

	}
	static void insertion_sort(int[] arr, String[] names) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			String name = names[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				names[j+1] = names[j];
				j = j-1;
			}
			arr[j+1] = key;
			names[j+1] = name;
		}
	}
	static void insertion_sort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;

		}
	}

}
