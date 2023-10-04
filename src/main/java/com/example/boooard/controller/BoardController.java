package com.example.boooard.controller;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.dto.response.PostResponse;
import com.example.boooard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("")
    public String openPostWrite(@RequestParam(value = "id", required = false) final Long id, Model model) {
        if (id != null) {
            PostResponse post = boardService.findPostById(id);
            model.addAttribute("post", post);
        }
        return "boardadd";
    }


    @GetMapping("/index")
    public String board() {
        return "index";
    }

    @PostMapping("/save")
    public String savePost(final ReqInsertDTO params) {
        boardService.savePost(params);
        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public String boardList(Model model) {
        List<PostResponse> posts = boardService.findAllPost();
        model.addAttribute("posts", posts);
        return "list";
    }

    @GetMapping("/view/{id}")
    public String openBoardView(@PathVariable final Long id, Model model) {
        PostResponse post = boardService.findPostById(id);
        model.addAttribute("post", post);
        return "/view";
    }


    @PostMapping("/update")
    public String updatePost(final ReqInsertDTO params) {
        boardService.updatePost(params);
        return "redirect:/board/list";
    }

    @PostMapping("/delete")
    public String deletePost(@RequestParam final Long id) {
        boardService.deletePost(id);
        return "redirect:/board/list";

    }
}

