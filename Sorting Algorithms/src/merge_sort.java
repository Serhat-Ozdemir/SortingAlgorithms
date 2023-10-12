import java.util.*;
import java.io.*;
public class merge_sort {

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
		merge_sort (studentNumbers, studentNames, 0, studentNumbers.length-1);
		merge_sort (numbers, 0, numbers.length-1);
		System.out.println("Part one: \n");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Part two: \n");
		for(int i = 0; i < studentNames.length; i++) {
			System.out.println(studentNames[i] + " " + studentNumbers[i]);
		}

	}
	static void merge_sort(int arr[], String[] names, int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            merge_sort(arr, names, l, m); 
            merge_sort(arr , names, m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, names, l, m, r); 
        } 
    }
	static void merge(int arr[], String[] names, int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        String Lname[] = new String[n1];
        String Rname[] = new String[n2];
  
        for (int i=0; i<n1; ++i) {
            L[i] = arr[l + i]; 
            Lname[i] = names[l+i];
        }
        for (int j=0; j<n2; ++j) {
            R[j] = arr[m + 1+ j]; 
            Rname[j] = names[m+1+j];
        }

  
  
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                names[k] = Lname[i];
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                names[k] = Rname[j];
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            names[k] = Lname[i];
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            names[k] = Rname[j];
            j++; 
            k++; 
        } 
    }

	static void merge_sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            merge_sort(arr, l, m); 
            merge_sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    }
	static void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }


}
