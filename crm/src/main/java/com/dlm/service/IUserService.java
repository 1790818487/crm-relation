package com.dlm.service;

import com.dlm.dto.ResponseDto;
import com.dlm.dto.login.RequestLogin;
import com.dlm.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
public interface IUserService extends IService<User> {
    public ResponseDto userLogin(RequestLogin requestLogin);
}
