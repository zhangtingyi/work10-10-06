package jdbc;

@Service
@Transational
public class JdbcTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcTest jdbcTest=applicationContext.getBean("jdbcTest");



    }
}
