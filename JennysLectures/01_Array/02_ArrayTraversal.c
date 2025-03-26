#include<stdio.h>
int main(){
    
    // We cannot change the size of an array at run time. 
    
    int a[50], size; 
    
    // Traversal
    printf("Enter size of array: "); 
    scanf("%d", &size); 
    
    printf("Enter elements of array: ");
    for(int i=0; i<size; i++){
        scanf("%d", &a[i]);
    }

    printf("Array: "); 
    for(int i=0; i<size; i++){
         printf("%d ", a[i]);
    }
    printf("\n");



    return 0;
}
