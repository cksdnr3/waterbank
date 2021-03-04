package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class SupportBoard {
    private double boardNo;
    private String title;
    private String content;
    private String writer;
    private Date reg_date;
}
