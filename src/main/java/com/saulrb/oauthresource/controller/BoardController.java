package com.saulrb.oauthresource.controller;

import com.saulrb.oauthresource.dto.BoardDto;
import com.saulrb.oauthresource.entity.Board;
import com.saulrb.oauthresource.service.IBoardService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class BoardController {
    private final IBoardService boardService;

    public BoardController(IBoardService boardService) {
        this.boardService = boardService;
    }

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/api/boards")
    public Collection<BoardDto> findAll() {
        Iterable<Board> boards = this.boardService.findAll();
        List<BoardDto> boardDtos = new ArrayList<>();
        boards.forEach( b -> boardDtos.add(convertToDto(b)));
        return boardDtos;
    }

    protected BoardDto convertToDto(Board board) {
        BoardDto boardDto = modelMapper.map(board, BoardDto.class);
        return boardDto;
    }

}
