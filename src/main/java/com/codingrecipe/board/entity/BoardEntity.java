package com.codingrecipe.board.entity;

import com.codingrecipe.board.dto.BoardDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity// DB의 테이블 역할을 하는 클래스라는 의미 JPA에서는 필수적으로 사용해야한다.
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity {
    @Id // pk 컬럼 지정. 필수로 하나는 있어야함
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Long id;

    @Column(length = 20, nullable = false)
    private String boardWriter;

    @Column // default = 크기 255, null 가능
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }
}
