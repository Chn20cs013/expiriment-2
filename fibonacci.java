import java.util.*;
class Main {
  public static void main(String[] args) {

    int n = , firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");
  Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
