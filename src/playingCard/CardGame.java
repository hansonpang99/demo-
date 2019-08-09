package playingCard;

import java.util.Scanner;

public class CardGame {
	public static void main(String[] args) {
		System.out.print("请输入比赛次数：");
		Scanner sc = new Scanner(System.in);
		int times=sc.nextInt();
		int Awin=0;
		int Bwin=0;
		int dogfall=0;
		for(int i=1;i<=times;i++) {
			System.out.println("第"+i+"次比赛！");
			String winner=Winner.Winner();
			System.out.println(winner);
			if(winner=="A玩家获胜") {
				Awin++;
			}else if(winner=="B玩家获胜") {
				Bwin++;
			}else if(winner=="平局") {
				dogfall++;
			}
			if(winner==null) {
				break;
			}
			
		}
		System.out.println();
		System.out.println("###########分割线###########分割线##########分割线##############");
		System.out.println();
		System.out.println("A玩家获胜次数为："+Awin+"次");
		System.out.println("B玩家获胜次数为："+Bwin+"次");
		System.out.println("平局次数为："+dogfall+"次");
		
	}

}
