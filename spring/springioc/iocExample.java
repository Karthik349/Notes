// Without Spring: we create the object ourselves using 'new'

Employee emp = new Employee("Karthik");
emp.show();


// With Spring IoC: the ApplicationContext creates and manages the object for us
<!-- applicationContext.xml -->
<bean id="employeeBean" class="com.example.Employee">
    <constructor-arg value="Karthik"/>
</bean>
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Employee emp = (Employee) context.getBean("employeeBean");
emp.show();
