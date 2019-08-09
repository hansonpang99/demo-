package playingCard;

public class Winner {
	/**
	 * 判断输赢
	 */
	public static String Winner() {
		String winner = null;
		// 抽取扑克牌的数字和花色并输出
		String s1 = "A玩家的结果为：";
		String s2 = "B玩家的结果为：";
		String SuitOfCard01 = RandomCard.SuitOfCard();
		String SuitOfCard02 = RandomCard.SuitOfCard();
		String SuitOfCard03 = RandomCard.SuitOfCard();
		String SuitOfCard04 = RandomCard.SuitOfCard();
		String SuitOfCard05 = RandomCard.SuitOfCard();
		String SuitOfCard06 = RandomCard.SuitOfCard();
		int number01 = RandomCard.number();
		int number02 = RandomCard.number();
		int number03 = RandomCard.number();
		int number04 = RandomCard.number();
		int number05 = RandomCard.number();
		int number06 = RandomCard.number();
		String card01 = (SuitOfCard01 + "  " + number01);
		String card02 = (SuitOfCard02 + "  " + number02);
		String card03 = (SuitOfCard03 + "  " + number03);
		String card04 = (SuitOfCard04 + "  " + number04);
		String card05 = (SuitOfCard05 + "  " + number05);
		String card06 = (SuitOfCard06 + "  " + number06);
		System.out.println(s1 + card01 + ";  " + card02 + ";  " + card03 + "。");
		System.out.println(s2 + card04 + ";  " + card05 + ";  " + card06 + "。");
		// 比较输赢
		String TypeA = CardType.Type(SuitOfCard01, SuitOfCard02, SuitOfCard03, number01, number02, number03);
		String TypeB = CardType.Type(SuitOfCard04, SuitOfCard05, SuitOfCard06, number04, number05, number06);

		System.out.println("A玩家的手牌类型为：" + TypeA);
		System.out.println("B玩家的手牌类型为：" + TypeB);
		// AB玩家比赛平局
		if (TypeA == TypeB && number01 == number04 && number02 == number05 && number03 == number06) {
			winner = "平局";
		}
		// 当AB玩家手牌类型不同时
		if (TypeA != TypeB) {
			if (TypeA == "同花顺") {
				winner = "A玩家获胜";
			} else if (TypeB == "同花顺") {
				winner = "B玩家获胜";
			} else if (TypeA == "同花") {
				winner = "A玩家获胜";
			} else if (TypeB == "同花") {
				winner = "B玩家获胜";
			} else if (TypeA == "顺子") {
				winner = "A玩家获胜";
			} else if (TypeB == "顺子") {
				winner = "B玩家获胜";
			} else if (TypeA == "同点") {
				winner = "A玩家获胜";
			} else if (TypeB == "同点") {
				winner = "B玩家获胜";
			} else if (TypeA == "对子" && TypeB == "杂牌") {
				winner = "A玩家获胜";
			} else if (TypeB == "对子" && TypeA == "杂牌") {
				winner = "B玩家获胜";
			}
		}

		// 当AB玩家手牌类型相同时
		if (TypeA == TypeB) {
			// AB玩家手牌类型都为“同花顺”
			if (TypeA == "同花顺") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);
				if (number01 != 1 && number02 != 1 && number03 != 1 && number04 != 1 && number05 != 1
						&& number06 != 1) {
					if (maxA > maxB) {
						winner = "A玩家获胜";
					} else if (maxA < maxB) {
						winner = "B玩家获胜";
					} else if (maxA == maxB) {
						winner = "平局";
					}
				} else if (minA == 1 && minB != 1) {
					winner = "A玩家获胜";
				} else if (minA != 1 && minB == 1) {
					winner = "B玩家获胜";
				} else if (minA == minB && minA == 1) {
					winner = "平局";
				}
			}
			// AB玩家手牌类型都为“同花”
			if (TypeA == "同花") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);
				// 出现同花顺情况

				// 当数字都不为1时
				if (number01 != 1 && number02 != 1 && number03 != 1 && number04 != 1 && number05 != 1
						&& number06 != 1) {
					if (maxA > maxB) {
						winner = "A玩家获胜";
					} else if (maxA < maxB) {
						winner = "B玩家获胜";
					} else if (maxA == maxB) {
						if (midA > midB) {
							winner = "A玩家获胜";
						} else if (midA < midB) {
							winner = "B玩家获胜";
						} else if (midA == midB) {
							if (minA > minB) {
								winner = "A玩家获胜";
							} else if (minA < minB) {
								winner = "B玩家获胜";
							} else if (minA == minB) {
								winner = "平局";
							}
						}
					}
				}
				// 当数字中出现1时
				else if (minA == 1 && minB != 1) {
					winner = "A玩家获胜";
				} else if (minB == 1 && minA != 1) {
					winner = "B玩家获胜";
				} else if (minA == minB && minA == 1) {
					if (midA == 1 && midB != 1) {
						winner = "A玩家获胜";
					} else if (midA != 1 && minB == 1) {
						winner = "B玩家获胜";
					} else if (midA == midB && midA == 1) {
						if (maxA > maxB) {
							winner = "A玩家获胜";
						} else if (maxA < maxB) {
							winner = "B玩家获胜";
						} else if (maxA == maxB) {
							winner = "平局";
						}
					}
				}

			}

			// AB玩家手牌类型都为“顺子”
			if (TypeA == "顺子") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);

				if (number01 != 1 && number02 != 1 && number03 != 1 && number04 != 1 && number05 != 1
						&& number06 != 1) {
					if (maxA > maxB) {
						winner = "A玩家获胜";
					} else {
						winner = "B玩家获胜";
					}
				} else if (minA == 1 && minB != 1) {
					winner = "A玩家获胜";
				} else if (minA != 1 && minB == 1) {
					winner = "B玩家获胜";
				} else if (maxA == maxB && midA == midB && minA == minB) {
					winner = "平局";
				}
			}
			// AB玩家手牌类型都为“同点”时
			if (TypeA == "同点") {
				if (number01 != 1 && number04 != 1) {
					if (number01 > number04) {
						winner = "A玩家获胜";
					} else if (number01 < number04) {
						winner = "B玩家获胜";
					}
				} else if (number01 == 1 && number04 != 1) {
					winner = "A玩家获胜";
				} else if (number01 != 1 && number04 == 1) {
					winner = "B玩家获胜";
				} else if (number01 == number04) {
					winner = "平局";
				}
			}
			// AB玩家手牌类型都是“对子”时
			if (TypeA == "对子") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);
				int leftA = 0;
				int leftB = 0;

				
				// 确定不是对数的那个数
				if (midA == maxA) {
					leftA = minA;
				} else if (midA == minA) {
					leftA = maxA;
				}

				if (midB == maxB) {
					leftB = minB;
				} else if (midB == minB) {
					leftB = maxB;
				}

				if (midA != 1 && midB != 1 && minA != 1 && minB != 1) {
					if (midA > midB) {
						winner = "A玩家获胜";
					} else if (midA < midB) {
						winner = "B玩家获胜";
					} else if (midA == midB) {
						if (leftA > leftB) {
							winner = "A玩家获胜";
						} else if (leftA < leftB) {
							winner = "B玩家获胜";
						} else if (leftA == leftB) {
							winner = "平局";
						}
					}
				} else if (midA != 1 && midB != 1 || minA == 1 || minB == 1) {
					if (midA > midB) {
						winner = "A玩家获胜";
					} else if (midA < midB) {
						winner = "B玩家获胜";
					} else if (midA == midB) {
						winner = "平局";
					}
				} else if (midA == 1 && midB != 1) {
					winner = "A玩家获胜";
				} else if (midA != 1 && midB == 1) {
					winner = "B玩家获胜";
				} else if (midA == 1 && midB == 1) {
					if (leftA > leftB) {
						winner = "A玩家获胜";
					} else if (leftA < leftB) {
						winner = "B玩家获胜";
					}
				} else if (maxA == maxB && midA == midB && minA == minB) {
					winner = "平局";
				}
			}
			// AB玩家手牌类型都为“杂牌”时
			if (TypeA == "杂牌") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);

				if (minA != 1 && minB != 1) {
					if (maxA > maxB) {
						winner = "A玩家获胜";
					} else if (maxA < maxB) {
						winner = "B玩家获胜";
					} else if (maxA == maxB) {
						if (midA > midB) {
							winner = "A玩家获胜";
						} else if (midA < midB) {
							winner = "B玩家获胜";
						} else if (midA == midB) {
							if (minA > minB) {
								winner = "A玩家获胜";
							} else if (minA < minB) {
								winner = "B玩家获胜";
							} else if (minA == minB) {
								winner = "平局";
							}
						}
					}

				} else if (minA == 1 && minB != 1) {
					winner = "A玩家获胜";
				} else if (minA != 1 && minB == 1) {
					winner = "B玩家获胜";
				} else if (minA == 1 && minB == 1) {
					if (maxA > maxB) {
						winner = "A玩家获胜";
					} else if (maxA < maxB) {
						winner = "B玩家获胜";
					} else if (maxA == maxB) {
						if (midA > midB) {
							winner = "A玩家获胜";
						} else if (midA < midB) {
							winner = "B玩家获胜";
						} else if (midA == midB) {
							winner = "平局";
						}
					}

				}
			}
		}
		return winner;
	}

}
