#include<stdio.h>
void main(){
    int i,j,a=1,b;
    printf("Enter b:");
    scanf("%d",&b);
    for(i=1;i<=b;i++){
        int a=1;
        for(j=1;j<=b;j++){
           if(j%2==1){
            printf("%d ",a);
            a++;
           }
           else{
            printf("%d ",i);
           }
        }
         printf("\n");
    }
}