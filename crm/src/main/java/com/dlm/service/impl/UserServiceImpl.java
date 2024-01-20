package com.dlm.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dlm.dto.ResponseDto;
import com.dlm.dto.login.RequestLogin;
import com.dlm.pojo.User;
import com.dlm.mapper.UserMapper;
import com.dlm.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.convert.RedisData;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public ResponseDto userLogin(RequestLogin requestLogin) {
        //判断验证码,去reids中找
        String code = (String) redisTemplate.opsForValue().get("uuid");
        if (code==null)
            return new ResponseDto(20002,"无效的验证码",null);
        if (requestLogin.getCode().equalsIgnoreCase(code)) {
            return new ResponseDto(20002,"验证码错误",null);
        }

        //使用账号去数据库查询数据
        User user = this.getOne(
                Wrappers.lambdaQuery(new User())
                        .eq(User::getAccount, requestLogin.getUsername())
        );
        if (user!=null)
            return new ResponseDto(20002,"账户不存在",null);


        return null;
    }
}
