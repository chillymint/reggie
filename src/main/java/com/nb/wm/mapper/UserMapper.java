package com.nb.wm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nb.wm.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
