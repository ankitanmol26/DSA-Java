Q1. int[] arr = new int[10];
ANS: 10

Q2. What is the last valid index?
ANS: arr[9]

Q3. int[] arr = {5, 10, 15, 20, 25};
What is :
arr[0] : 5
arr[2] : 15
arr[4] : 25

Q4. Which is invalid?
arr[-1]
arr[0]
arr[4]
arr[5]
Explain why.
ANS: arr[-1] is invalid coz the array starts from 0 index and end on length -1 so the arr[-1] is invalid

Q5. Why is:
arr[100]
considered O(1) ,even if the array contains 10 million elements?
ANS: coz the memory directly search the arr[100] by its indexing , no need to traverse every element to access it directly access using indexing , so thats why it is considered as O(1). even if it has 10 million it is considered as O(1).