package playingCard;

public class RandomCard {
	/**
	 * ��ȡ�˿��Ƶ����ֺͻ�ɫ
	 * @return
	 */
	public static int random01() {
		int a=(int)(Math.random()*20-6);
		return a;
	}
	public static  int number() {
		int a=random01();
		while(a<=0) {
			a=random01();
		}
		return a;
	}
	public static int random02() {
		int m=(int)(Math.random()*10-5);
		return m;
	}
	public static String SuitOfCard() {
		String Suitofcard;
		int m= random02();
		while(m<=0) {
			m=random02();
		}
		if(m==1) {
			Suitofcard="����";
		}else if(m==2){
			Suitofcard="÷��";
		}else if(m==3) {
			Suitofcard="����";
		}else {
			Suitofcard="����";
		}
		return Suitofcard;
	}
}
