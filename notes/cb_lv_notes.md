---
id: wv9ecyppldu2bzvi4f2s0v2
title: CB LIVE NOTES
desc: ''
updated: 1730687232932
created: 1730680718098
---
# Arrays 
### Sorting 
- Bubble Sort
- Insertion Sort 
- Selection Sort

### Bubble Sort
Bubble Sort is a comparison based Sorting Algorithm, Comparing adjcent element.In each pass, compare the adjacent element in the array and exchange those that are not in order.
For an n-element array, it requires (n-i) comparisons for the ith iteraion(pass).

### Pseudo Code :Bubble Sort(Array a[])
 * begin
 * for i=1 to n-1
 * <pre> for j=1 to n-i
 * <pre>   if(a[j]>a[j+1]) then
 * <pre>      swap(a[j],a[j+1])
 * end 


### Selection Sort
It is a natural Sorting Algorithm, We find minimum, second minimum, third minimum and so on and arrange them in increasing order. During the (i)th stage selection sort incurs (n-i) comparisons.

### Pseudo Code: Selection Sort (a[])
- begin
- <pre> for j=1 to n-1
- <pre>   min =j
- <pre>   for i=j+1 to n
- <pre>     if a[i]< a[min]
- <pre>       min=i
- <pre>  Swap(a[j],a[min])
- end
