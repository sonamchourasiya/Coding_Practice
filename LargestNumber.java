
public class LargestNumber {

    public static void main(String[] args) {
        int arr[]={4,5,8,9,12,23};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i]; 
            }
        }
        System.out.println(max);
        
    }

}