package com.learn.dao;

import com.learn.domain.Paper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaperDAO {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
