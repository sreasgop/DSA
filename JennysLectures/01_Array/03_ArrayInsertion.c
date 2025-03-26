// Inserting an element at a specific position in the aray.
#include<stdio.h>
int main(){
    
    int arr[50], size;

    printf("Enter the size of the array: "); 
    scanf("%d", &size); 

    printf("Enter the elements: "); 
    for(int i=0; i<size; i++){
        scanf("%d", &arr[i]);
    }

    printf("Array: ");
    for(int i=0; i<size; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
    


    return 0;
}
