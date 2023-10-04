package com.example.boooard.mapper;

import com.example.boooard.dto.request.ReqInsertDTO;
import com.example.boooard.dto.response.PostResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void save(ReqInsertDTO params);



    PostResponse findById(Long id);

    List<PostResponse> findAll();

    void update(ReqInsertDTO params);

    void deleteById(Long id);
}
