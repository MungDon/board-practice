package com.example.boooard.controller;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("")
    public String boardAddForm() {
        return "boardadd";

    }
    @GetMapping("/index")
    public String board() {
        return "index";

    }

    @PostMapping("")
    public String boardInsert(ReqInsertDTO req) {
        boardService.boardInsert(req);
        return "redirect:/board/index";
    }

}