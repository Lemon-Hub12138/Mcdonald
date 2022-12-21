package com.itheima.mcdonald.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mcdonald.entity.ShoppingCart;
import com.itheima.mcdonald.mapper.ShoppingCartMapper;
import com.itheima.mcdonald.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
