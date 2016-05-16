package com.wonton.test;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wonton.mapping.MyBatisUtil;
import com.wonton.util.TestUser;

public class TestCRUDByXmlMapper {

	@Test
	public void testAdd() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.wonton.mapping.TestMapping.addUser";
		TestUser user = new TestUser();
		user.setCharId(UUID.randomUUID().toString());
		user.setName("opq");
		user.setAge(20);
		int retResult = sqlSession.insert(statement, user);
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testDelete() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.wonton.mapping.TestMapping.deleteUser";
		int retResult = sqlSession.delete(statement, 5);
		sqlSession.close();
		System.out.println(retResult);
	}

	@Test
	public void testGetAll() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.wonton.mapping.TestMapping.allUser";
		List<TestUser> lstUsers = sqlSession.selectList(statement);
		sqlSession.close();
		System.out.println(lstUsers);
	}
}