import java.util.Scanner;
public class test{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个1-100的数");
		int grate = myScanner.nextInt();
		if(1 <= grate && grate <= 100){
			if(grate == 100){
				System.out.println("信用极好");
			} else if (80<grate && grate<=99){
				System.out.println("信用优秀");			
			} else if (60<grate && grate<=80){
				System.out.println("信用一般");			
			} else {
				System.out.println("信用不合格");		
			}
		} else {
			System.out.println("信用分需要在1-100,请重新输入");		
		}
	}
}