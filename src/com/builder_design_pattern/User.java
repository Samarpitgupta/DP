package com.builder_design_pattern;

public class User {

	private String userName;
	private String pass;
	private int mob;
	
	private User(Builder b)
	{
		this.userName=b.userName;
		this.pass=b.pass;
	//	this.mob=b.mob;
	}
	
	public static class Builder
	{
		private String userName;
		private String pass;
		private int mob;
		
		public Builder(String userName,String pass)
		{
			this.userName=userName;
			this.pass=pass;
		}
		public Builder getMobDetails(int mob)
		{
			this.mob=mob;	
			return this;
		}
		public User build()
		{
			return new User(this);
		}
	
	}
}
