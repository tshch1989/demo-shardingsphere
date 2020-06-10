package com.example.demoshardingsphere.interfaces.web.controller;

import com.example.demoshardingsphere.infrastructure.dao.entity.User;
import com.example.demoshardingsphere.infrastructure.dao.idgen.IdGen;
import com.example.demoshardingsphere.infrastructure.dao.mapper.AddressMapper;
import com.example.demoshardingsphere.infrastructure.dao.mapper.OrderItemMapper;
import com.example.demoshardingsphere.infrastructure.dao.mapper.OrderMapper;
import com.example.demoshardingsphere.infrastructure.dao.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    private final UserMapper userMapper;
    private final AddressMapper addressMapper;
    private final OrderMapper orderMapper;
    private final OrderItemMapper orderItemMapper;

    public TestController(UserMapper userMapper,
                          AddressMapper addressMapper,
                          OrderMapper orderMapper,
                          OrderItemMapper orderItemMapper) {
        this.userMapper = userMapper;
        this.addressMapper = addressMapper;
        this.orderMapper = orderMapper;
        this.orderItemMapper = orderItemMapper;
    }

    @GetMapping("/init.do")
    @ResponseBody
    public String init(){
        User user = User.builder()
                .assistedQueryPwd("qpwd")
                .pwd("pwd")
                .userName("username")
                .userNamePlain("usernameplain")
                .build();
        for (int i = 0; i < 100; i++) {
            user.setUserId(IdGen.getId());
            userMapper.insert(user);
            log.info("{}", user);
        }
        return "success";
    }

}
