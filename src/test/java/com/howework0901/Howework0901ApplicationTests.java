package com.howework0901;

import com.howework0901.pojo.Worker;
import com.howework0901.service.DepartmentService;
import com.howework0901.service.WorkerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Howework0901ApplicationTests {
    @Autowired
    private DepartmentService ds;
    @Autowired
    private WorkerService ws;
    @Test
    void contextLoads() {
        System.out.println(ws.getallworker());
        System.out.println("---------------------------");
        Worker w = ws.getOne(10);
        System.out.println(w);
        System.out.println("---------------------------");
        w.setWsex("男");
        System.out.println("update:" + ws.update(w));
    }
    @Test
    void contextLoads2() {
        System.out.println(ws.getworkbydeptid(104));

    }

}
