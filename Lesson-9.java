// Queue
https://codeboard.io/projects/340477

// ArrayList
import java.util.*;
import java.util.ArrayList;

public class Main {
  
    public static void print(ArrayList<String> list) {
      
      for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ; ");
      }
      System.out.println();
    }
    
    public static void removeByName(ArrayList<String> list, String name) {
      
      if(list.contains(name) == true)
      {
        int index = list.indexOf(name);
        list.remove(index);
      }
    }
    
    public static void main(String[] args) {
      
      ArrayList<String> list = new ArrayList();
      
      list.add("Anton");
      list.add("Kate");
      print(list);
      
      list.add("Viktor");
      print(list);
      
      list.add(0, "Maksim");
      print(list);
      
      list.add(1, "Anastasia");
      print(list);
      
      list.set(2, "Eugene");
      print(list);
      
      list.remove(3);
      print(list);
      
      removeByName(list, "Viktor");
      print(list);
      
      removeByName(list, "Roman");
      print(list);
      
      /*
      System.out.println(list.contains("Anastasia"));
      System.out.println(list.contains("Anton"));
      System.out.println(list.indexOf("Anastasia"));
      System.out.println(list.indexOf("Anton"));
      */
  }
}

//
https://codeboard.io/projects/340483