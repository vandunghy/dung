/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanford_laptrinhdesktop_je112;

import java.util.Scanner;

/**
 *
 * @author macbookm1
 */
public class Stanford_CauTrucLapTrinhJava_p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  vi di 1 nhap vao 1 thang sao do in ra
         //Khai bao bien
           int thang = 0;
        String strThangHienTai = "";
        System.out.print("Nhập thông tin tháng = ");
        thang = sc.nextInt();
        //Kiểm tra tháng
        switch(thang)
        {
            case 1: 
                strThangHienTai = "Tháng một";
                break;
            case 2: 
                strThangHienTai = "Tháng hai";
                break;    
            case 3: 
                strThangHienTai = "Tháng ba";
                break;  
            case 4:
                strThangHienTai = "Tháng tư";
                break;
            case 5:
                strThangHienTai = "Tháng năm";
                break;
            case 6:
                strThangHienTai = "Tháng sáu";
                break;
            case 7:
                strThangHienTai = "Tháng bẩy";
                break;
            case 8:
                strThangHienTai = "Tháng tám";
                break;
            case 9:
                strThangHienTai = "Tháng chín";
                break;
            case 10:
                strThangHienTai = "Tháng mười";
                break;
            case 11:
                strThangHienTai = "Tháng mười một";
                break;
            case 12:
                strThangHienTai = "Tháng mười hai";
                break;
            default:
                strThangHienTai = "Không có tháng này";
                break;
        }//end switch
        //Hiển thị kết quả
        System.out.println("Tháng hiện tại là: " + strThangHienTai);
        
        
        //ví du 2 : Nhập vào 2 số thực và phép tính(+,-,*,/)sau đo tịnh kêt quả theo pheo tinh tương ứng
        //Khai báo biến
                double soa = 0, sob = 0,ketQua = 0;
                
               String phepToan = ""; 
                System.out.print("Nhap so a = ");
                soa  = sc.nextDouble();
                System.out.print("Nhap so b = ");
                sob  = sc.nextDouble();
                
                //di chuyển dòng mới
                sc.nextLine();
                
                System.out.print("Nhap phep toan = ");
                phepToan  = sc.nextLine();
                
                switch(phepToan) 
           {
                    case"+": ketQua = soa + sob;
                    break;
                    case"-": ketQua = soa - sob;
                    break;
                    case"*": ketQua = soa * sob;
                    break;
                    case"/":
                        if(sob != 0) 
                        {
                            ketQua = soa/sob;
                        }
                        else 
                        {
                          System.out.print("Ban can nhap so b khac 0 ");  
                        }
                    break;
                    default:
                        System.out.print("ban can nhap phep toan : + , -, *, /  de thuc hien");
                        break;
                        // hien thi ket qua    
      }
                System.out.printf("ket qua %.1f %s %.1f la: %.1f\n", soa, phepToan, sob, ketQua);
    }
    
    
    
    
    
}
