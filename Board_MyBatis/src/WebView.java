import java.util.ArrayList;

public class WebView {

	public void printBoard(ArrayList<Board> boardList) {

		System.out.println();
		System.out.println("[게시판 목록]");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-40s%-40s\n", "no", "writer", "date", "title"); // ??? 형식문자열. %-6s : 6자리 정수, 오른쪽 빈자리 공백
		System.out.println("-----------------------------------------------------------------");
	}

	public void mainMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("메인 메뉴 : 1.create | 2.read | 3.clear | 4.exit");
		System.out.print("메뉴 선택 : ");
	}

	public void okSubMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택 : ");
	}

	public void readSubMenu() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
		System.out.print("메뉴 선택 : ");
	}

	public void exit() {
		System.out.println();
		System.out.println("게시판 기능을 종료합니다. 이용해주셔서 감사합니다.");
		System.exit(0);
	}

	public void printNowBoard(ArrayList<Board> boardList) {

		for (int i = 0; i < boardList.size(); i++) {
			// 게시판 목록 형식문자열. 자리맞추기
			System.out.printf("%-6s%-10s%-40s%-40s\n",
					boardList.get(i).getBno(),
					boardList.get(i).getBwriter(),
					boardList.get(i).getBdate(),
					boardList.get(i).getBtitle());
		}
		public void readBoardlist (ArrayList<Board>) {
				System.out.println("#######################################");
		System.out.println("번호: " + boardList.get(0).getBno());
		System.out.println("제목: " + boardList.get(0).getBtitle());
		System.out.println("내용: " + boardList.get(0).getBcontent());
		System.out.println("작성자: " + boardList.get(0).getBwriter());
		System.out.println("날짜: " + boardList.get(0).getBdate());
		System.out.println("#######################################");
		}
	}
}

