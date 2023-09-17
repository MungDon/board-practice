package com.example.boooard.service;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.dto.response.PostResponse;
import com.example.boooard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void boardInsert(ReqInsertDTO req) {
        boardMapper.insert(req);
    }

    public PostResponse findById(final Long id){
      return boardMapper.findById(id);
    }

    public List<PostResponse> findAllPost() {
        return boardMapper.findAll();

        
    }
}