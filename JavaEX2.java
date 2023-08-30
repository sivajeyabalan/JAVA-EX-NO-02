/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaex2;

import java.util.Scanner;

/**
 *
 * @author 22cseb57
 */
public class JavaEX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        owner o[]=new owner[5];
        car c[]=new car[5];
        String name,city,profes;
        int regnum,noseats,model;
        String colour,brand;
        o[0]= new owner("Jai","Madurai","Docter");
        o[1]= new owner("Ram","Madurai","Police");
        o[2]= new owner("Siva","Madurai","CEO");
        o[3]= new owner("Vishwa","Madurai","Doctor");
        o[4]= new owner("Nitheesh","Madurai","Engineer");
        c[0]=new car(7856,"Red",4,"Inova",101,o[0]);
        c[1]=new car(7642,"Brown",4,"Tata",212,o[1]);
        c[2]=new car(7777,"White",6,"Rolls Royers",123,o[2]);
        c[3]=new car(7839,"Red",6,"MG Hector",174,o[3]);
        c[4]=new car(7295,"Blue",4,"Inova",155,o[4]);
        for(int i=0;i<o.length;i++)
        {
            System.out.println(c[i]);
        }
    }
    
}
class car
{
    int rnum;
    String colour;
    int noseats;
    String brand;
    int model;
    owner own;
    car(int r,String c,int n,String b,int m,owner o)
    {
        rnum=r;
        colour=c;
        noseats=n;
        brand=b;
        model=m;
        own=o;
    }
    int getregisternumber()
    {
        return rnum;
    }
    String getcolour()
    {
        return colour;
    }
    String  getbrand()
    {
        return brand;
    }
   int getmodel()
   {
       return model;
   }
    public String toString()
    {
        return "\nRegister number:"+rnum+"\nColour:"+colour+"\nNo of Seats:"+noseats+"\nBrand:"+brand+"\nModel:"+model+own;
    }
}
class owner
{
    String name;
    String city;
    String profes;
    owner(String n,String c,String p)
    {
        name=n;
        city=c;
        profes=p;
    }
    String getname()
    {
        return name;
    }
    String getcity()
    {
        return city;
    }
    String getprofession()
    {
        return profes;
    }
    public String toString()
    {
        return "\nOwner name:"+name+"\nCity:"+city+"\nProfession:"+profes;
    }
}