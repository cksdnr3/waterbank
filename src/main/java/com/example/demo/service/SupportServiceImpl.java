package com.example.demo.service;

import com.example.demo.entity.SupportBoard;
import com.example.demo.repository.SupportBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportServiceImpl implements SupportService {
    @Autowired
    private SupportBoardRepository SupportBoardRepo;

    @Override
    public List<SupportBoard> list() throws Exception {
        return SupportBoardRepo.list();
    }

    @Override
    public void register(SupportBoard board) throws Exception {
        SupportBoardRepo.create(board);
    }

    @Override
    public SupportBoard read(Long boardNo) throws Exception {
        return SupportBoardRepo.read(boardNo);
    }

    @Override
    public void remove(Long boardNo) throws Exception {
        SupportBoardRepo.delete(boardNo);
    }

    @Override
    public void modify(SupportBoard board) throws Exception {
        SupportBoardRepo.update(board);
    }
}
