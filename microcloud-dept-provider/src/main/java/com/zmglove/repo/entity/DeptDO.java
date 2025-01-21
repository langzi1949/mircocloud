package com.zmglove.repo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@TableName(value = "tb_dept", autoResultMap = true)
public class DeptDO {

    private Long id;

    private String name;
}
