//
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      byte a = 10;
      int b = 240;
      
      int c = a + b;
  }
}

//
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      byte a = 10;
      int b = 10;
      
      byte c = a + b;
  }
}

// Task 1-1

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int days = 234;
      int weeks = days / 7;
      int months = days / 30;
      
      System.out.printf("Имеется %d. Это означает, что у нас %d недель и %d месяцев", days, weeks, months);
  }
}

// Math 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double pi = Math.PI;
      
      System.out.println(pi);
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double pi = Math.PI;
      
      System.out.println(pi);
      
      double sqrt = Math.sqrt(pi);
      
      System.out.println(sqrt);
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double a = Math.pow(2,3);
      
      System.out.println(a);
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double result = Math.pow(2, 2) + 3 * (5 + 3 * 2);
      
      System.out.println(result);
  }
}

// Task 1

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double r = 4;
      
      double c = 2 * Math.PI * r;
      
      System.out.println(c);
  }
}

// Task 3

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 913;
      
      int s = number / 100;
      int d = number % 100 / 10;
      // int d = number / 10 % 10;
      int e = number % 10;
      
      System.out.printf("%d = %d * 100 + %d * 10 + %d \n", number, s, d ,e);
  }
}

//

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      boolean b1 = 3 == 4;
      // false
      System.out.println(b1);
      
      boolean b2 = 3 > 4;
      // false
      System.out.println(b2);
      
      boolean b3 = 3 != 4;
      // true
      System.out.println(b3);
      
      boolean b4 = 4 > 4;
      // false
      System.out.println(b4);
      
      boolean b5 = 4 >= 4;
      // true
      System.out.println(b5);
  }
}

//

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      String s1 = "Test";
      String s2 = "test";
      
      System.out.println(s1 == s2);
  }
}

// Task 5

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 125123;
      
      boolean b1 = (number % 2 == 0);
      boolean b2 = (number % 10 == 7);
      
      System.out.println("Число четное? " + b1);
      System.out.println("Число оканчивается на 7? " + b2);
  }
}

//

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 100;
      
      if(a > 30)
      {
        System.out.println("Заданное число больше 30!");
      }
      
      if(a > 10)
      {
        System.out.println("Заданное число больше 10!");
      }      
      
  }
}

//

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 70;
      
      if(a > 50)
      {
        if(a >= 100)
        {
          System.out.println("Заданное число не меньше 100");
        }
      }
      
  }
}

//

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 70;
      
      if(a >= 100)
      {
        System.out.println("Заданное число больше 100");
      }
      else
      {
        System.out.println("Заданное число меньше 100");
      }
      
  }
}

// Task 6 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 70;
      int b = -150;
      
      System.out.println("a = " + a);
      
      if(Math.abs(a) > Math.abs(b))
      {
        a = a / 2;
      }
      
      System.out.println("a = " + a);
  }
}

// Task 7 (version 1)

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int w = 0;
      
      if(w > 0)
      {
        if(w >= 60)
        {
          if(w >= 75)
          {
            if(w >= 91)
            {
              System.out.println("Супертяжелый вес!");
            }
            else
            {
              System.out.println("Тяжелый вес!");
            }
          }
          else
          {
            System.out.println("Средний вес!");
          }
        }
        else
        {
          System.out.println("Легкий вес!");
        }
      }
      else
      {
        System.out.println("Введено невалидное значение!");
      }
  }
}

// Task 7 (version 2)

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int w = 100;
      
      if(w <= 0)
      {
        System.out.println("Введено невалидное значение!");
      }
      else
      {
        if(w < 60)
        {
          System.out.println("Легкий вес!");
        }
        else
        {
          if(w < 75)
          {
            System.out.println("Средний вес!");
          }
          else
          {
            if(w < 91)
            {
              System.out.println("Тяжелый вес!");
            }
            else
            {
              System.out.println("Супертяжелый вес!");
            }
          }
        }
      }
  }
}

// Task 7 (version 3)

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int w = 80;
      
      if(w <= 0)
      {
        System.out.println("Введено невалидное значение!");
      }
      else
      {
        if(w < 75)
        {
          if(w < 60)
          {
            System.out.println("Легкий вес!");
          }
          else
          {
            System.out.println("Средний вес!");
          }
        }
        else
        {
          if(w < 91)
          {
            System.out.println("Тяжелый вес!");
          }
          else
          {
            System.out.println("Супертяжелый вес!");
          }
        }
      }
  }
}

// Task 8

import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    int day = 10;
    
    switch(day)
    {
      case 1:
        System.out.println("Monday!");
        break;
      case 2:
        System.out.println("Tuesday!");
        break;
      case 3:
        System.out.println("Wednesday!");
        break;
      case 4:
        System.out.println("Thursday!");
        break;
      case 5:
        System.out.println("Friday!");
        break;
      case 6:
        System.out.println("Saturday!");
        break;
      case 7:
        System.out.println("Sunday!");
        break;
        
      default:
        System.out.println("Incorrect # of day!");
    }
  }
}

