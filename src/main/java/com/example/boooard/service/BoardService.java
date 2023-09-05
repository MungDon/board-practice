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

    public void boardInsert(ReqInsertDTO req) {
        boardMapper.insert(req);
    }

    public List<PostResponse> findAllpost() {
        return boardMapper.findAll();

        
    }
}