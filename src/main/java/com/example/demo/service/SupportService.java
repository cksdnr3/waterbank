package com.example.demo.service;

import com.example.demo.entity.SupportBoard;

import java.util.List;

public interface SupportService {
    public List<SupportBoard> list() throws Exception;
    public void register(SupportBoard board) throws Exception;
    public SupportBoard read(Long boardNo) throws Exception;
    public void remove(Long boardNo) throws Exception;
    public void modify(SupportBoard board) throws Exception;
}
