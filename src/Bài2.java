import java.sql.SQLOutput;
import java.util.Scanner;

public class Bài2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String masv = "";
        String tensv = "";
        int year = 0 ;
        boolean sex = true ;
        int sdt = 0 ;
        String emaildc = "";
        String diachi = "";
        do {
            System.out.println("************Menu***************");
            System.out.println("1.Nhập thông tin sinh viên ");
            System.out.println("2.Hiển thị thông tin sinh viên ");
            System.out.println("3.Tính tuổi sinh viên ");
            System.out.println("4.Toán ");
            System.out.println("Sự lựa chon của bạn là ");
            int choice = Integer.parseInt(sr.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập mã sinh viên:");
                    masv = sr.nextLine();
                    System.out.println("Nhập tên sinh viên:");
                    tensv = sr.nextLine();
                    System.out.println("Nhập năm sinh của sinh viên:");
                    year = Integer.parseInt(sr.nextLine());
                    System.out.println("Nhập vào gioi tính của sinh viên: ");
                    sex = Boolean.parseBoolean(sr.nextLine());
                    System.out.println("Nhập số phone của sinh viên:");
                    sdt = Integer.parseInt(sr.nextLine());
                    System.out.println("Nhập email của sinh vien ");
                    emaildc = sr.nextLine();
                    System.out.println("Nhập địa chỉ của sinh viên ");
                    diachi = sr.nextLine();
                    break;
                case 2:
                    System.out.println("*******************STUDENT INFORMATION******************");
                    System.out.printf("%15s%7s%15s%30s%7s%15d\n", "Student ID:", masv, "Student Name:", tensv, "năm sinh:", year);
                    System.out.printf("%15s%7b%15s%30s%7s%15s\n", "Gender:", sex, "Email:", emaildc, "Số điện thoại:", sdt);
                    System.out.printf("Address: %s", diachi);
                    break;
                case 3:
                    int age = 2022 - year;
                    System.out.printf("Tuổi của sinh viên là :", age);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("vui lòng nhật từ 1 đến 1");

            }
        } while (true);


    }
}
