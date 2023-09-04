package com.example.boooard.mapper;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.dto.response.PostResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public void insert(ReqInsertDTO req);
    static List<PostResponse> findAll();
}
