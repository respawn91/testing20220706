import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int[] array1 = new int[5];
      
      array1[0] = 5;
      array1[2] = 15;
      array1[4] = 25;
      
      System.out.println(array1[0]);
      System.out.println(array1[1]);
      System.out.println(array1[2]);
      System.out.println(array1[3]);
      System.out.println(array1[4]);
      
  }
}

import java.util.*;

public class Main {
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
      
      int[] array1 = new int[5];
      
      array1[0] = 5;
      array1[2] = 15;
      array1[4] = 25;
      
      printArray(array1);
      
      int[] array2 = {1, 5, 7, 8, -2, -5, 12, 0};
      
      printArray(array2);
      
  }
}

// Task #1
import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
      
      int n = 10;
      
      printArray(scanArray(n));
  }
}

// Task #2
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
    
      printArray(generateArray(10));
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      String[] array = new String[10];
      
      array[0] = "Hello";
      array[3] = "from";
      array[6] = "Kazan";
      array[7] = "and";
      array[9] = "Innopolis";
      
      for(int i = 0; i < 10; i++) {
        System.out.print(array[i] + " ");
      }
      
  }
}

// Fibonacci
import java.util.*;

public class Main {

    public static void printArray(int[] array) {
        
        for(int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
        }
        System.out.println();
      }
    
    public static int[] fibonacciArray(int n) {
      
        int[] array = new int[n];
        
        array[0] = 1;
        array[1] = 1;
        
        for(int i = 2; i < array.length; i++) {
          array[i] = array[i-1] + array[i-2];
        }
        
        return array;
    }
  
    public static void main(String[] args) {
      
      printArray(fibonacciArray(15));
      
  }
}

// Task #4.1
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] multiplyArray(int[] array, int n) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static void main(String[] args) {
    
      int[] array = generateArray(10);
      
      printArray(array);
      
      array = multiplyArray(array, 2);
      
      printArray(array);
      
      array = multiplyArray(array, 5);
      
      printArray(array);
      
      
  }
}

// Task #5.1
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100);
      }
      
      return array;
    }
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] multiplyArray(int[] array, int n) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static void printNonNegativeElements(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] >= 0) {
          System.out.print(array[i] + " ");
        }
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      int[] array = {1, -2, 3, 0, -6, -2, 7, -3, 0};
      
      printArray(array);
      printNonNegativeElements(array);
  }
}

// Task #6
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(20);
      }
      
      return array;
    }
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] multiplyArray(int[] array, int n) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static void printNonNegativeElements(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] >= 0) {
          System.out.print(array[i] + " ");
        }
      }
      System.out.println();
    }
    
    public static int findMaxElementOfArray(int[] array) {
      
      int max = array[0];
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] > max) {
          max = array[i];
        }
      }
      
      return max;
    }
    
    public static int indexOfMaxElementOfArray(int[] array) {
      
      int index = 0;
      
      int max = findMaxElementOfArray(array);
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max) {
          index = i;
          break;
        }
      }
      
      return index;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      
      printArray(array);
      
      System.out.println(findMaxElementOfArray(array));
      System.out.println(indexOfMaxElementOfArray(array));
  }
}

// Task #6
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static int[] scanArray(int n) {
      
      int[] array = new int[n];
      
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
      }
      
      return array;
    }
    
    public static int[] generateArray(int n) {
      
      int[] array = new int[n];
      
      Random r = new Random();
      
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(20);
      }
      
      return array;
    }
    
    public static void printArray(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] multiplyArray(int[] array, int n) {
      
      for(int i = 0; i < array.length; i++) {
        array[i] = array[i] * n;
      }
      
      return array;
    }
    
    public static void printNonNegativeElements(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] >= 0) {
          System.out.print(array[i] + " ");
        }
      }
      System.out.println();
    }
    
    public static int findMaxElementOfArray(int[] array) {
      
      int max = array[0];
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] > max) {
          max = array[i];
        }
      }
      
      return max;
    }
    
    public static int indexOfMaxElementOfArray(int[] array) {
      
      int index = 0;
      
      int max = findMaxElementOfArray(array);
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max) {
          index = i;
          break;
        }
      }
      
      return index;
    }
    
    public static int[] swapElementsOfArray(int[] array, int n, int m) {
      
      if((n < array.length) && (m < array.length) && (n >= 0) && (m >= 0)) {
        int temp = array[n];
        array[n] = array[m];
        array[m] = temp;
      }

      return array;
    }
    
    public static void main(String[] args) {
      
      int[] array = generateArray(10);
      printArray(array);
      
      swapElementsOfArray(array, 0, 9);
      printArray(array);
      
  }
}