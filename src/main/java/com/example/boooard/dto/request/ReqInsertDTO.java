package com.example.boooard.dto.request;

import lombok.Data;

@Data
public class ReqInsertDTO {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private Boolean noticeYn;


}
