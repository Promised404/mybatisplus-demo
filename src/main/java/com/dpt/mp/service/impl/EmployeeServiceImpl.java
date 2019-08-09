package com.dpt.mp.service.impl;

import com.dpt.mp.beans.Employee;
import com.dpt.mp.mapper.EmployeeMapper;
import com.dpt.mp.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dpt
 * @since 2019-05-13
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
