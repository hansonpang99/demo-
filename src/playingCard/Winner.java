package playingCard;

public class Winner {
	/**
	 * �ж���Ӯ
	 */
	public static String Winner() {
		String winner = null;
		// ��ȡ�˿��Ƶ����ֺͻ�ɫ�����
		String s1 = "A��ҵĽ��Ϊ��";
		String s2 = "B��ҵĽ��Ϊ��";
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
		System.out.println(s1 + card01 + ";  " + card02 + ";  " + card03 + "��");
		System.out.println(s2 + card04 + ";  " + card05 + ";  " + card06 + "��");
		// �Ƚ���Ӯ
		String TypeA = CardType.Type(SuitOfCard01, SuitOfCard02, SuitOfCard03, number01, number02, number03);
		String TypeB = CardType.Type(SuitOfCard04, SuitOfCard05, SuitOfCard06, number04, number05, number06);

		System.out.println("A��ҵ���������Ϊ��" + TypeA);
		System.out.println("B��ҵ���������Ϊ��" + TypeB);
		// AB��ұ���ƽ��
		if (TypeA == TypeB && number01 == number04 && number02 == number05 && number03 == number06) {
			winner = "ƽ��";
		}
		// ��AB����������Ͳ�ͬʱ
		if (TypeA != TypeB) {
			if (TypeA == "ͬ��˳") {
				winner = "A��һ�ʤ";
			} else if (TypeB == "ͬ��˳") {
				winner = "B��һ�ʤ";
			} else if (TypeA == "ͬ��") {
				winner = "A��һ�ʤ";
			} else if (TypeB == "ͬ��") {
				winner = "B��һ�ʤ";
			} else if (TypeA == "˳��") {
				winner = "A��һ�ʤ";
			} else if (TypeB == "˳��") {
				winner = "B��һ�ʤ";
			} else if (TypeA == "ͬ��") {
				winner = "A��һ�ʤ";
			} else if (TypeB == "ͬ��") {
				winner = "B��һ�ʤ";
			} else if (TypeA == "����" && TypeB == "����") {
				winner = "A��һ�ʤ";
			} else if (TypeB == "����" && TypeA == "����") {
				winner = "B��һ�ʤ";
			}
		}

		// ��AB�������������ͬʱ
		if (TypeA == TypeB) {
			// AB����������Ͷ�Ϊ��ͬ��˳��
			if (TypeA == "ͬ��˳") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);
				if (number01 != 1 && number02 != 1 && number03 != 1 && number04 != 1 && number05 != 1
						&& number06 != 1) {
					if (maxA > maxB) {
						winner = "A��һ�ʤ";
					} else if (maxA < maxB) {
						winner = "B��һ�ʤ";
					} else if (maxA == maxB) {
						winner = "ƽ��";
					}
				} else if (minA == 1 && minB != 1) {
					winner = "A��һ�ʤ";
				} else if (minA != 1 && minB == 1) {
					winner = "B��һ�ʤ";
				} else if (minA == minB && minA == 1) {
					winner = "ƽ��";
				}
			}
			// AB����������Ͷ�Ϊ��ͬ����
			if (TypeA == "ͬ��") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);
				// ����ͬ��˳���

				// �����ֶ���Ϊ1ʱ
				if (number01 != 1 && number02 != 1 && number03 != 1 && number04 != 1 && number05 != 1
						&& number06 != 1) {
					if (maxA > maxB) {
						winner = "A��һ�ʤ";
					} else if (maxA < maxB) {
						winner = "B��һ�ʤ";
					} else if (maxA == maxB) {
						if (midA > midB) {
							winner = "A��һ�ʤ";
						} else if (midA < midB) {
							winner = "B��һ�ʤ";
						} else if (midA == midB) {
							if (minA > minB) {
								winner = "A��һ�ʤ";
							} else if (minA < minB) {
								winner = "B��һ�ʤ";
							} else if (minA == minB) {
								winner = "ƽ��";
							}
						}
					}
				}
				// �������г���1ʱ
				else if (minA == 1 && minB != 1) {
					winner = "A��һ�ʤ";
				} else if (minB == 1 && minA != 1) {
					winner = "B��һ�ʤ";
				} else if (minA == minB && minA == 1) {
					if (midA == 1 && midB != 1) {
						winner = "A��һ�ʤ";
					} else if (midA != 1 && minB == 1) {
						winner = "B��һ�ʤ";
					} else if (midA == midB && midA == 1) {
						if (maxA > maxB) {
							winner = "A��һ�ʤ";
						} else if (maxA < maxB) {
							winner = "B��һ�ʤ";
						} else if (maxA == maxB) {
							winner = "ƽ��";
						}
					}
				}

			}

			// AB����������Ͷ�Ϊ��˳�ӡ�
			if (TypeA == "˳��") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);

				if (number01 != 1 && number02 != 1 && number03 != 1 && number04 != 1 && number05 != 1
						&& number06 != 1) {
					if (maxA > maxB) {
						winner = "A��һ�ʤ";
					} else {
						winner = "B��һ�ʤ";
					}
				} else if (minA == 1 && minB != 1) {
					winner = "A��һ�ʤ";
				} else if (minA != 1 && minB == 1) {
					winner = "B��һ�ʤ";
				} else if (maxA == maxB && midA == midB && minA == minB) {
					winner = "ƽ��";
				}
			}
			// AB����������Ͷ�Ϊ��ͬ�㡱ʱ
			if (TypeA == "ͬ��") {
				if (number01 != 1 && number04 != 1) {
					if (number01 > number04) {
						winner = "A��һ�ʤ";
					} else if (number01 < number04) {
						winner = "B��һ�ʤ";
					}
				} else if (number01 == 1 && number04 != 1) {
					winner = "A��һ�ʤ";
				} else if (number01 != 1 && number04 == 1) {
					winner = "B��һ�ʤ";
				} else if (number01 == number04) {
					winner = "ƽ��";
				}
			}
			// AB����������Ͷ��ǡ����ӡ�ʱ
			if (TypeA == "����") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);
				int leftA = 0;
				int leftB = 0;

				
				// ȷ�����Ƕ������Ǹ���
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
						winner = "A��һ�ʤ";
					} else if (midA < midB) {
						winner = "B��һ�ʤ";
					} else if (midA == midB) {
						if (leftA > leftB) {
							winner = "A��һ�ʤ";
						} else if (leftA < leftB) {
							winner = "B��һ�ʤ";
						} else if (leftA == leftB) {
							winner = "ƽ��";
						}
					}
				} else if (midA != 1 && midB != 1 || minA == 1 || minB == 1) {
					if (midA > midB) {
						winner = "A��һ�ʤ";
					} else if (midA < midB) {
						winner = "B��һ�ʤ";
					} else if (midA == midB) {
						winner = "ƽ��";
					}
				} else if (midA == 1 && midB != 1) {
					winner = "A��һ�ʤ";
				} else if (midA != 1 && midB == 1) {
					winner = "B��һ�ʤ";
				} else if (midA == 1 && midB == 1) {
					if (leftA > leftB) {
						winner = "A��һ�ʤ";
					} else if (leftA < leftB) {
						winner = "B��һ�ʤ";
					}
				} else if (maxA == maxB && midA == midB && minA == minB) {
					winner = "ƽ��";
				}
			}
			// AB����������Ͷ�Ϊ�����ơ�ʱ
			if (TypeA == "����") {
				int maxA = Sorting.MaxNumber(number01, number02, number03);
				int maxB = Sorting.MaxNumber(number04, number05, number06);
				int midA = Sorting.MidNumber(number01, number02, number03);
				int midB = Sorting.MidNumber(number04, number05, number06);
				int minA = Sorting.MinNumber(number01, number02, number03);
				int minB = Sorting.MinNumber(number04, number05, number06);

				if (minA != 1 && minB != 1) {
					if (maxA > maxB) {
						winner = "A��һ�ʤ";
					} else if (maxA < maxB) {
						winner = "B��һ�ʤ";
					} else if (maxA == maxB) {
						if (midA > midB) {
							winner = "A��һ�ʤ";
						} else if (midA < midB) {
							winner = "B��һ�ʤ";
						} else if (midA == midB) {
							if (minA > minB) {
								winner = "A��һ�ʤ";
							} else if (minA < minB) {
								winner = "B��һ�ʤ";
							} else if (minA == minB) {
								winner = "ƽ��";
							}
						}
					}

				} else if (minA == 1 && minB != 1) {
					winner = "A��һ�ʤ";
				} else if (minA != 1 && minB == 1) {
					winner = "B��һ�ʤ";
				} else if (minA == 1 && minB == 1) {
					if (maxA > maxB) {
						winner = "A��һ�ʤ";
					} else if (maxA < maxB) {
						winner = "B��һ�ʤ";
					} else if (maxA == maxB) {
						if (midA > midB) {
							winner = "A��һ�ʤ";
						} else if (midA < midB) {
							winner = "B��һ�ʤ";
						} else if (midA == midB) {
							winner = "ƽ��";
						}
					}

				}
			}
		}
		return winner;
	}

}
