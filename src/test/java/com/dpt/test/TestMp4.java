package com.dpt.test;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.dpt.mp.beans.Employee;
import com.dpt.mp.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 邓鹏涛
 * @date 2019/5/19 14:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件的位置
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestMp4 {

    @Autowired
    private EmployeeMapper employeeMapper;
    /**
     * 测试分页插件
     */
    @Test
    public void testPage() {
        Page<Employee> page = new Page<>(-1, 3);
        List<Employee> employees = employeeMapper.selectPage(page, null);
        System.out.println(employees);
        System.out.println("==================获取分页信息=====================");
        System.out.println("总条数：" + page.getTotal());
        System.out.println("当前页码：" + page.getCurrent());
        System.out.println("总页码：" + page.getPages());
        System.out.println("每页显示的条数：" + page.getSize());
        System.out.println("是否有上一页：" + page.hasPrevious());
        System.out.println("是否有下一页：" + page.hasNext());
    }

    @Test
    public void testSQLExplain() {
        employeeMapper.delete(null);// 全表删除
    }

    /**
     * 性能分析插件
     */
    @Test
    public void testPerformance() {
        Employee employee = new Employee();
        employee.setLastName("dpt");
        Employee employee1 = employeeMapper.selectOne(employee);
        System.out.println(employee1);
    }

    /**
     * 测试乐观锁
     */
    @Test
    public void testOptimisticLocker() {
        Employee employee = new Employee();
        employee.setId(13);
        employee.setLastName("dddppps");
        employee.setVersion(3);
        employeeMapper.updateById(employee);
    }

    /**
     * 自定义注入sql
     */
    @Test
    public void sqlInjector() {
        int i = employeeMapper.deleteAll();
        System.out.println(i);
    }
}
