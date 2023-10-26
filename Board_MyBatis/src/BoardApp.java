package src;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

  public static void main(String[] args) {

		DBUtil db = new DBUtil();//인스턴스 생성
		db.init();//데이터베이스 연결 초기화
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String cmd = scan.nextLine();
			
			if(cmd.equals("exit")) { //프로그램 종료
				break;
				
			} else if(cmd.equals("add")) { //주소록 추가
				System.out.println("========= 주소록 등록 =========");
				System.out.print("이름 : ");
				String name = scan.nextLine();
				System.out.print("주소 : ");
				String address = scan.nextLine();
				System.out.print("전화번호 : ");
				String phone = scan.nextLine();
				//데이터베이스의 insertBoard 메소드를 호출
				db.insertBoard(name, address, phone);
				
				System.out.println("주소록 등록 완료.");
				System.out.println("============================");

			} else if(cmd.equals("list")) {//주소록 목록 출력
				
				ArrayList<Board> boardsList = db.getBoard();
				WebView wv = new WebView();
				wv.printBoard(boardsList);
				
				
			} else if(cmd.equals("update")) {//주소록 수정
				System.out.print("몇번 주소록을 수정하시겠습니까 : ");
				int id = Integer.parseInt(scan.nextLine()); 
				System.out.println("========= 주소록 수정 =========");
				System.out.print("이름 : ");
				String name = scan.nextLine();
				System.out.print("주소 : ");
				String address = scan.nextLine();
				System.out.print("전화번호 : ");
				String phone = scan.nextLine();
				//데이터베스의 updateBoard 메소드를 호출
				db.updateBoard(id, name, address, phone);
				
				System.out.println("주소록 수정 완료.");
				System.out.println("============================");
				
			} else if(cmd.equals("delete")) {//주소록 삭제
				System.out.print("몇번 주소록을 삭제하시겠습니까 : ");
				int id = Integer.parseInt(scan.nextLine());
				db.deleteBoard(bno);
				System.out.println(bno + "번 주소록이 삭제되었습니다.");
				System.out.println("==============================");
			}
		}	
	}
}
