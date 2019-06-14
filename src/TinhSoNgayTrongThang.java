import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap So thang");
        int month = scanner.nextInt();
        String day="";
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = " 31 ngay";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                day = " 30 ngay";
                break;

            case 2:
                day = " 28-29 ngay";
                break;
        }
        if (day!="")
        {
            System.out.print("Thang "+month+""+day);
        }
        else
            {
                System.out.print("Khong co thang");
            }

    }
}
