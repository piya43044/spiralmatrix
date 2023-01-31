import java.util.Scanner;
public class Main
{
    public static int[][] CreateSpiralMatrix(int n)
    {
        int array[][] = new int[n][n];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        //Taking Input from the user
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

        return array;

    }

    public static void PrintMatrix(int[][] array)
    {
        int i,j,n=array.length;
        System.out.println("Elements of the array are: ");
        //Show the matrix
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        System.out.print("Enter the number = ");
        int n=sc.nextInt();
        int i,j;
        int[][] array=new int[n][n];
        array=CreateSpiralMatrix(n);
        PrintMatrix(array);
    }
}
