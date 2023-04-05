# There are 10 classes and 1 Main class, 10 classes represent Tasks, in each classes there are function to each task which is explained below. In the Main class there is a switch statement and you can test all tasks in Main.
# Task 1
## @findMin - a function which is finding minimum element of array using recursion 
## @n - number of elements of an array
## @arr - array which user inputs

```java
public int findMin(int n, int[] arr){
        if(n == 1){
            return arr[0];
        }
        else{
            int min = findMin(n-1, arr);
            return Math.min(min, arr[n-1]);
        }
    }
```
## We can see from the findMin function how the algorithm is performed. It walks through the next two elements of the array starting with 0 and compares them using the Math.min function   

# Task 2
## @findAvg - a function which is finding average of all elements of an array using recursion
## @n - number of all elements of an array
## @arr - an array which user inputs

```java
public double findAvg(int n, int[] arr){
        if (n == 1){
            return arr[0];
        }
        else{
            return (arr[n-1] + findAvg(n-1, arr) * (n-1)) / n;
        }
    }
```
## That function works using formula arr[n-1] + findAvg(n-1, arr) * (n-1)) / n

# Task 3
## @isPrime - A function which gives an answer whether the number is prime or not by going to the function isPrimeChecker 
## @isPrimeChecker - A function where our algorithm works using recursion
## n - a number which user inputs
## divisor - a divisor number which starts from 2

```java
public boolean isPrime(int n){
        return isPrimeChecker(n, 2);
    }
```

```java
public boolean isPrimeChecker(int n, int divisor){
        if (n <= 2){
            return n == 2;
        }
        if (divisor * divisor > n){
            return true;
        }
        if (n % divisor == 0){
            return false;
        }
        return isPrimeChecker(n, divisor + 1);
    }
```
## In function isPrimeChecker first if construction check if $n \leq 2$  because 2 is the smallets prime number, then it checks whether $divisor^2 > n$, it means our number is prime. Finally if our number is divisible by our divisor, it is not prime

# Task 4
## @findFactorial - a function where algoritgh to find facrorial using recursion works
## @n - a number which user inputs

```java
public int findFactorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else{
            return n * findFactorial(n-1);
        }
    }
```
## In first if construction the end point is when n = 0 or n = 1, it return 1, otherwise it multiplies by n

# Task 5
## @findFibonacci - a function where algoritgh to find fibonacci using recursion works
## @n - a number which user inputes 
```java
public int findFibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
```
## In first if construction the end point is when n = 1 or n = 2, it return 1, otherwise we find fibonacci number using the formula $F_n = F_{n-1} + F_{n-2}$

# Task 6
## @powerOfA - a function which consist finds $a^n$ using recursion
## @a and n - numbers which user inputs
```java
public int powerOfA(int a, int n){
        if(n == 1){
            return a;
        }else{
            return a * powerOfA(a, n-1);
        }
    }
```
## In first if contruction when n = 1 it's a end point in recursion, in other situations it just multiplies by an a

# Task 7
## @reverseNumbers - a function where an array outputs reversed
## @n - a number of elements of an array
## @arr - an array 
```java
public int reverseNumbers(int n, int[] arr){
        if (n == 0){
            return arr[0];
        }else{
            System.out.print(arr[n-1] + " ");
            return reverseNumbers(n-1, arr);
        }
    }
```
## As we see, the last point in recursion is when n = 0, it return first element of an array, otherwise it begins from last elements, firstly it outputs, then calling itself, from n - 1 element

# Task 8 
## @isAllDigits - is a function which checks the string whether all elements are digits or not
## @string - it's a string which user inputs
```java
public boolean isAllDigits(String string){
        if (string.isEmpty()){
            return true;
        }
        if(Character.isDigit(string.charAt(0))){
                return isAllDigits(string.substring(1));
        }else{
            return false;
        }
    }
```
## Here's an explanation how the functrion works:  
## $\S1.$ If the input string is empty, it returns true since there are no non-digit characters to be found.  
## $\S2.$ If the first character of the input string is a digit, the function calls itself recursively, passing the substring of the original string starting from the second character (i.e., excluding the first character) as the argument. The idea is to keep checking the remaining characters until we reach the end of the string.  
## $\S3.$ If the first character of the input string is not a digit, the function returns false since we have found a non-digit character and there is no need to continue checking the rest of the string.  
## $\S4.$ Steps 2 and 3 are repeated recursively until the entire string is processed.  
## The Character.isDigit() method is used to check if a given character is a digit or not. It returns true if the character is a digit and false otherwise.  

# Task 9 
## @findBinomialCoefficient - a function which find Binomial Coefficient using 2 numbers using recursion
## @n and k - numbers which user inputs
```java
public int findBinomialCoefficient(int n, int k){
        if (k == 0 || n == k){
            return 1;
        }else{
            return findBinomialCoefficient(n-1, k-1) + findBinomialCoefficient(n-1, k);
        }
    }
```
## Here's an explanation how the functrion works:  
## $\S1.$ Firstly it checks whether k = 0 or n = k, because $C_{0}^{n} = C_{n}^{n} = 1$, it return 1
## $\S2.$ Then, it find binomial coefficient using formula $C_{k}^{n} = C_{k-1}^{n-1} + C_{k}^{n}$
## $\S3.$ Finally, it repeated recursively until k = 0 or n = k

# Task 10
## @findGCD - a function which find GCD(a, b)
## @a and b - numbers which user inputs
## @remainder - remainder a / b
```java
public int findGCD(int a, int b){
        if (a % b == 0){
            return b;
        }else{
            int remainder = a % b;
            return findGCD(b, remainder);
        }
    }
```
Here is an explanation how algorithm works:  
## $\S1.$ Firstly, it finds remainder from division a to b
## $\S2.$ Then it call itself where a = b and b = remainder
## $\S3.$ Then it repeated recursively until remainder a / b = 0

