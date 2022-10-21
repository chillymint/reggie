package com.nb.wm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nb.wm.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
