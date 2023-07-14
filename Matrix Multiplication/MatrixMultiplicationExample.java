import java.util.Scanner;

public class MatrixMultiplicationExample {

  public static void main(String args[]) {
    int i1, j1, i2, j2;
    Scanner s = new Scanner(System.in);

    
    System.out.print("Enter number of rows in first matrix: ");
    i1 = s.nextInt();

    System.out.print("Enter number of columns in first matrix: ");
    j1 = s.nextInt();

   
    System.out.print("Enter number of rows in second matrix: ");
    i2 = s.nextInt();

    System.out.print("Enter number of columns in second matrix: ");
    j2 = s.nextInt();

    
    if (j1 != i2) {
      System.out.println("Matrix multiplication is not possible");
      return;
    }

    int a[][] = new int[i1][j1];
    int b[][] = new int[i2][j2];
    int c[][] = new int[i1][j2];

    
    System.out.println("\nEnter values for matrix A : ");
    for (int i = 0; i < i1; i++) {
      for (int j = 0; j < j1; j++) a[i][j] = s.nextInt();
    }
    System.out.println("\nEnter values for matrix B : ");
    for (int i = 0; i < i2; i++) {
      for (int j = 0; j < j2; j++) b[i][j] = s.nextInt();
    }

    
    System.out.println("\nMatrix multiplication is : ");
    for (int i = 0; i < i1; i++) {
      for (int j = 0; j < j2; j++) {
      
        c[i][j] = 0;

        
        for (int k = 0; k < j1; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
        
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}
