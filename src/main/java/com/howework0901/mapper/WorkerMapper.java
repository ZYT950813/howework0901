package com.howework0901.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.howework0901.pojo.Worker;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkerMapper extends BaseMapper<Worker> {
    public List<Worker> getallworker();
    public List<Worker> getworkbydeptid(Integer deptid);
}
