import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // in ra menu cho nhân vin oder đồ ăn
        // ******MeNu**********
        // 1 pho bò kobe
        // 2. pho ga
        //3. xôi
        //4.banh my
        //5. my tôm
        // 6. thoát
        Scanner sr = new Scanner(System.in);
        do {
            System.out.println("***********MENU***************");
            System.out.println("1. pho bo");
            System.out.println("2 . pho ga ");
            System.out.println("3 . xôi ");
            System.out.println("4 thoát ");
            System.out.println("sự lựa chọn cua bạn là :");
            int choice = Integer.parseInt(sr.nextLine());
            switch (choice){
                case 1 :
                    System.out.println("cảm ơn bạn đã chọn phở bò ...");
                    break;
                case 2 :
                    System.out.println(" cảm ơn bạn đã chọn pho gà    ");
                case 3 :
            }
        }while (true);

    }
}