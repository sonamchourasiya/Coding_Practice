

public class SecondHighest {
    public static int findSecondHighest(int[] array) {
        int highest=Integer.MIN_VALUE;
        int SecondHighest=Integer.MIN_VALUE;
        for(int i:array)
        if(i>highest){
            SecondHighest=highest;
            highest=i;
        }
        else if(i>SecondHighest){
            SecondHighest=i;
        }
        return SecondHighest;

    }
      public static void main(String[] args) {
          
    int array[]={2,3,4,5,6,7};
    int result= findSecondHighest(array);
    System.out.println("the second highest number is:"+result);

}
}