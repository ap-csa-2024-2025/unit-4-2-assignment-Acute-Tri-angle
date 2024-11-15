import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 2 numbers");
    int x = sc.nextInt();
    int y = sc.nextInt();
    for (int i = x; i <= y; i++){
      if (i % 2 == 1){
        System.out.print(i + " ");
      }
    }

    System.out.println("");

    System.out.println("enter a positive int");
    x = sc.nextInt();
    int xFactor = 10;
    int currInt;
    while (x / (xFactor/10) != 0){
      currInt = x % xFactor;
      System.out.println(currInt);
      x -= currInt;
      xFactor *= 10;
    }

    sc.close();
  }
}
