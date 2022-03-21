package com.saulrb.oauthresource.service;

import com.saulrb.oauthresource.entity.Board;
import com.saulrb.oauthresource.repository.IBoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements IBoardService{

    private final IBoardRepository boardRepository;

    public BoardServiceImpl(IBoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Iterable<Board> findAll() {
        return boardRepository.findAll();
    }
}
