package com.howework0901.service;

import com.howework0901.pojo.Worker;

import java.util.List;

public interface WorkerService {
    public List<Worker> getallworker();
    public List<Worker> getworkbydeptid(Integer deptid);
    public Worker getOne(Integer wid);
    public int update(Worker worker);
    public int save(Worker worker);
    public int delete(Integer wid);
}
