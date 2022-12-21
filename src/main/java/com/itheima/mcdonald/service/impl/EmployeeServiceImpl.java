package com.itheima.mcdonald.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mcdonald.entity.Employee;
import com.itheima.mcdonald.mapper.EmployeeMapper;
import com.itheima.mcdonald.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
