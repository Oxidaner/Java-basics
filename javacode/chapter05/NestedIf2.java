import java.util.Scanner;
public class NestedIf2{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·�");
		int month = myScanner.nextInt();
		if(1 < month && month < 12){  //java�﷨�涨������a<x<b�����﷨  Ҫд��a<x && x<b�����﷨
			if(4 < month && month < 11){
				System.out.println("��������");
				System.out.println("����������");
				int age = myScanner.nextInt();
				if(age < 18){
					System.out.println("��ͯ���30Ԫ");
				}else if(age>=18&&age<=60){
					System.out.println("����60Ԫ");
				}else{
					System.out.println("����Ʊ��20Ԫ");
				}
			} else {
				System.out.println("���ڵ���");
				System.out.println("����������");
				int age = myScanner.nextInt();
				if(age>=18&&age<=60){
					System.out.println("����40Ԫ");
				}else{
					System.out.println("Ʊ��20Ԫ");
				}
			}
		}else{
			System.out.println("�·��������");
		}
	}
}