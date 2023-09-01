package com.example.boooard.mapper;

import com.example.boooard.dto.request.ReqInsertDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public void insert(ReqInsertDTO req);
}
