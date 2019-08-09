package com.dpt.mp.mapper;

import com.dpt.mp.beans.Employee;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dpt
 * @since 2019-05-13
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    int deleteAll();

}
