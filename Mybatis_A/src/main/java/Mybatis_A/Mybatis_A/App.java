package Mybatis_A.Mybatis_A;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String resource = "conf.xml";
		InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		// 查询一条
		// String statement = "me.gacl.mapping.userMapper.getUser";//
		// 映射sql的标识字符串
		// User user = session.selectOne(statement, 2);
		// System.out.println(user);

		// 查询全部
		String statement = "me.gacl.mapping.userMapper.getAll";// 映射sql的标识字符串
		List<User> list = session.selectList(statement);
		System.out.println(list);

		// 添加
		// User userA = new User();
		// userA.setId(3);
		// userA.setAge(32);
		// userA.setName("王菲");
		// String statement = "me.gacl.mapping.userMapper.insertAuthor";//
		// 映射sql的标识字符串
		// int result = session.insert(statement, userA);
		// session.commit();
		// System.out.println(result);

		// 删除
		// String statement =
		// "me.gacl.mapping.userMapper.deleteUserById";//映射sql的标识字符串
		// session.delete(statement, 1); session.commit();

		// 更新数据
		// User userA = new User();
		// userA.setId(15);
		// userA.setAge(32);
		// userA.setName("王菲111");
		// String statement = "me.gacl.mapping.userMapper.updateOne";//
		// 映射sql的标识字符串
		// int result = session.update(statement, userA);
		// session.commit();
		// System.out.println(result);

	}
}
