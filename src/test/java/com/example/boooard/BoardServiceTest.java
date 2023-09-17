package com.example.boooard;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTest {

    @Autowired
    BoardService boardService;
    @Test
    void save(){
        ReqInsertDTO params = new ReqInsertDTO();
        params.setTitle("1번 게시글 제목");
        params.setContent("1번 게시글 내용");
        params.setWriter("테스터");
        params.setNoticeYn(false);
        boardService.boardInsert(params);
        if(params.getId()==null){
            System.out.println("등록실패");
        }
        System.out.println("생성된 게시글 ID : " + params.getId());

    }

}
