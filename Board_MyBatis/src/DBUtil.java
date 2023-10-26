package src;


import java.io.InputStream;
import java.util.ArrayList;

public class DBUtil {

	String url = "dbc:mariadb://127.0.0.1:3306/java_prj";
	String user = "root";
	String pass = "12345";
	SqlSessionFactory sqlSessionFactory;
	
	public void init() {
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		} catch (Exception e) {
			System.out.println("MyBatis 설정 파일 가져오는 중 문제 발생!!");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Board> getBoard() {
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<Board> boardList = mapper.getBoardlist();
		
		return boardList;
	}
	
	public void insertBoard(String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Board board = new Board(name, address, phone);
		mapper.insertBoard(board);
		
		session.commit(); // update, delete, insert
	}
	
	public void updateBoard(int bno, String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Board board = new Board(bno, name, address, phone);
		mapper.updateBoard(board);
		
		session.commit(); // update, delete, insert
	}
	
	public void deleteBoard(int bno) {
		SqlSession session = sqlSessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		mapper.deleteBoard(bno);
		
		session.commit(); // update, delete, insert
	}
	
}

