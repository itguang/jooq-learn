package com.guang.jooqlearn.controllers;

import com.guang.jooqlearn.gen.Tables;
import com.guang.jooqlearn.gen.tables.daos.UserDao;
import com.guang.jooqlearn.gen.tables.pojos.User;
import com.guang.jooqlearn.gen.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guang
 * @since 2019-04-03 18:50
 */
@RestController
public class IndexController {


    @Autowired
    UserDao userDao;


    @Autowired
    DSLContext dslContext;




    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }


    /**
     * 查询结果转 record
     * @return
     */
    @RequestMapping("/user")
    public Object getUser(){

        List<UserRecord> userRecords = dslContext.selectFrom(Tables.USER).fetchInto(UserRecord.class);

        ArrayList<User> users = new ArrayList<>();
        userRecords.forEach(userRecord -> {
            User user = userRecord.into(User.class);
            users.add(user);
        });

        return users;
    }

    /**
     * 查询结果转 pojo
     * @return
     */
    @RequestMapping("/list")
    public Object getUser2(){
        List<User> userList = dslContext.selectFrom(Tables.USER).fetchInto(User.class);
        return userList;

    }

    @RequestMapping("/insert")
    public Object insert(@RequestBody User user){

        userDao.insert(user);

        return "ok";
    }





}
