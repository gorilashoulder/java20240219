package ch15.lecture.p1list.excercise.n7;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao=new BoardDao();
        List<Board>list=dao.getBoardList();
        for(Board board:list){
            System.out.println(board.getTitle()+"-"+board.getContent());
        }
    }
}

class BoardDao{

    public List<Board> getBoardList() {
        List<Board> list=new ArrayList<>();
        list.add(new Board("제목 1","내용1"));
        list.add(new Board("제목 2","내용2"));
        list.add(new Board("제목 3","내용3"));

        return list;
    }
}
