#include <stdio.h>
int main() {
    int a;
    printf("a=");  //6
    scanf("%d",&a);
    int i,j,k,temp,z=a-1;
    k=a*(a+1)/2;
    for(i=1;i<a+1;i++){
        if(i%2==1){
            for(j=1;j<=i;j++){
                if(k>=10){
                     printf("%d ",k);
                }
                else{
                    printf("0%d ",k);
                }
            
            k--;
            }
             printf("\n");
        }
        else{
            temp=k-(i-1);
             for(j=a;j>=z;j--){
                 if(temp>=10){
                     printf("%d ",temp);
                 }
                 else{
                      printf("0%d ",temp);
                 }
            temp++;
            k--;
        }
        if(z>0){
         z=z-2;
        }
        
             printf("\n");
        }
    }
}