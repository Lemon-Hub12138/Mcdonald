package com.itheima.mcdonald.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.mcdonald.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
