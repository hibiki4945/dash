package com.example.dash.server.impl;

import com.example.dash.server.ifs.Part1Service;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Part1ServiceImpl implements Part1Service{

    @Override
    public void Part1_1() {
        // TODO Auto-generated method stub
//      super();
      System.out.println("123");
      System.out.println("123");
        
    }

    @Override
    public void Part1_2() {
        // TODO Auto-generated method stub
        
        for(int i = 65; i <= 70; i++) {
            char ch = (char)i;
            System.out.println("變數ch: " + ch);
        }
        
    }

    @Override
    public void Part1_3() {
        // TODO Auto-generated method stub
        
        float PI = 3.14159f;
        
        System.out.println(10*PI*2);
        System.out.println(10*10*PI);
        System.out.println(20*PI*2);
        System.out.println(20*20*PI);
        
    }
    
    @Override
    public void Part1_4() {
        // TODO Auto-generated method stub
        
        System.out.printf("%d\n", 0b11110010);
        System.out.printf("%d\n", 07654);
        System.out.printf("%d\n", 0xaaabbb);
        
    }
    
    @Override
    public void Part1_5() {
        // TODO Auto-generated method stub
        
        System.out.printf("%d\n", 6*8-7*6>>2);//11 -> 101100 : 4+8+32=44
        System.out.printf("%d\n", 6>>5*8-10*4+1);//29 -> 11101 -> 11 : 3
        System.out.printf("%d\n", 5+6<<2);
        System.out.printf("%d\n", 7*3+8>>3);
        
    }
    
    @Override
    public void Part1_6() {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("請輸入數字: ");
        int num = scan.nextInt();
//        int 
        
//        System.out.printf("%d\n", num);
        
        System.out.printf("%d\n", (int)Math.pow(num, 2));
        System.out.printf("%d\n", (int)Math.pow(num, 3));
        
        System.out.printf("%.1f\n", Math.pow(num, 2));
        System.out.printf("%.1f\n", Math.pow(num, 3));
        
    }
    
    @Override
    public void Part1_7() {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("請輸入數字: ");
        int num = scan.nextInt();
        float f = ((float)num - 32) * 5 / 9;

//        System.out.printf("%d\n", num);
//        System.out.printf("%f\n", (float)num);
        System.out.printf("%.2f\n", f);
        
    }
    
    @Override
    public void Part1_8() {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入起始值: ");
        int startNum = scan.nextInt();
        System.out.println("請輸入終點值: ");
        int endNum = scan.nextInt();
        System.out.println("請輸入差值: ");
        int gapNum = scan.nextInt();
        
//        System.out.println(startNum);
//        System.out.println(endNum);
//        System.out.println(gapNum);
        int sum = 0;
        
        for(int i = startNum; i <= endNum; i+=gapNum) {
            sum += i;
        };
        System.out.println(sum);
        
    }
    
    @Override
    public void Part1_9() {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入整數: ");
        int num = scan.nextInt();
        
        if(num == 0) {
            System.out.println("0");
        }
        else if(num % 2 == 0) {
            System.out.println("偶數");
        }
        else if(num % 2 != 0) {
            System.out.println("奇數");
        }
        else {
            System.out.println("?");
        }
        
    }
    
    @Override
    public void Part1_10() {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入3個整數: ");
        int num[] = new int[3];
        int num1[] = new int[3];
        
        for(int i = 0; i<num.length; i++) {
            num[i] = scan.nextInt();   
        }
        
//        for(int i = 0; i<num.length; i++) {
//            System.out.println(num[i]);
//        }

        int temp = 0;
        
        for(int i = 0; i < num.length-1; i++) {
            for(int j = 0; j < num.length-1; j++) {
                if(num[j] < num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        
        for(int i = 0; i<num.length; i++) {
            System.out.print(num[i]);
            System.out.print(" ");
        }
        
    }
    
    @Override
    public void Part1_11() {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入座標: ");
        int num[] = new int[2];
        
        for(int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        
        double cSide = Math.pow(num[0], 2) + Math.pow(num[0], 2); 
        double cSideDone = Math.sqrt(cSide);
        
//        System.out.println(cSideDone);
        
        if(cSideDone > 20) {
            System.out.println("outside");
        }
        else {
            System.out.println("inside");
        }
        
    }
    
    public double eCount(int max) {
        
        double num = 1;
        
        for(int i = 1; i <= max; i++) {
            num *= i;
        }
        
        return num;
        
    }
    
    @Override
    public void Part1_12() {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            for(int j = 9; j > i; j--) {
//                System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }
        
        boolean flag = false;
        
        for(int i = 2; i < 20; i++) {
            for(int j = 2; j < 20; j++) {
                if((i > j) && (i != 2) && (i % j == 0)) {
//                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                System.out.println(i+"!");   
            }
            else {
                flag = false;
            }
        }
        
        double eNum = 0;
        
        for(int i = 0; i < 100; i++) {
            
            eNum += 1 / eCount(i);
            
            if((i != 0) && (i%10 == 0)) {
                System.out.printf("%.14f\n", eNum);
            }
        }
        
    }

}



