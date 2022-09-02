package com.howework0901.service.impl;

import com.howework0901.mapper.DepartmentMapper;
import com.howework0901.pojo.Department;
import com.howework0901.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceimpl implements DepartmentService {
    @Autowired
    private DepartmentMapper dm;
    @Override
    public List<Department> getalldept() {
        return dm.selectList(null);
    }
}
