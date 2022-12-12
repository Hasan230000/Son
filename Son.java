/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package son;
import java.util.Scanner;
/**
 *
 * @author Costa
 */
public class Son {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri=new Scanner (System.in);
        int toplam=0;
        System.out.print("Girilecek veri sayısını giriniz:");
        int veri_sayisi=veri.nextInt();
        int [] sayilar=new int[veri_sayisi];
        for(int i=0;i<veri_sayisi;++i){
            System.out.print("\n"+(i+1)+". sayıyı giriniz:");
            sayilar[i]=veri.nextInt();
            toplam+=sayilar[i];
        }
        double ort=toplam/veri_sayisi;
        System.out.print("Ortalama:"+ort);
    }
    
}
