package com.nb.wm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nb.wm.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
