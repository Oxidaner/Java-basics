import java.util.Scanner;
public class test{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ��1-100����");
		int grate = myScanner.nextInt();
		if(1 <= grate && grate <= 100){
			if(grate == 100){
				System.out.println("���ü���");
			} else if (80<grate && grate<=99){
				System.out.println("��������");			
			} else if (60<grate && grate<=80){
				System.out.println("����һ��");			
			} else {
				System.out.println("���ò��ϸ�");		
			}
		} else {
			System.out.println("���÷���Ҫ��1-100,����������");		
		}
	}
}