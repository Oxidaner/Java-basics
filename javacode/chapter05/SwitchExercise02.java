import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入分数");
		double score = myScanner.nextDouble();
		if(score<=100 && score >=1){
			switch((int)(score/60)){
				case 1:
					System.out.println("合格");
					break;
				case 0:
					System.out.println("不合格");
					break;
			}
		}else{
			System.out.println("输入成绩错误");
		}
	}
}