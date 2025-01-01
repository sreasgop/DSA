#include<iostream>
#define MAX_LIMIT 10
using namespace std; 

int main(){
    
    int n;

    cout << "Enter the value of n: "; 
    cin >> n; 

    int arr[n];

    cout << "Enter " << n << " integers: "; 
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    
    //Sorting the Array using Bubble Sort: 
    for(int i=0; i<n; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j]; 
                arr[j] = arr[j+1]; 
                arr[j+1] = temp; 
            }
        }
    }

    cout << "Sorted Array: ";
    for(int i=0; i<n; i++){
        cout << arr[i] << " ";
    }
    cout << "\n";


    return 0;
}
