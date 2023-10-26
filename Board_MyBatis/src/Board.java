package src;

import java.util.Date;

public class Board {
	private int bno; //게시물 번호
	@lombok.Setter
	@lombok.Getter
	private String btitle;//게시물 제목
	private String bcontent;//게시물 내용
	private String bwriter;//게시물 작성자
	private Date bdate;//게시물 작성일

	//모든 필드를 초기화하는 생성자
	public Board(int bno, String btitle, String bcontent, String bwriter, Date bdate) {
		super();// 상위 클래스 호출
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;
	}
	//일부 필드를 초기화하는 생성자
	public Board(String btitle, String bcontent, String bwriter, Date bdate) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;

	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
}

	
