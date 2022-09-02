package com.howework0901.controller;

import com.howework0901.pojo.Worker;
import com.howework0901.service.DepartmentService;
import com.howework0901.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WorkerController {
    @Autowired
    private WorkerService ws;
    @Autowired
    private DepartmentService ds;

    @GetMapping("/all")
    public String all(Model model) {
        model.addAttribute("list", ws.getallworker());
        this.adddep(model);
        return "worker";
    }
    @GetMapping("/delete/{wid}")
    public String del(@PathVariable("wid") Integer wid) {
        int n = ws.delete(wid);
        if (n > 0) {
            return "forward:/all";
        } else {
            return "false1";
        }

    }

    @GetMapping("/save")
    public String save(Model model) {
        model.addAttribute("worker", new Worker());
        this.adddep(model);
        return "add";
    }

    @GetMapping("/update/{wid}")
    public String update(Model model, @PathVariable("wid") Integer wid) {
        model.addAttribute("worker", ws.getOne(wid));
        this.adddep(model);
        return "update";

    }

    @PostMapping("/workersave")
    public String save(Worker worker, Model model) {
        int cnt = ws.save(worker);
        if (cnt > 0) {
            return "redirect:/all";
        } else {
            return "false2";
        }
    }
    @PostMapping("/workerupdate")
    public String update(Worker worker, Model model){
        int cnt = ws.update(worker);
        if(cnt > 0){
            return "redirect:/all";
        }else{
            return "false3";
        }
    }
    private void adddep(Model model){
        model.addAttribute("departments",ds.getalldept());
    }


    @GetMapping("/dname")
    public String dname(Model model, @RequestParam("deptid") Integer deptid) {
        model.addAttribute("list", ws.getworkbydeptid(deptid));
        this.adddep(model);
        return "worker";

    }

}
