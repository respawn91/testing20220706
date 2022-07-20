// FOR

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i <= 10; i++)
      {
        System.out.println("Hello World");
      }
  }
}

//

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 0; i <= 10; i++)
      {
        System.out.print(i + " ");
      }
  }
}

// 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = -20; i < 0; i = i + 2)
      {
        System.out.print(i + " ");
      }
  }
}

// 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 1; i <= 100; i = i * 2)
      {
        System.out.print(i + " ");
      }
  }
}

// Task #1
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 20;
      
      for(int i = 0; i < 10 ; i++)
      {
        System.out.print(number + " ");
      }
  }
}

// Task #2
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 10; i <= 25 ; i++)
      {
        System.out.printf("%d %d.4\n", i, i);
      }
  }
}

// Task #3
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 1; i <= 9 ; i++)
      {
        System.out.printf("%d x 7 =  %d\n", i, i*7);
      }
  }
}

// Task #4.1
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int sum = 0;
      
      for(int i = 100; i <= 500; i++)
      {
        System.out.println("=======================");
        System.out.println("i = " + i);
        System.out.println("Sum before = " + sum);
        sum = sum + i;
        System.out.println("Sum after = " + sum);
        System.out.println("=======================");
      }
      
      System.out.println("Sum of the range is " + sum);
  }
}

// Task #5
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int n = 5;
      
      int sum = 0;
      
      for(int i = 0; i < n; i++)
      {
        int temp = sc.nextInt();
        sum = sum + temp;
        System.out.print(temp + " ");
      }
      
      System.out.println();
      
      double avg = (double)sum / n;
      
      System.out.println("AVG = " + avg);
  }
}

// WHILE and DO WHILE

// Task #5
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int i = 0;
      
      while(i < 10)
      {
        System.out.print(i + " ");
        i++;
      }
  }
}

// Task #5
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int i = 0;
      
      do
      {
        System.out.print(i + " ");
        i++;  
      }
      while(i < 10);
  }
}

// Task #7
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int sum = 0;
      int count = 0;
      
      int temp = sc.nextInt();
      
      while(temp != 0)
      {
        sum = sum + temp;
        count++;
        System.out.print(temp + " ");
        temp = sc.nextInt();
      }
      
      System.out.println();
      System.out.printf("There are %d elements. The sum of the range is %d", count, sum);
      
  }
}

// WHILE
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      while(sc.hasNext())
      {
        int temp = sc.nextInt();
        System.out.print(temp + " ");
      }
  }
}

// Task #8.1
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 300431;
      int originalNumber = number;
      
      int countOfThree = 0;
      
      
      while(number != 0)
      {
        int ending = number % 10;
        
        if(ending == 3)
        {
          countOfThree++;
        }
        
        number = number / 10;
      }
      
      System.out.printf("# of 3 in number %d is %d", originalNumber, countOfThree);
  }
}

// Вывести все четные числа в диапазоне от 1 до 35
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
      for(int i = 1; i <= 35; i++)
      {
        if(i % 2 == 0)
        {
          System.out.print(i + " ");
        }
      }
      
      System.out.println();

      for(int j = 1; j <= 35; j++)
      {
        if(j % 2 != 0)
        {
          continue;
        }
        else
        {
          System.out.print(j + " ");
        }
      }      
  }
}

// Task 10.1
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = -91241234;
      int maxDigit = 0;
      
      while(number != 0)
      {
        int ending = Math.abs(number) % 10;
        
        if(ending > maxDigit)
        {
          maxDigit = ending;
        }

        number = number / 10;
      }
      
      System.out.println("Max digit = " + maxDigit);
  }
}

// Task 11
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      for(int i = 5000; i > 0; i--)
      {
        if(i % 39 == 0)
        {
          System.out.println("The number is " + i);
          break;
        }
      }
  }
}

