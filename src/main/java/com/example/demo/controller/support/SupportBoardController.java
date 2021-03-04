package com.example.demo.controller.support;

import com.example.demo.entity.SupportBoard;
import com.example.demo.service.SupportService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@Controller
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class SupportBoardController {

    @Autowired
    private SupportService service;

    @GetMapping("")
    public ResponseEntity<List<SupportBoard>> list() throws Exception {
        log.info("list()");

        return new ResponseEntity<List<SupportBoard>>(service.list(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<SupportBoard> register(
            @Validated @RequestBody SupportBoard board) throws Exception {
        log.info("register()");

        service.register(board);

        return new ResponseEntity<SupportBoard>(board, HttpStatus.OK);
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<SupportBoard> read(
            @PathVariable("boardNo") Long boardNo) throws Exception {
        log.info("read()");

        SupportBoard board = service.read(boardNo);

        return new ResponseEntity<SupportBoard>(board, HttpStatus.OK);
    }

    @DeleteMapping("/{boardNo}")
    public ResponseEntity<Void> remove(
            @PathVariable("boardNo") Long boardNo) throws Exception {
        log.info("remove()");

        service.remove(boardNo);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<SupportBoard> modify(
            @PathVariable("boardNo") Long boardNo,
            @Validated @RequestBody SupportBoard board) throws Exception {
        log.info("modify()");

        board.setBoardNo(boardNo);
        service.modify(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}
