/**
 * @Auther: zhangshibin
 * @Date: 2021/9/1 - 09 - 01 - 23:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
import java.util.Scanner;
public class ArrayReduce {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        do {
            int[] arrNew = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            System.out.println("====�������������====");
            for(int i = 0; i < arrNew.length; i++) {
                System.out.print(arrNew[i] + "\t");
            }
            //���û��Ƿ����
            System.out.println("�Ƿ��������? y/n");
            char key = myScanner.next().charAt(0);
            if( key == 'n') { //�������n ,�ͽ���
                break;
            }
        }while (true);
    }
}
