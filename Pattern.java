import java.util.Scanner;
public class Pattern{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        int k=1;
        for( int i=1;i<=n;i++){
            k=1;
            for(int j=1;j<=n;j++)
            {
                if(j%2==1)
                {
                 System.out.print(k );
                 System.out.print(" ");
                 k++;
                }
                else{
                    System.out.print(i );
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
}