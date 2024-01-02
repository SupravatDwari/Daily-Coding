class Solution {
    public void sortColors(int[] arr) {

    int low = 0, high = arr.length - 1;      

    int i = 0;                                
    while (i <= high) {                             
        if (arr[i] == 0) {                    
            swap(arr, i, low);                
            low += 1;                        
            i += 1;
        }
        else if (arr[i] == 2) {                //as we know we have to put all the 2's at the end of an array
            swap(arr, i, high);                //So, if array of i is 2 then swap it with the high index element
            high -= 1;                         //and decrease index of high by 1
        }
        else {
            i += 1;                             //if array of i is not equal to zero or 2 then just simply increase i by 1
        }
    }
}

private void swap(int[] arr, int i, int j) {    
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
}
