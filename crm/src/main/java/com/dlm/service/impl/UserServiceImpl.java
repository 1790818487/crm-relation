package com.dlm.service.impl;

import com.dlm.dto.ResponseDto;
import com.dlm.dto.login.RequestLogin;
import com.dlm.pojo.User;
import com.dlm.mapper.UserMapper;
import com.dlm.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public ResponseDto userLogin(RequestLogin requestLogin) {
        //判断验证码

        //使用账号去数据库查询数据


        return null;
    }
}
