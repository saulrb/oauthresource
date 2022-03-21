package com.saulrb.oauthresource.service;

import com.saulrb.oauthresource.entity.Board;

public interface IBoardService {
    Iterable<Board> findAll();
}
