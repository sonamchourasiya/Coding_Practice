
public class SmallNumber {
     public static void main(String[] args) {
        int arr[] ={3,4,8,9,12};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                arr[i]=smallest;
            }
        }
        System.out.println(smallest);

    }

}