package com.builder;
public class Actor {
	
	private int id;
	private String name;
	private String surName;
	private String gender;
	private String city;
	private int age;
	private String maxQualification;
	private String genre;
	private String localAddress;
	
	public Actor(ActorBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.gender = builder.gender;
		this.age = builder.age;
	}
	
	
	public static class ActorBuilder {
		
		private int id;
		private String name;
		private String gender;
		private int age;
		
		public ActorBuilder(int id, String name, String gender, int age) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
		
		public Actor build() {
			return new Actor(this);
		}
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getMaxQualification() {
		return maxQualification;
	}


	public void setMaxQualification(String maxQualification) {
		this.maxQualification = maxQualification;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getLocalAddress() {
		return localAddress;
	}


	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}


	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", surName=" + surName + ", gender=" + gender + ", city=" + city
				+ ", age=" + age + ", maxQualification=" + maxQualification + ", genre=" + genre + ", localAddress="
				+ localAddress + "]";
	}
	
	
	

}
