package jjiujiu;

import java.util.Scanner;
import java.util.*;
public class rili_1 {
	public static void main(String[] args){
		String answer="yes";
		do{
		Scanner in=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int nian=in.nextInt();
		if(nian<1900){
			  System.out.println("������������");
		  }
		  else{
		System.out.println("�������·ݣ�");
	    int yue=in.nextInt();
	    if(yue>12||yue<0){
	    	System.out.println("����������");
	    }else{
		int sum=0;
		int shu=0;
		for(int year=1900;year<nian;year++){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=366;
				}
			else{
				sum+=365;
			}
		}
		for(int month=1;month<yue;month++){
			if(month==2){
				if(nian%4==0&&nian%100!=0||nian%400==0){
					sum+=29;
				}else{sum+=28;}
			}else if(month==4||month==6||month==9||month==11){
				sum+=30;
			}
			else{sum+=31;}
		}
		sum=sum+1;
		int day=sum%7;
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=day;i++){
			System.out.print("\t");
		}
		if(yue==2){
			if(nian%4==0&&nian%100!=0||nian%400==0){
				shu=29;
			}else{shu=28;}
			}
		else if(yue==4||yue==6||yue==9||yue==11){
			shu=30;
		}
		else{shu=31;}
		for(int i=1;i<=shu;i++){
			if(sum%7==6){
				System.out.print(i+"\n");
			}
			else{System.out.print(i+"\t");}
			sum++;
		}
		
		System.out.println("\n�����Ƿ������ѯ������");
		 answer=in.next();
	    }
		  } }while(answer.equals("yes"));
	}
}
