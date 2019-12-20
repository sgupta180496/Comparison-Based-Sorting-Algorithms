import java.util.Random;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) 
	{
		int[] array = new int[50000];
		Random rand = new Random();
		Comparable com[] =new Comparable[50000];
		Scanner scan=new Scanner(System.in);

		InsertionSort insert = new InsertionSort();
		MergeSort merge=new MergeSort();
		QuickSortMedian quick= new QuickSortMedian();
		Randomized_quick_sort ran= new Randomized_quick_sort();
		ReverseSort reverse=new ReverseSort();
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = rand.nextInt(4000) + 1;
			com[i]=array[i];
		}


		System.out.println("Choose one: \n 1. Unsorted Array \n 2. Sorted Array \n 3. Reversely Sorted Array" );
		int userInput= scan.nextInt();

		if(userInput==2)
		{
			insert.sort(array);
			for (int i = 0; i < array.length; i++)
			{
				com[i]=array[i];
			}

		}

		if(userInput==3)
		{
			reverse.rsort(array);
			for (int i = 0; i < array.length; i++)
			{
				com[i]=array[i];
			}
		}



		System.out.println();

		System.out.println("Sorting using insertion sort");
		long startTime1 = System.currentTimeMillis();
		insert.sort(array);
		long stopTime1 = System.currentTimeMillis(); 
		long elapsedTime1 =stopTime1 - startTime1; 
		System.out.println("\n" + elapsedTime1 +"milliseconds");
	
		System.out.println();

		System.out.println("Sorting using merge sort");
		long startTime2 = System.currentTimeMillis();
		merge.partition(array);
		long stopTime2= System.currentTimeMillis(); 
		long elapsedTime2 =stopTime2 - startTime2; 
		System.out.println("\n" + elapsedTime2 +"milliseconds");

		System.out.println();

		System.out.println("Sorting using randomized quick sort");
		long startTime3 = System.currentTimeMillis();
		ran.QuickSort(array, 0, array.length -1);
		long stopTime3 = System.currentTimeMillis(); 
		long elapsedTime3 =stopTime3 - startTime3; 
		System.out.println("\n" + elapsedTime3 +"milliseconds");
		
		System.out.println();
		
		System.out.println("Sorting using Quick median sort");
		long startTime4 = System.currentTimeMillis();
		quick.quicksort(com);
		long stopTime4 = System.currentTimeMillis(); 
		long elapsedTime4 =stopTime4 - startTime4;
		System.out.println("\n" + elapsedTime4 +"milliseconds");
	}
}
