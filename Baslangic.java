package Giris;

import  java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);


    int mat,turkce,kimya,fizik,tarih,muzik ;


    System.out.println("matematik notunuzu giriniz");
    mat = input.nextInt();

    System.out.println("türkçe notunuzu giriniz" );
    turkce =input.nextInt();

    System.out.println("kimya notunuzu giriniz:");
    kimya =input.nextInt();

    System.out.println("fizik notunuzu giriniz");
    fizik =input.nextInt();

    System.out.println("tarih notunuzu giriniz:");
    tarih =input.nextInt();

    System.out.println("müzik notunuzu giriniz:");
    muzik =input.nextInt();

int toplam=(mat+turkce+kimya+fizik+tarih+muzik);

double ortalama =toplam/6;

System.out.println("Not ortalamanız :" + ortalama);

String durum =(ortalama>50)? "gecti" : "kaldi";

System.out.println("öğrenci durumu :" + durum);
}}