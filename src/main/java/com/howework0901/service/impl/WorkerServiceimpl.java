package com.howework0901.service.impl;

import com.howework0901.mapper.WorkerMapper;
import com.howework0901.pojo.Worker;
import com.howework0901.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceimpl implements WorkerService {
    @Autowired
    private WorkerMapper wm;
    @Override
    public List<Worker> getallworker() {
        return wm.getallworker();
    }

    @Override
    public List<Worker> getworkbydeptid(Integer deptid) {
        return wm.getworkbydeptid(deptid);
    }

    @Override
    public Worker getOne(Integer wid) {
        return wm.selectById(wid);
    }

    @Override
    public int update(Worker worker) {
        return wm.updateById(worker);
    }

    @Override
    public int save(Worker worker) {
        if(wm.selectById(worker.getWid())==null){
            return wm.insert(worker);
        }else {
            return 0;
        }
    }

    @Override
    public int delete(Integer wid) {
        return wm.deleteById(wid);
    }
}
