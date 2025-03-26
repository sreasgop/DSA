#include<stdio.h>
int main(){
    
    // Data type int takes 4 bytes in typical compilers. 
    // 1 byte = 8 bits
    // 8 x 4 = 32 bits is taken by an integer.

    // NOTE:
    // An array is a fixed sized collection of elements of same data type stored in contiguous memory.
    // While declaring an array we have to mention a constant as the size of the array. 
    // int arr[5];      // Here, 5 is a constant hence it's a valid declaration. 
    // int n, arr[n]    // This is an invalid declaation. 
    // If we want to use a variable to specify the size of an array while declaring it, we can set macros and use them. 

    // NOTE: 
    // Dimensions of array: An array in C can be of the following dimensions
    // 1D array (One Dimensional Array): An array with 1 Row

    // Initializing an array at compile time
    int a[5] = {1, 2, 3, 4, 5};
    char b[5] = {'s', 'r', 'e', 'a', 's'};

    // We can see that the name of an array is actually a pointer to the first element of the array. 
    // a is actually &a[0]
    printf("%p\n",a);
    printf("%p\n",&a[0]);


    // Compile time initialization of array 
    int arr[5]; 
    for(int i=0; i<4; i++){
        scanf("%d", &arr[i]);
    }

    for(int i=0; i<4; i++){
        printf("%d", arr[i]);
    }

    return 0;
}



