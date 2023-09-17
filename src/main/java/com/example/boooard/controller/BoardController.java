package com.example.boooard.controller;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.dto.response.PostResponse;
import com.example.boooard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return "redirect:/board/list";
    }
    @GetMapping("/list")
    public String boardList(Model model) {
        List<PostResponse> posts = boardService.findAllPost();
        model.addAttribute("posts", posts);
        return "list";
    }

    @GetMapping("/view")
    public String openBoardView(@RequestParam final Long id, Model model) {
        PostResponse post = boardService.findById(id);
        model.addAttribute("post", post);
            return "/list";
    }
    }

