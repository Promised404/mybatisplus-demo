package com.dpt.test;



/**
 * @author 邓鹏涛
 * @date 2019/5/12 14:35
 */
public class TestMp {

//    private ApplicationContext application = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//
//    private EmployeeMapper employeeMapper = (EmployeeMapper) application.getBean("employeeMapper", EmployeeMapper.class);
//
//    @Test
//    public void testDataSource() throws Exception{
//        DataSource dataSource = application.getBean("dataSource", DataSource.class);
//        System.out.println("----------------------" + dataSource);
//        Connection connection = dataSource.getConnection();
//        System.out.println("----------------------" + connection);
//        System.out.println(employeeMapper);
//    }
//
//    @Test
//    public void testCommonInsert() {
//        Employee employee = new Employee();
//        employee.setLastName("MP");
//        employee.setEmail("mp@atguigu.com");
//        employee.setGender(1);
//        employee.setAge(22);
//        employee.setSalary(20000d);
//        Integer effectNum = employeeMapper.insert(employee);
//        System.out.println(effectNum);
//        // 获取主键值:mybatisplus 自动获取主键值
//        //           mybatis 需要在xml<insert useGeneratedKeys= "true" , keyProperty="id"></insert>
//        System.out.println(employee.getId());
//    }
//
//    @Test
//    public void selectById() {
//        Employee employee = employeeMapper.selectById(1);
//        System.out.println(employee);
//    }
//
//    @Test
//    public void selectAll() {
//        List<Employee> employees = employeeMapper.selectList(null);
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
//    }
//
//
//    @Test
//    public void selectByType() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("last_name", "mp");
//        map.put("gender", 0);
//        List<Employee> employees = employeeMapper.selectByMap(map);
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
//    }
//
//    @Test
//    public void selectByIds() {
////        Map<String, Object> map = new HashMap<String, Object>();
////        map.put("last_name", "mp"); //key 只能为字段名，不能为属性名
////        map.put("gender", 0);
//        List<Integer> ids = new ArrayList<Integer>();
//        ids.add(1);
//        ids.add(2);
//        List<Employee> employees = employeeMapper.selectBatchIds(ids);
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
//    }
//
//    @Test
//    public void testWarrp() {
//        List<Employee> employees = employeeMapper.selectList(new EntityWrapper<Employee>()
//                .eq("last_name", "Tom")
//        );
//        System.out.println(employees);
//    }

}
