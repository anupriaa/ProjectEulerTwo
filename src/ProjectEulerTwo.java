/**
 * Created by Anupriya on 2/2/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args){
    int f=1, l=2,temp,sum=0;
//    long sum =2l;
    while(l<4000000){
      if(l%2==0)
        sum +=l;
      temp = l;
      l=l+f;
      f=temp;
    }
    System.out.print("Sum = "+sum);
  }
}
