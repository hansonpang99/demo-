package playingCard;

import java.util.Scanner;

public class CardGame {
	public static void main(String[] args) {
		System.out.print("���������������");
		Scanner sc = new Scanner(System.in);
		int times=sc.nextInt();
		int Awin=0;
		int Bwin=0;
		int dogfall=0;
		for(int i=1;i<=times;i++) {
			System.out.println("��"+i+"�α�����");
			String winner=Winner.Winner();
			System.out.println(winner);
			if(winner=="A��һ�ʤ") {
				Awin++;
			}else if(winner=="B��һ�ʤ") {
				Bwin++;
			}else if(winner=="ƽ��") {
				dogfall++;
			}
			if(winner==null) {
				break;
			}
			
		}
		System.out.println();
		System.out.println("###########�ָ���###########�ָ���##########�ָ���##############");
		System.out.println();
		System.out.println("A��һ�ʤ����Ϊ��"+Awin+"��");
		System.out.println("B��һ�ʤ����Ϊ��"+Bwin+"��");
		System.out.println("ƽ�ִ���Ϊ��"+dogfall+"��");
		
	}

}
