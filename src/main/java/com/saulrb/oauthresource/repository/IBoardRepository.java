package com.saulrb.oauthresource.repository;

import com.saulrb.oauthresource.entity.Board;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBoardRepository extends PagingAndSortingRepository<Board, Long> {
}
