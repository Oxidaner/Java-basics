import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������");
		double score = myScanner.nextDouble();
		if(score<=100 && score >=1){
			switch((int)(score/60)){
				case 1:
					System.out.println("�ϸ�");
					break;
				case 0:
					System.out.println("���ϸ�");
					break;
			}
		}else{
			System.out.println("����ɼ�����");
		}
	}
}