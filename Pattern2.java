import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a= sc.nextInt();
        int i,j,k,temp,z=a-1;
    k=a*(a+1)/2;
    for(i=1;i<a+1;i++){
        if(i%2==1){
            for(j=1;j<=i;j++){
                if(k>=10){
                    System.out.print(k);
                    System.out.print(" ");
                }
                else{
                    System.out.print("0");
                    System.out.print(k);
                    System.out.print(" ");
                }

            k--;
            }
            System.out.println();
        }
        else{
            temp=k-(i-1);
             for(j=a;j>=z;j--){
                 if(temp>=10){
                    System.out.print(temp);
                    System.out.print(" ");
                 }
                 else{
                    System.out.print("0");
                    System.out.print(temp);
                    System.out.print(" ");
                 }
            temp++;
            k--;
        }
        if(z>0){
         z=z-2;
        }
        System.out.println();  
        }
    }
}
    }