package com.bishe.text1.service;

import com.bishe.text1.dao.StatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private StatusDao statusDao;
    @Override
    public int updateLight(int updatestatus) {
        return statusDao.changelight(updatestatus);
    }

    @Override
    public int updateWindow(int updatestatus) {
        return statusDao.changgewindow(updatestatus);
    }

    @Override
    public int updatelight(int updatestatus) {
        return statusDao.changelight(updatestatus);
    }
}
