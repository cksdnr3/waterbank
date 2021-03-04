package com.example.demo.repository;

import com.example.demo.entity.SupportBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SupportBoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SupportBoard> list() throws Exception{
        List<SupportBoard> results = jdbcTemplate.query(
            "select board_no, title, content, writer, reg_date from board " +
                    "where board_no > 0 order by board_no desc, reg_date desc",
            new RowMapper<SupportBoard>() {
                @Override
                public SupportBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                    SupportBoard supportBoard = new SupportBoard();

                    supportBoard.setBoardNo(rs.getLong("board_no"));
                    supportBoard.setTitle(rs.getString("title"));
                    supportBoard.setContent(rs.getString("content"));
                    supportBoard.setWriter(rs.getString("writer"));
                    supportBoard.setReg_date(rs.getDate("reg_date"));

                    return supportBoard;
                }
            }
        );

        return results;
    }

    public void create(SupportBoard board) throws Exception {
        String query = "insert into board (title, content, writer) values (?, ?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
            new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                    PreparedStatement ps = con.prepareStatement(query, new String[] {"boardNo"});

                    ps.setString(1, board.getTitle());
                    ps.setString(2, board.getContent());
                    ps.setString(3, board.getWriter());

                    return ps;
                }
            }, keyHolder);
        board.setBoardNo(keyHolder.getKey().longValue());
    }

    // 1개의 row를 가져오는 방법이 있음 나중에 공부하고 리팩토링할 것
    public SupportBoard read(Long boardNo) throws Exception {
        List<SupportBoard> results = jdbcTemplate.query(
            "select board_no, title, content, writer, reg_date " +
                    "from board where board_no = ?",
            new RowMapper<SupportBoard>() {
                @Override
                public SupportBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                    SupportBoard board = new SupportBoard();

                    board.setBoardNo(rs.getInt("board_no"));
                    board.setTitle(rs.getString("title"));
                    board.setContent(rs.getString("content"));
                    board.setWriter(rs.getString("writer"));
                    board.setReg_date(rs.getDate("reg_date"));


                    return board;
                }
            }, boardNo
        );
        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Long boardNo) throws Exception {
        String query = "delete from board where board_no = ?";

        jdbcTemplate.update(query, boardNo);
    }

    public void update(SupportBoard board) throws Exception {
        String query = "update board set title = ?, content = ? " +
                "where board_no = ?";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(),
                board.getBoardNo());
    }
}