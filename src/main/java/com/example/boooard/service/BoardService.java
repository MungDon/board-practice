package com.example.boooard.service;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.dto.response.PostResponse;
import com.example.boooard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    @Transactional
    public Long savePost(final ReqInsertDTO params) {
        boardMapper.save(params);
        return params.getId();

    }

    public PostResponse findPostById(final Long id) {
        return boardMapper.findById(id);
    }

    public List<PostResponse> findAllPost() {
        return boardMapper.findAll();
    }

    public Long deletePost(final Long id) {
        boardMapper.deleteById(id);
        return id;
    }

    @Transactional
    public Long updatePost(final ReqInsertDTO params) {
        boardMapper.update(params);
        return params.getId();
    }
}