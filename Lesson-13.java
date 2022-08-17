// Exceptions
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 0;
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(a/b);
      System.out.println("Hello World!");
  }
}

// Exceptions
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 0;
      
      try {
        int c = a / b;
        System.out.println(c);
      }
      catch(Exception ex) {
        System.out.println("Делить на ноль нельзя!");
      }
      
      System.out.println("Конец выполнения программы");
  }
}

// Exceptions
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = 10;
      int b = 0;
      int[] array = new int[5];
      
      try {
        int c = a / b;
        array[5] = 10; 
      }
      catch(ArithmeticException ex1) {
        System.out.println("Деление на ноль!");
      }
      catch(ArrayIndexOutOfBoundsException ex2) {
        System.out.println("Выход за границы массива!");
      }
      catch(Exception ex3) {
        System.out.println("Обрабатываем исключение...");
      }
      
      System.out.println("Конец выполнения программы");
  }
}

// StackTrace
import java.util.*;

public class Main {
    
    public static void function1() {
      function2();
    }
    
    public static void function2() {
      function3();
    }
    
    public static void function3() {
        int a = 10;
        int b = 0;
        int c = a / b;
        function4();
    }
    
    public static void function4() {
      System.out.println("Hello!");
    }
    
    public static void main(String[] args) {
      
      try {
        function1();  
      }
      catch(Exception ex) {
        System.out.println("Встретили исключительную ситуацию!");
        ex.printStackTrace();
      }
      
      System.out.println("Программа завершена...");
  }
}

// Unit tests
https://codeboard.io/projects/341263
https://codeboard.io/projects/341264
https://codeboard.io/projects/341274