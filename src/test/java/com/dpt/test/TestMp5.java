package com.dpt.test;

import com.dpt.mp.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 邓鹏涛
 * @date 2019/5/19 20:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMp5 {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testLogicDelete() {
        Integer effect = userMapper.deleteById(1);
        System.out.println(effect);
    }

    @Test
    public void stat() {
        Runnable runnable = () -> {
            System.out.println("thread1...");
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2...");
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        System.out.println("mainThread...");
        thread1.start();
    }

}
