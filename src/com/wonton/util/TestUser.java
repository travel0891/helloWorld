package com.wonton.util;

public class TestUser {

	private Integer intId;
	private String charId;
	private String name;
	private Integer age;

	public Integer getIntId() {
		return intId;
	}

	@Override
	public String toString() {
		return "TestUser [intId=" + intId + ", charId=" + charId + ", name=" + name + ", age=" + age + "]";
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getCharId() {
		return charId;
	}

	public void setCharId(String charId) {
		this.charId = charId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
