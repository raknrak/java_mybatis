package src;

import java.util.ArrayList;

public interface BoardMapper {
	
	public ArrayList<Board> getBoardlist();
	public void insertBoard(Board board);
	public void updateBoard(Board board);
	public void deleteBoard(int bno);
}
