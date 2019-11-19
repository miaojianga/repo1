package cn.sintro.controller;

import cn.sintro.mapper.UserMapper;
import cn.sintro.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("query")
    public List<User> queryUserList() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
