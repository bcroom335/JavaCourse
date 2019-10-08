package tw.teamThree.firstproject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) throws IOException, SQLException {
		while (true) {
			// 輸入帳號密碼或q離開
			System.out.println("請輸入帳號或輸入Q離開");
			Scanner username_sca = new Scanner(System.in);
			String username = username_sca.next();

			if ("q".equalsIgnoreCase(username)) {
				System.out.println("結束");
				System.exit(1);
			}
			System.out.println("請輸入密碼或輸入exit離開");
			Scanner password_sca = new Scanner(System.in);
			String password = password_sca.next();
			if ("q".equalsIgnoreCase(password)) {
				System.out.println("結束");
				System.exit(1);
			}
			Member mb = new Member();
			mb.setAccount(username);
			mb.setPassword(password);

			IMemberDao MBDF = MemberDaoFactory.createMember();
			MBDF.createConn();
			int member_id = MBDF.fintById(mb);
			System.out.println(member_id);
			MBDF.closeConn();
			// 判斷帳號密是否正確
			if (member_id != 0) {
				System.out.println("您需要甚麼");
				System.out.println("1.產生數組");
				System.out.println("2.觀看數組");
				System.out.println("3.離開");
				Scanner change_sca = new Scanner(System.in);
				int change = change_sca.nextInt();
				// 產生幸運號碼
				if (change == 1) {

					System.out.println("你需要產生多少數組");
					Scanner count_sca = new Scanner(System.in);
					int count = count_sca.nextInt();
					for (int i = 0; i < count; i++) {
						LuckyNumbers LNS = new LuckyNumbers();
						ArrayList<Integer> LN_list = new ArrayList<Integer>();
						LuckNumberMaker LNM = new LuckNumberMaker();

						int[][] MathArry = LNM.makeArray();
						int[] LuckNumber_top6 = new int[6];
						// 從出現最多次的數字開始排序
						int[][] ArrayFormat = LNM.NumberFormat(MathArry);
						// 篩選前6個出現最多的數字
						for (int i1 = 0; i1 < 6; i1++) {
							LuckNumber_top6[i1] = ArrayFormat[0][i1];

						}
						// 將前6個數字塞入資料庫
						int[] formatLuckNumber = LNM.NumberFormat(LuckNumber_top6);
						for (int j = 0; j < formatLuckNumber.length; j++) {
							LN_list.add(j, formatLuckNumber[j]);
						}

						LNS.setLuckyNumber(LN_list);

						ILuckyNumberDao LNDF = LuckyNumberDaoFactory.createLuckyNumber();
						LNDF.createConn();
						LNDF.add(LNS, member_id);
						LNDF.closeConn();
					}
				} else if (change == 2) {// 印出所有的幸運號碼
					ILuckyNumberDao LNDF = LuckyNumberDaoFactory.createLuckyNumber();
					LNDF.createConn();
					LNDF.fintById(member_id);
					LNDF.closeConn();
				}else if (change == 3) {
					System.out.println("結束");
					System.exit(1);
				}else {
					System.out.println("請輸入有效號碼");
				}
			} else {
				System.out.println("帳號密碼錯誤");
			}
		}
	}
}
