import java.util.Scanner;

public class BÀi1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("*********MENU*********");
        System.out.println("1. In ra các số chẵn và tính tổng trong khoảng 0...n");
        System.out.println("2. In ra các số lẻ và tính tổng trong khoảng 0...n");
        System.out.println("3. Kiểm tra n có phải số nguyên tố không");
        System.out.println("3. Kiểm tra n có phải số nguyên tố không");
        System.out.println("5. In ra các số nguyên tố trong khoảng 0...n");
        System.out.println("6. In ra các ước số của n và tính tổng");
        System.out.println("7. Thoát");
        System.out.println("Sự lựa chọn của bạn là :");
        int choice = Integer.parseInt(sr.nextLine());
        switch (choice){
            case 1:
                System.out.println("Nhập vào số tự nhiên 0 đến n ");
                int n = Integer.parseInt(sr.nextLine());
                 int sum = 0;
                for (int i = 0; i <= n ; i ++) {
                    if (i%2 == 0){
                        System.out.println("số chẵn là "+ i );
                        sum += i ;
                    }
                }
                System.out.println("tổng số chẵn trong "+n+"là:"+sum);
                break;
            case 2:
                System.out.println("Nhập vào số tự nhiên từ 1 đến n ");
                int n1 = Integer.parseInt(sr.nextLine());
                int sum1 = 0 ;
                for ( int i=0; i <= n1 ; i ++){
                    if (i%2 != 0){
                        System.out.println("số lẻ là :"+ i );
                        sum1 += i ;
                    }
                }
                System.out.println("tổng số lẻ trong" +n1+ "là:"+sum1);
                break;
            case 3:
                System.out.println("Nhập vào số tự nhiên tư n ");
                int n2 = Integer.parseInt(sr.nextLine());
                if (n2<2){
                System.out.println(n2+"Đây không phải số nguyên tố ");
                 }else if(n2==2){
                    System.out.println(n2+"đây là số nguyên tố ");
                 }
                else if (n2 %2 ==0 ){
                    System.out.println(n2+"không phải số nguyên tố ");
                }
                else {
                    for (int i = 3; i< n2-1 ; i+=2){
                        if (n2 % 1 ==0 ){
                            System.out.println(n2+"đây không phải số nguyên tố ");
                            break;
                        }else {
                            System.out.println(n2+"đây là  số nguyên tố ");
                            break;
                        }
                    }
                }
            case 4:
                System.out.println("nhập số vào đi nhé ");
                int n3 = Integer.parseInt(sr.nextLine());
                int sum3 = 0;
                for (int i = 1; i <n3  ; i++) {
                    if (n3%i==0){
                        sum3 +=i;
                    }

                }
                if (sum3==n3){
                    System.out.printf("Số %d là số hoàn hảo\n",n3);
                }else {
                    System.out.printf("số %d không phải là sô hoan hảo\n ",n3);
                }
                break;

            case 5:
                System.out.println("nhập số vào đi nhé ");
                int n4 = Integer.parseInt(sr.nextLine());
                boolean check ;
                if (n4>=2){
                    System.out.printf("Cac so nguyen to tu 0 den %d la: \n",n4);
                    for (int i = 2; i <=n4 ; i++) {
                        //Kiem tra i co phai la so nguyen to hay khong?
                        check = false;
                        for (int j = 2; j <=Math.sqrt(i) ; j++) {
                            if(i%j==0){
                                //j la uoc cua i
                                check = true;
                                break;
                            }
                        }
                        if(!check){
                            //i la so nguyen to
                            System.out.printf("%d\t",i);
                        }
                    }
                    System.out.printf("\n");
                }
                break;
            case 6:
                System.out.println("nhập số vào đi nhé ");
                int n5  = Integer.parseInt(sr.nextLine());
                int sum5 = 0 ;
                System.out.printf("các ước số của %d là :\n",n5);
                for(int i = 1; i <= n5 ; i++){
                    if(n5%i==0){
                        System.out.printf("%d\t",i);
                        sum5+=i;
                    }
                }

            case 7:
                System.exit(0);
            default:
                System.err.println("Vui lòng nhập từ 1-7");

        }
    }
}
