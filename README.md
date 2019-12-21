# Comparison-based Sorting Algorithms
##### Implementing comparison-based sorting algorithms and observing their performance

## 1. Sorting Algorithms
We are implementing four sorting algorithms namely, Insertion Sort, Merge Sort, In-place Quicksort and Modified Quicksort.

#### 1.1. Insertion Sort
Insertion Sort is an in-place comparison-based sorting algorithm. A sub-list of sorted elements is maintained. For example, the first element is initially imagined to be the only element in the sorted sub-list. Then the element to be inserted in this sorted sub-list, must be compared with the existing elements in it and then after finding a place, it must be inserted there. The array is scanned sequentially, and the items are moved from unsorted to the sorted sub-list. Since the sorted sub-list is imagined to be the first character of the array, comparison and insertion is done using the same single array. This algorithm is not suitable for large data sets as its average and worst-case complexity are of Ο(n2), where n is the number of items.
#### 1.2. Merge Sort
Merge sort is a sorting technique based on divide and conquer technique. The array sent to the merge sort is first divided into two halves, and then elements of the two halves are compared and arrays are merged. But this partition is carried on till only one element is left for partition and then the merging begins. It has the worst-case time complexity of Ο (n log n) and is a very efficient algorithms. A downside with merge sort is the space required by extra arrays created for partition and merging.
#### 1.3. Randomized In-place Quicksort
Quick sort is a highly efficient sorting algorithm and the partitioning method to divide array into smaller arrays. A large array is partitioned into two arrays using an element called pivot. This pivot is selected randomly every time and is such that one side of the pivot has elements lesser than it and the other side has elements greater than the pivot value. Quick sort partitions an array and then calls itself recursively twice to sort the two resulting subarrays. This algorithm is quite efficient for large-sized input as its average and worst-case complexity are of Ο(n2), where n is the number of items.
#### 1.4. Modified Quicksort
It is like the usual quicksort but includes two modifications. Firstly, the pivot element is not randomly selected rather the median of three elements i.e. leftmost, rightmost and center is calculated to be used as the pivot. Secondly, whenever the size of the unsorted array is lesser than or equal to 10, insertion sort is called for further sorting.

## 2. Program Structure
The programming language used for this project was Java. We’ve divided the program into five classes.
#### 1. Sorting: 
##### Class- Contains the main method
##### Functions:
Generates input array using an in-built function
Passes the input array and calls functions to perform sorting on it
##### Global Variables: None

#### 2. InsertionSort: 
##### Class- sorts the passed array using insertion sort
##### Functions:
sort: Takes the array as a parameter and sorts it using insertion sort
##### Global Variables: None

####  3. MergeSort: 
##### Class- sorts the passed array using merge sort
##### Functions:
partition: divides the array into two equal parts
merge: combines the two partitioned arrays into one array after comparing the elements
##### Global Variables: None
#### 4. Randomized_quick_sort:
##### Class- This class sorts the passed array using Randomized in-place quick sort, that is, by using any random element as the pivot
##### Functions:
swap: swaps the values at indexes passed to it
QuickSort: sorts all the elements between the start and end index passed to it
partition: divides the array using a random pivot each time, such that all elements on one side are lesser than pivot and on one side are greater than pivot
##### Global Variables: None
#### 5. QuickSortMedian: 
##### Class- This class sorts the passed array using quick sort by using median-of-three as the pivot element
##### Functions:
swap: swaps two elements
InsertionSort: when the number of elements is less than 10, insertion sort is used for sorting the array
Quicksortmed: usual quick sort is performed but the pivot element is always the median and calculates the median of three numbers
##### Global Variables: None
#### 6. ReverseSort : 
##### Class- This class reversely sorts the passed array and then can be used by each sorting algorithm to analyze.
##### Functions:
rsort: reversely sorts the array.
##### Global Variables: None
### 2.1 Input
In-built Random function is used for generating random input numbers.
### 2.2 Functionality
The program is initiated by the main class ‘Sorting’, which generates an array of random integers using an in-built Random function. This array is then passed to different functions where the respective sorting techniques are performed. The main class passes the array as a parameter to the InsertionSort class, MergeSort class, Randomized_quick_sort class and QuickSortMedian class. These functions return the sorted array. An in-built function is used for recording the start and stop time of processing of each algorithm to record the execution time. Once the sorting is done by all the algorithms, the execution time is printed on the screen.
## 3. Execution Results
We can conclude that insertion sort works faster compared to other sorting algorithm when the array is already sorted and works slower when the array is reversely sorted. However, merge sort, randomized quicksort and quicksort with median of three elements works similar even when the array is sorted or reversely sorted compared to unsorted array.
