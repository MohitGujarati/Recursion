package com.company;


/*
class recursion{
    static void fun(int n){
        if (n==0)
            return;
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(15);
    }
}
*/// print n to 1 in recursive form

/*
class rec{
    static  void fun(int n) {
        {
            if(n == 0)
                return;

            fun(n - 1);

            System.out.print(n+" ");

        }

    }
    public static void main(String[] args) {
        fun(15);
    }
}

 */// print 1 to n in recursive form

/*
class rec{
    static void fun(int n, int k){
        if (n==0)
            return;
        System.out.println(k);
        fun(n-1,k+1);
    }
    public static void main(String[] args) {
    fun(15,1);

    }
}

 */// print 1 to n in "TAIL RECURSIVE"form(Faster)

/*
class fac{
     static void fun(int n,int k){
         if (n==0 || n==1)
             return;

         fun(n-1,k*n);
         System.out.println(k);


     }
    public static void main(String[] args) {
        fun(4,1);
    }
}

 *///factorial using Tail recursion (Faster)

/*
public class Recursion {
    static int   factorial (int n){

        if (n==0 || n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));

    }
}

 *///factorial using recursion

/*
class fibonacci{
    static int fun(int n){
        if (n<=1)
            return n;
        return fun(n-1)+fun(n-2);


    }

    public static void main(String[] args) {
      fun(10);

    }
}

 */// fibonacci using recursion

/*
class recursion {
   static int sum(int b){      //b=10
    if(b==1){
        return 1;
         }

        if (b>0){
            return b+sum(b-1);
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("sum of first n natural number "+ sum(10));
    }
}

 *///sum of n natural numbers using recursion

/*
class palindrome {
    static boolean fun(String a,int start,int end){
        if (start>=end)
        return true;

        return (a.charAt(start)==a.charAt(end) && fun(a,start+1,end-1));

    }
    public static void main(String[] args) {

        String a="AABBAA";
        System.out.println(fun(a, 0, a.length() -1));
    }
}

 */ //palindrome or not

/*
class digitsum{
    static int fun(int n){
        {
            if (n < 10)
                return n;

            return fun(n / 10) + n % 10;
        }
    }
    public static void main(String[] args) {
        fun(253);


    }
}

 *///sum of the digits

/*
class DigitSum{
    private static int  fun(int n) {

        int res=0;
        if (n>0){
            res=res+n%10;
            n=n/10;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(fun(999)); ;

    }
}

 */// sum of digit non recursive

/*
class power {
    static int stepcount = 0;
    static int pow(int a, int b) {
        stepcount++;
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }

  // use this in interview
    static int fastpower(int a, int b) {

        stepcount++;
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return fastpower(a * a, b / 2);
        }
        return a * fastpower(a, b - 1);
    }

    public static void main(String[] args) {

        System.out.println(pow(3, 10));
        System.out.println(stepcount + " step count ");
        stepcount = 0;
        System.out.println(fastpower(3, 10));
        System.out.println(stepcount + " step count ");

    }
}

 */ //a to power b

/*
class digit {
    static int fun(int n,int count){
        if (n==0){
            return 0;
        }
        System.out.println(count);
       return fun(n/10,count+1);

    }
    public static void main(String[] args) {
      fun(599,1);
    }
}

 */ //no of digits

/*


class nm_matrix{

    static int matrix(int n, int m){
        if (m==1 || n==1) return 1;
            return matrix(n-1,m)+matrix(n,m-1);

    }
        public static void main(String[] args) {
                System.out.println(matrix(4,4));

    }

 *///find all the paths in m*n grid

/*

class  Reverse_Array_recursion {
    public static void reverse(int arr[], int start, int end) {

        // terminating condition
        if (start >= end)
            return;
        //logic to swap value
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        //Recursive call
        reverse(arr, start + 1, end - 1);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();

        //Declaring  Array
        int arr[] = new int[n];

        System.out.println("Enter the array values");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //Reverse an Array
        reverse(arr, 0, n - 1);
        System.out.println("After reversing the array ");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

    }
}

 */// Reverse_Array_recursion(IMP)

//most imp and asked questions
/*
class Tower_of_hanoi
{
    static void towerOfHanoi(int n, char location, char destination, char restpoint)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod "+ location +" to rod "+destination);
            return;
        }
        towerOfHanoi(n - 1, location, restpoint, destination);
        System.out.println("Move disk "+ n + " from rod " + location +" to rod " + destination );
        towerOfHanoi(n - 1, restpoint, destination, location);
    }


    // Driver code
    public static void main(String args[])
    {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C');  // A(Location), B(destination) and C(restpoint) are names of rods
    }
}

 *///  "tower of hanoi puzzle"

/*
class rope{
    static int maxCuts (int n,int a,int b,int c)
    {
        if(n==0)
            return 0;
        if (n<=-1)
            return -1;


        int res=Math.max(maxCuts(n-a,a,b,c),
                Math.max(maxCuts(n-b,a,b,c),
                maxCuts(n-c,a,b,c)));

        if (res==-1)
            return -1;
        return res+1;
    }
    public static void main(String[] args) {

        int n=9,a=2,b=2,c=2;
        System.out.println(maxCuts(n,a,b,c));

    }
}

 *///Rope cutting problem //better solution in dynamic programing

/*
class subset{
    static void sub(String str,String curr,int index)
    {
        if (index==str.length())
        {
            System.out.println(curr+" ");
            return;
        }

        sub(str, curr, index+1);
        sub(str,curr+str.charAt(index),index+1);

    }
    public static void main(String[] args) {
        String str="AB";
        sub(str," ",0);

    }

}

 *///generate subset

/*
class joshepus{

    static int fun(int n,int k){
        if (n==1)
            return 0;
        else
            return (fun(n - 1, k) + k) % n ;
    }
    public static void main(String[] args) {
        int n=7;
        int k=3;
        //if the program begins with 0
        System.out.println(fun(n,k));
       // if the program begins with 1
    }
}

 *///joshepus problem

/*


*
class test{
    static void fun1(int n){
        if (n==0)
            return;

        System.out.println(n);
        fun1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        fun1(3);

    }
}

 * //recursion o/p part 1
*
class test{
    static void fun(int n){
        if (n==0)
            return;
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(3);

    }
}

 *  //recursion o/p part 1
*
class test{
   static int fun(int n){
        if (n==1)
            return 0;

        else

        System.out.println(n);
        return 1+fun(n/2);
    }
    public static void main(String[] args) {
        fun(16);

    }
}

 * //recursion o/p part 2
*
class test{
  static   void fun(int n){
        if (n==0)
            return;
        fun(n/2);
      System.out.println(n%2);
    }
    public static void main(String[] args) {
        fun(13);
    }
}

 *  //recursion o/p part 2  this program prints the biary of the input number
*/ //guess the output
