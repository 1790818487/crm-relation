package com.dlm;

import cn.hutool.core.util.IdUtil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CRMApplication {

    @Test
    public void test01(){
        String s = IdUtil.randomUUID();
        System.out.println(s);
    }

}
