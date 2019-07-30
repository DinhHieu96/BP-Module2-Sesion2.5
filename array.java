import java.util.Random;
import java.util.Scanner;

public class array {
    public Integer[] createRandom(){
        Random rd=new Random();
        Integer[] arr=new Integer[100];
        System.out.println("Danh sách phần tử của mảng");
        for (int i=0;i<100;i++){
            arr[i]=rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        array arrExample=new array();
        Integer[] arr=arrExample.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nVui long nhập chỉ sô của một phần tử bất kỳ:");
        int x=scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi số 5 la: "+x+" là "+arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
