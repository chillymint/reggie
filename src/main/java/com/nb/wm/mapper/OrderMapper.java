package com.nb.wm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nb.wm.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}