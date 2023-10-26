package src;

import java.util.ArrayList;

public class WebView {

	public void printBoard(ArrayList<Board> boardList) {
		
		System.out.println("웹 브라우저에 출력");
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println("========= 게시판 목록 =========");
			System.out.println("번호 : " + boardList.get(i).getBno());
			System.out.println("제목 : " + boardList.get(i).getBtitle());
			System.out.println("내용 : " + boardList.get(i).getBcontent());
			System.out.println("글쓴이 : " + boardList.get(i).getBwriter());
			System.out.println("날짜 : " + boardList.get(i).getBdate());
			System.out.println("=============================");
		}
	}
}
