Q1.int sum = 0;

for(int i = 0; i < n; i++) {
    sum += i;
}
ANS:TC: O(n)
SC: we are not creating the extra memory the i is fixed so it is O(1)

Q2.int[] temp = new int[n];

for(int i = 0; i < n; i++) {
    temp[i] = i;
}
ANS: TC: O(n)
SC: we are not creating so it is O(1)

Q3. int[][] matrix = new int[n][n];
ANS: TC : how do i know the tc i think we have two and it is a matrix so it is O(n square)
SC: we are creating extra memory and it is matrix so it is O(n square)

Q4. void print(int[] arr) {

    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

}
ANS: TC : O(n)
SC: we are not creating any extra space so it is O(1)
-------------------------------
Q1. int[] temp = new int[1000];

for(int i = 0; i < n; i++) {

}
ANS: TC: O(n)
SC: the memory is fixed it is 1000 and we are not creating the extra space so it is O(1)

Q2. int[][] dp = new int[n][m];
ANS: TC : O(n square)
SC : we are creating matrix so it is O(n square)

Q3. int[] a = new int[n];
int[] b = new int[n];
ANS: SC: it is variables so it is O(1)

Q4. int x = 10;
int y = 20;
int z = 30;
ANS: SC: variables simple no extra memory creation so it is O(1)
------------------------------
Q1. int[] arr = new int[n];

int sum = 0;
ANS: Sc: we are creating extra memory so it is O(n)

Q2. int[][] grid = new int[n][5];
ANS: here one dimension is constant so acc to big O we ignore constanst and we can create n one dimension suppose rows and only 5 columns so at last it is O(n)

Q3. int[][] grid = new int[100][100];
ANS here the size is fixed for both the dimensions as 1000 suppose we create 10 10 or even big we are not creating extra space so it is O(1)

Q4. int[] a = new int[n];

int[][] b = new int[n][n];
ANS: there are two arrays one is O(n) and another is O(n square) so final it becomes O(n square)

Q5. void solve(int[] arr){

    int max = arr[0];

    for(int i=0;i<arr.length;i++){

        if(arr[i]>max)
            max=arr[i];

    }

}
ANS: TC : O(n)
SC : we are not creating extra memory so it is O(1)