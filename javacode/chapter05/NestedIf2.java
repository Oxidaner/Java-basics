import java.util.Scanner;
public class NestedIf2{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		if(1 < month && month < 12){  //java语法规定不能用a<x<b这种语法  要写成a<x && x<b这种语法
			if(4 < month && month < 11){
				System.out.println("处在旺季");
				System.out.println("请输入年龄");
				int age = myScanner.nextInt();
				if(age < 18){
					System.out.println("儿童半价30元");
				}else if(age>=18&&age<=60){
					System.out.println("成人60元");
				}else{
					System.out.println("老人票价20元");
				}
			} else {
				System.out.println("处在淡季");
				System.out.println("请输入年龄");
				int age = myScanner.nextInt();
				if(age>=18&&age<=60){
					System.out.println("成人40元");
				}else{
					System.out.println("票价20元");
				}
			}
		}else{
			System.out.println("月份输入错误");
		}
	}
}