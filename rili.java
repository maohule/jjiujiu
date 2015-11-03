package jjiujiu;

public class rili {
	public static void main(String[] args){
		int sum=0;
		int days=0;
		for(int i=1900;i<=2015;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum=sum+366;
			}
			else{
				sum=sum+365;
			}
		}
			for(int month=1;month<=4;month++){
				if(month==4||month==6||month==9||month==11){
					sum=sum+30;
				}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
					sum=sum+31;
				}else{
					if(2016%4==0&&2016%100!=0||2016%400==0){
					sum=sum+29;}
					else{sum=sum+28;}
				}
			}
				sum=sum+7;
		System.out.println("1900年1月1日到2016年5月7日一共有"+sum+"天");
	}
}

