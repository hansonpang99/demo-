package playingCard;

public class Sorting {
	/**
	 *�������˿��ƽ������ִ�С���򣨳�1��������֣�
	 */
	//�����
	public static int MaxNumber(int c1,int c2,int c3) {
		int c4=0;
		if(c4<=c1) {
			c4=c1;
		}
		if(c4<=c2) {
			c4=c2;
		}
		if(c4<=c3) {
			c4=c3;
		}
		return c4;
	}
	//��С��
	public static int MinNumber(int c1,int c2,int c3) {
		int c4=14;
		if(c4>=c1) {
			c4=c1;
		}
		if(c4>=c2) {
			c4=c2;
		}
		if(c4>=c3) {
			c4=c3;
		}
		return c4;
	}
	//�м���
	public static int MidNumber(int c1,int c2,int c3) {
		int c4=0;
		if(c1<=c2 || c1<=c3) {
			if(c1>=c3 || c1>=c2) {
				c4=c1;
			}
		}
		if(c2<=c3 || c2<=c1) {
			if(c2>=c1 || c2>=c3) {
				c4=c2;
			}
		}
		if(c3<=c2 || c3<=c1) {
			if(c3>=c1 || c3>=c2) {
				c4=c3;
			}
		}
		return c4;
	}

}
