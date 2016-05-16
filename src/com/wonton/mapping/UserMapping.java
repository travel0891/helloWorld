package com.wonton.mapping;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wonton.util.*;

public class UserMapping {

	public static List<TestUser> GetAllUser() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.wonton.mapping.TestMapping.allUser";
		List<TestUser> user = sqlSession.selectList(statement);
		sqlSession.close();
		return user;
	}
}