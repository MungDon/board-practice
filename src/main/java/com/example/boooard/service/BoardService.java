package com.example.boooard.service;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;
    public void boardInsert(ReqInsertDTO req){
        boardMapper.insert(req);
    }
}
