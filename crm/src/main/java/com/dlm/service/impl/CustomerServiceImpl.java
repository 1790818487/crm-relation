package com.dlm.service.impl;

import com.dlm.pojo.Customer;
import com.dlm.mapper.CustomerMapper;
import com.dlm.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
