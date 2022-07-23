// Функции

import java.util.*;

public class Main {
    
    public static int max(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
  
    public static void main(String[] args) {
      
      int x = 10;
      int y = 20;
      
      int maximum = max(x,y);
      System.out.println(maximum);
      
      int a = 50;
      int b = 100;
      
      System.out.println(max(a,b));
  }
}

// Функции

import java.util.*;

public class Main {
    
    public static int max(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static void printMaxElement(int a, int b) {
      
      if(a > b)
        System.out.println(a);
      else
        System.out.println(b);
    }
  
    public static void main(String[] args) {
      
      int x = 10;
      int y = 20;
      
      int maximum = max(x,y);
      System.out.println(maximum);
      
      int a = 50;
      int b = 100;
      
      System.out.println(max(a,b));
      
      printMaxElement(a, x);
      printMaxElement(55, 67);
      printMaxElement(-60, -55);
  }
}

// Функции

import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static int max(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static void printMaxElement(int a, int b) {
      
      if(a > b)
        System.out.println(a);
      else
        System.out.println(b);
    }
  
    public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     int numberOne = sc.nextInt();
     int numberTwo = sc.nextInt();
     
     printMaxElement(numberOne, numberTwo);
  }
}

// Task#1

import java.util.*;

public class Main {
    
    public static void printElements(int number, int rows, int columns) {
      
      for(int i = 0; i < rows; i++) {
        for(int j = 0; j < columns; j++) {
          System.out.print(number + " ");
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
    
      printElements(11, 15, 4);
  }
}

// Task#3

import java.util.*;

public class Main {
    
    public static void printElement(int a, int b) {
      
      System.out.printf("%d + %d = %d\t", a, b, a + b);
    }
    
    public static void printLine(int n) {
      
      for(int i = 1; i <= 9; i++) {
        printElement(n, i);
      }
      System.out.println();
    }
    
    public static void printTable() {
      
      for(int i = 1; i <= 9; i++) {
        printLine(i);
      }
    }
    
    public static void main(String[] args) {
    
      printTable();
  }
}

// Task#4

import java.util.*;

public class Main {
    
    public static int fibClassic(int n) {
            
      if((n == 1) || (n == 2)) {
        return 1;
      }
      else {
        
        int f1 = 1;
        int f2 = 1;
        int fk = 0;
        
        for(int i = 3; i <= n; i++) {
          fk = f1 + f2;
          f1 = f2;
          f2 = fk;
        }
        return fk;
      }
    }
    
    public static void printFibClassic(int n) {
      
      for(int i = 1; i <= n; i++) {
        System.out.print(fibClassic(i) + " ");
      }
      System.out.println();
    }
    
    public static int fibRecursive(int n) {
      
      if((n == 1) || (n == 2))
        return 1;
      else
        return fibRecursive(n-1) + fibRecursive(n-2);
    }
    
    public static void printFibRecursive(int n) {
      
      for(int i = 1; i <= n; i++) {
        System.out.print(fibRecursive(i) + " ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
      
      printFibClassic(15);
      printFibRecursive(15);
  }
}

// Task#5

import java.util.*;

public class Main {
    
    public static long factorialRecursive(int n) {
      
      if((n == 0) || (n == 1))
        return 1;
      else
        return n * factorialRecursive(n-1);
    }    
    
    public static long factorialClassic(int n) {
      
      if((n == 0) || (n == 1))
        return 1;
      else {
        long result = 1;
        
        for(int i = 1; i <= n; i++) {
          result = result * i;
        }
        return result;
      }
    }

    public static void main(String[] args) {
      
      System.out.println(factorialRecursive(15));
      System.out.println(factorialClassic(15));
  }
}

// Task #6

import java.util.*;

public class Main {
    
    public static int maxOfTwo(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static int maxOfThree(int a, int b, int c) {
      /*
      if((a >= b) && (a >= c))
        return a;
      else
        if((b >= a) && (b >= c))
          return b;
        else
          return c;
        */
      return maxOfTwo(maxOfTwo(a,b), c);
    }
    
    public static int maxOfFour(int a, int b, int c, int d) {

      return maxOfTwo(maxOfTwo(a,b), maxOfTwo(c,d));
    }    
    
    public static void main(String[] args) {
      
      System.out.println(maxOfTwo(15, 15));         // 15
      System.out.println(maxOfThree(5, 10, 15));    // 15
      System.out.println(maxOfThree(-5, -10, -15)); // -5
      System.out.println(maxOfThree(0, 0, 0));      // 0
      System.out.println(maxOfFour(5,7,12,24));     // 24
  }
}

// Task #6

import java.util.*;

public class Main {
    
    public static int max(int a, int b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static double max(double a, double b) {
      
      if(a > b)
        return a;
      else
        return b;
    }
    
    public static int max(int a, int b, int c) {

      return max(max(a,b), c);
    }
    
    public static int max(int a, int b, int c, int d) {

      return max(max(a,b), max(c,d));
    }    
    
    public static void main(String[] args) {
      
      System.out.println(max(15, 15));         // 15
      System.out.println(max(5, 10, 15));    // 15
      System.out.println(max(-5, -10, -15)); // -5
      System.out.println(max(0, 0, 0));      // 0
      System.out.println(max(5,7,12,24));     // 24
      
      System.out.println(max(15.0, 15.5));    // 15.5
  }
}

// Task #7

import java.util.*;

public class Main {
    
    public static boolean isTriangle(double a, double b, double c) {
      if((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (b + c > a))
        return true;
      else
        return false;
    }
    
    public static double perimetr(double a, double b, double c) {
      
      if(isTriangle(a,b,c) == true)
        return a + b + c;
      else
        return 0;
    }
    
    public static double square(double a, double b, double c) {

      if(isTriangle(a,b,c) == true) {
      
      double p = perimetr(a,b,c) / 2;
      
      double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
      
      return s;        
      }
      else
       return 0;
    }
    
    public static void main(String[] args) {
      
      double a = -3;
      double b = 4;
      double c = -5;
      
      System.out.println(perimetr(a,b,c));
      System.out.println(square(a,b,c));
      
  }
}