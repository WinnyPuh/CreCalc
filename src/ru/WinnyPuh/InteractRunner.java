import java.util.Scanner;

public class InteractRunner{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    try{
      Calc calc = new Calc();
      String exit = "no";
      while(!exit.equals("yes")){
        System.out.print("Enter first arg: ");
        int first = Integer.valueOf(reader.next());
        //System.out.println();
        System.out.print("Enter second arg: ");
        int second = Integer.valueOf(reader.next());
        //System.out.println();
        calc.add(first, second);
        System.out.println("Result: " + calc.getResult());
        System.out.println("Exit: yes/no");
        exit = reader.next();
      }
      System.out.println(calc.getResult());
    }finally{
        reader.close();
    }
  }
}
