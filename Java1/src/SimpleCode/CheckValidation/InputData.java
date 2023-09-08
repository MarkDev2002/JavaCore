package SimpleCode.CheckValidation;

import java.util.Scanner;

public class InputData {
    private String hoTen, email, phoneNumber, ID;

    public InputData(String hoTen, String email, String phoneNumber, String ID) {
        this.hoTen = hoTen;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }

    public InputData() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập họ và tên : ");
            hoTen = String.valueOf(sc.nextLine());
            hoTen.trim();
            if (hoTen == null || hoTen.equals("")) {
                System.out.println("Họ và tên không hợp lệ");
            } else {
                break;
            }
        } while (true);

        CheckDataValidation check = new CheckDataValidation();

        do {
            System.out.print("Nhập email : ");
            email = String.valueOf(sc.nextLine());
            if (check.isEmail(email)) {
                break;
            }
            System.out.println("Email không hợp lệ");

        } while (true);

        do {
            System.out.print("Nhập số điện thoại : ");
            phoneNumber = String.valueOf(sc.nextLine());
            if (check.isPhoneNumber(phoneNumber)) {
                break;
            }
            System.out.println("Số điện thoại không hợp lệ");

        } while (true);

        do {
            System.out.print("Nhập cmnd : ");
            ID = String.valueOf(sc.nextLine());
            if (check.isCMND(ID)) {
                break;
            }
            System.out.println("CMND không hợp lệ");

        } while (true);
    }

    public void Output() {
        System.out.printf("Họ và tên : %s - Email: %s - SĐT : %s - CMND : %s \n", hoTen, email, phoneNumber, ID);
    }
}
