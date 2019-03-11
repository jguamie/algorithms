# Sorts
## Merge Sort
Time complexity: O(n log n) for worst, average and best case.<br/>
Space complexity: O(n)
```
void mergeSort(array, left, right)
   if (left < right)
      middle = (left + right) / 2
      mergeSort(array, left, middle)
      mergeSort(array, middle + 1, right)
      merge(array, left, middle, right)

void merge(array, left, middle, right)
   \\ merge the two arrays
```
## Quick Sort
Time complexity: O(n log n) for average and best case. O(n<sup>2</sup>) for worst case.<br/>
Space complexity: O(log n) for in-place.<br/>
`pi` is the partitioning index.
```
void quickSort(array, low, high)
   if (low < high)
      pi = partition(array, low, high)
      quickSort(array, low, pi - 1) 
      quickSort(array, pi + 1, high)
      
int partition(array, low, high)
   pivot = array[high]  
   int i = low - 1 
   for (int j = low; j < high; j++) 
      if (array[j] <= pivot)  
         i++ 
         swap(array[i], array[j])
   swap(array[i + 1], array[high])  
   return i + 1
```
