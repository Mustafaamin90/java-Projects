package myutils;

import java.util.Random;
import java.util.Scanner;


public class MyUtils {

    
    public static void main(String[] args) {}
    
    
    public static float ucgenCevre(float a,float b, float c)
    {
        float cevre = a + b + c;
        return cevre;
    }
    public static float ucgenAlan(float a,float b, float c)
    {     
        float u = (a+b+c)/2;
        float alan=(float) Math.sqrt(u*((u-a)*(u-b)*(u-c)));
        return alan;
    }
    
    public static float cokgenCevre(float a, float b, float c, float d, float e)
    {
        float cevre = a + b + c + d + e;
        return cevre;
    }
    public static float cokgenCevre(float a, float b, float c, float d, float e, float f)
    {
        float cevre = a + b + c + d + e + f;
        return cevre;
    }
    public static float cokgenCevre(float a, float b, float c, float d, float e, float f, float g)
    {
        float cevre = a + b + c + d + e + f + g;
        return cevre;
    }
    public static float cokgenCevre(float a, float b, float c, float d, float e, float f, float g, float h)
    {
        float cevre = a + b + c + d + e + f + g + h;
        return cevre;
    }
    
    
    public static float cokgenAlan(float KenarSayisi, float KenarUzunlugu)
    {
        float alan = (float)(KenarSayisi * (KenarUzunlugu * KenarUzunlugu)* Math.sin(360/KenarUzunlugu)/2);
        return alan;
    }
    
    
    public static double [] hesapla(double [] dizi)
    {
        Random uretici=new Random();
        double [] sonuc = new double[dizi.length];
        int sayac1 = 0, sayac2 = 1;
        
        for(int i = 0; i<dizi.length; i++)
        {
            sonuc[i] = uretici.nextInt((100-100)+1)-100;  
        }
        
        for (int i=0; i<dizi.length; i++)
        {
            double x1 = dizi[i];
            dizi[i] = 3*(x1*x1) - 2 * Math.exp(x1) + Math.sqrt(x1);
            sayac1 = sayac1 + 2;
            
            double x2 = dizi[i];
            dizi[i] = 1 / (1 + Math.exp(x2));
            sayac2 = sayac2 + 2;
        }
        
        return sonuc;
    }
    

    
    

     
}
