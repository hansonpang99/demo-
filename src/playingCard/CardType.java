package playingCard;

public class CardType {
	/**
	 * 测试手牌所属类型
	 * 
	 * @param c1
	 * @param c2
	 * @param c3
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return
	 */
	public static String Type(String c1, String c2, String c3, int n1, int n2, int n3) {
		
		String type = null;
		String type6 = "同花顺";
		String type1 = "同花";
		String type2 = "顺子";
		String type3 = "同点";
		String type4 = "对子";
		String type5 = "杂牌";

		/// 同花情况；
		if (c1 == c2 && c2 == c3) {
			type = type1;
			// 同花顺情况
			if (n1 != 1 && n2 != 1 && n3 != 1) {
				if (n3 == n2 + 1 && n3 == n1 + 2) {
					type = type6;
				} else if (n3 == n1 + 1 && n3 == n2 + 2) {
					type = type6;
				} else if (n2 == n3 + 1 && n2 == n1 + 2) {
					type = type6;
				} else if (n2 == n1 + 1 && n2 == n3 + 2) {
					type = type6;
				} else if (n1 == n3 + 1 && n1 == n2 + 2) {
					type = type6;
				} else if (n1 == n2 + 1 && n1 == n3 + 2) {
					type = type6;
				}
			} else if (n1 == 12 && n2 == 13 && n3 == 1) {
				type = type6;
			} else if (n1 == 12 && n2 == 1 && n3 == 13) {
				type = type6;
			} else if (n1 == 13 && n2 == 1 && n3 == 12) {
				type = type6;
			} else if (n1 == 13 && n2 == 12 && n3 == 1) {
				type = type6;
			} else if (n1 == 1 && n2 == 12 && n3 == 13) {
				type = type6;
			} else if (n1 == 1 && n2 == 13 && n3 == 12) {
				type = type6;
			}
		}

		// 顺子情况；
		else  if (n3 == n2 + 1 && n3 == n1 + 2 && n1 != 1 && n2 != 1 && n3 != 1) {
				type = type2;
			} else if (n3 == n1 + 1 && n3 == n2 + 2&& n1 != 1 && n2 != 1 && n3 != 1) {
				type = type2;
			} else if (n2 == n3 + 1 && n2 == n1 + 2&& n1 != 1 && n2 != 1 && n3 != 1) {
				type = type2;
			} else if (n2 == n1 + 1 && n2 == n3 + 2&& n1 != 1 && n2 != 1 && n3 != 1) {
				type = type2;
			} else if (n1 == n3 + 1 && n1 == n2 + 2&& n1 != 1 && n2 != 1 && n3 != 1) {
				type = type2;
			} else if (n1 == n2 + 1 && n1 == n3 + 2&& n1 != 1 && n2 != 1 && n3 != 1) {
				type = type2;
			} else if (n1 == 12 && n2 == 13 && n3 == 1&& n1 != 1 && n2 != 1 && n3 != 1) {
			type = type2;
		} else if (n1 == 12 && n2 == 1 && n3 == 13) {
			type = type2;
		} else if (n1 == 13 && n2 == 1 && n3 == 12) {
			type = type2;
		} else if (n1 == 13 && n2 == 12 && n3 == 1) {
			type = type2;
		} else if (n1 == 1 && n2 == 12 && n3 == 13) {
			type = type2;
		} else if (n1 == 1 && n2 == 13 && n3 == 12) {
			type = type2;
		}
		// 同点情况
		else if (n1 == n2 && n2 == n3) {
			type = type3;
		}
		// 对子情况
		else if (n1 == n2 && n2 != n3) {
			type = type4;
		} else if (n2 == n3 && n1 != n2) {
			type = type4;
		} else if (n1 == n3 && n2 != n3) {
			type = type4;
		}
		// 杂牌情况
		else if (n1 != n2 && n2 != n3 && n3 != n1) {
			type = type5;
		}

		return type;
	}
}

