package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.

	public class Numbers {
/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */
    public static void  main(String[] args) throw exception  {

        int [] num = new int[10000000];
        storeRandomNumbers(num);



        Sort algo = new Sort();
        int n = num.length;


        //Selection Sort
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

        //Insertion Sort
        randomize (num, n);
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

        //By following above, Continue for rest of the Sorting Algorithm....
        //Come to conclusion about which Sorting Algo is better in given data set.

        //bubble sort
        randomize (num, n);
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

        //merge sort
        randomize (num, n);
        algo.mergeSort(num,0,n-1);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");

        //quick sort
        randomize (num, n);
        algo.quickSort(num,0,n-1);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");

        heap sort
        randomize (num, n);
        algo.heapSort(num,n);
        int maxValueForBucketSort = num[num.length-1];
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");

        //bucket sort
        randomize (num, n);
        algo.bucketSort(num,maxValueForBucketSort);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
        }


        }




        }
