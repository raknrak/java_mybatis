import java.util.ArrayList;

public interface BoardMapper {
	
	public ArrayList<Board> getBoardlist();
	public void insertBoard(Board board);
	public void ArrayList<Board> readBoardlist(int bno);
	public void deleteBoard(int bno);
	public void updateBoard(Board board);
	public void clearBoard();
}
