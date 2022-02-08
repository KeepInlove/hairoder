package com.gxy.hairorder.service;


import com.gxy.hairorder.entity.User;
import com.gxy.hairorder.req.UserReq;
import com.gxy.hairorder.resp.PageResp;
import com.gxy.hairorder.resp.UserResp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

/**
 * @author GUO
 * @Classname UserServiceTest
 * @Description TODO
 * @Date 2021/12/8 13:38
 */
@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Autowired
    UserService userService;
    @Test
    public void list() {
        UserReq userReq=new UserReq();
        userReq.setPage(0);
        userReq.setSize(3);
        PageResp<UserResp> list = userService.list(userReq);
        log.info(list.toString());
    }
    @Test
    public void md5(){
        String s="85a86bea0cff860c343e5c9b83381e2e";
        String s1 = DigestUtils.md5DigestAsHex(s.getBytes());
        log.info(s1);

    }
}