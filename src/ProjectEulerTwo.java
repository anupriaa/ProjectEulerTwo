/**
 * Created by Anupriya on 2/2/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args){
    int f=1, s=2;
    long sum =2l;
    for(int i=3;i<4000000;i++){
      s =s+i;
      //System.out.print(s+"\t");
      if(s%2==0)
        sum += s;
    }
    System.out.print("Sum = "+sum);
  }
}
