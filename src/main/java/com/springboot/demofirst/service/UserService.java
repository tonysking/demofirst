package com.springboot.demofirst.service;

import com.springboot.demofirst.enums.UserSexEnum;
import com.springboot.demofirst.mapper.UserMapper;
import com.springboot.demofirst.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //通过id查询用户
    public User queryById(int id){

        return this.userMapper.selectByPrimaryKey(id);
    }

    //出现异常回滚
    @Transactional
    public void deleteById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }

    //查找男性用户
    public List<User> findUpAll(){

        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        //criteria.andEqualTo("sex",1);
        criteria.andEqualTo("sex", UserSexEnum.MALE.getIndex());

        return this.userMapper.selectByExample(example);
    }
}
