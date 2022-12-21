package com.itheima.mcdonald.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mcdonald.entity.AddressBook;
import com.itheima.mcdonald.mapper.AddressBookMapper;
import com.itheima.mcdonald.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
