package com.learn.service.impl;

import com.learn.dao.PaperDAO;
import com.learn.domain.Paper;
import com.learn.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperDAO paperDAO;

    @Override
    public int addPaper(Paper paper) {
        return paperDAO.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return paperDAO.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperDAO.updatePaper(paper);
    }

    @Override
    public Paper queryById(long id) {
        return paperDAO.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return paperDAO.queryAllPaper();
    }

}
