package playingCard;

public class RandomCard {
	/**
	 * 抽取扑克牌的数字和花色
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
			Suitofcard="方块";
		}else if(m==2){
			Suitofcard="梅花";
		}else if(m==3) {
			Suitofcard="红桃";
		}else {
			Suitofcard="黑桃";
		}
		return Suitofcard;
	}
}
