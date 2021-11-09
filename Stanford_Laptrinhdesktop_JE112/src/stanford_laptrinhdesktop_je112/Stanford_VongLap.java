/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stanford_laptrinhdesktop_je112;

import java.util.Scanner;

/**
 *
 * @author macbookm1
 */
public class Stanford_VongLap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        //Khai baos bien
        int i = 1;
  
        while(i<=10)
        {
        System.out.println("");
        
            System.out.println("I Love You " + i);
            i++;//Tăng i lên 1 đơn vị mỗi lần chạy
        }
        System.out.println("Sử dụng vòng lặp do while: ");
        do
        {
            System.out.println("Giá trị của i = " + i);
            i++;
        }
        while(i < 20);
        
        
       /* 
        
        //Kiem tra nguooi dung can phai nhap dug so gom 4 chu so
        int so4ChuSo = 0;
        
        do 
        {
            System.out.print(" Nhap so gom 4 chu so = ");
            so4ChuSo = sc.nextInt();
            
        }
             while(so4ChuSo < 1000 || so4ChuSo > 9999);
        System.out.println("Số 4 chữ số là: " + so4ChuSo);
       
        // Bai tap 4
        int N = 0;
        double S1 = 0, S2 = 0;
        System.out.println("Nhap gia tri cua day N = ");
        N = sc.nextInt();
        
        //Duyet vong lap de tinh toan
        for(int i = 1; i <= N; i++)
            {
            S1 += i;//S1 = S1 + i
            S2 += i*i;
        }
        S1 = S1/N;
        S2 = Math.sqrt(S2);
        System.out.printf("Giá trị của S1 = %.2f\n", S1);
        System.out.printf("Giá trị của S2 = %.2f\n", S2);


        //Bai 5
        
        int tich = 0, tong = 0, chuc = 0, donVi = 0;
        System.out.println("cac chu so 2 chu so ma co tich bang 2 lan tong :");
        for(int i = 10; i <=99; i++)
        {
           chuc = i/10;
           donVi = i%10;
           tich = chuc*donVi;
           tong = chuc + donVi;
           if(tich == 2*tong)//True
            {
                System.out.println(i);
            }
           
        }
    }
}
        
        
        
            
                
            


        
        
       
    
    

