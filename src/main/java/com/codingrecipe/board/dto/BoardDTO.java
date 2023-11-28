package com.codingrecipe.board.dto;

import lombok.*;

import java.time.LocalDateTime;

//DTO(Data Transfer Object), VO, Bean
@Getter
@Setter
@ToString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private String boardFile;
    private int boardHits; // 게시글 조회수
    private LocalDateTime boardCreatedTime; // 글 작성시간
    private LocalDateTime boardUpdateTime; // 글 수정시간

}
