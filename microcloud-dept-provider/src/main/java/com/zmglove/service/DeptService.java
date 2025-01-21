package com.zmglove.service;

import com.zmglove.entity.Dept;
import com.zmglove.repo.entity.DeptDO;
import com.zmglove.repo.mapper.DeptMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DeptService {

    @Resource
    private DeptMapper deptMapper;


    public Dept getById(long id) {
        DeptDO deptDO = deptMapper.selectById(id);
        if (deptDO == null) {
            return null;
        }

        Dept dept = new Dept(deptDO.getName(), deptDO.getId());
        log.info("dept 的结果为:" + dept.toString());
        return dept;
    }
}
