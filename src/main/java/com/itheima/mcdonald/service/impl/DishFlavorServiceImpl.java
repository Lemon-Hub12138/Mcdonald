package com.itheima.mcdonald.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mcdonald.entity.DishFlavor;
import com.itheima.mcdonald.mapper.DishFlavorMapper;
import com.itheima.mcdonald.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
