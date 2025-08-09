package org.example.designpattern.BuilderPattern;

public class User {
      private String name;
      private String lastName;
      private int age;
      private String address;
      private String phone;
      private String panNo;
      
        private User(UserBuilder userBuilder) {
		this.name = userBuilder.name;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.address = userBuilder.address;
		this.phone = userBuilder.phone;
		this.panNo = userBuilder.panNo;
	}

       // we can write getters ony 


	public static class UserBuilder{
		
		 private String name;
	      private String lastName;
	      private int age;
	      private String address;
	      private String phone;
	      private String panNo;
	      
	      public UserBuilder() {
	    	  
	      }

		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder setPanNo(String panNo) {
			this.panNo = panNo;
			return this;
		}
		
		public User build() {
			return new User(this);
		}

		}

	@Override
	public String toString() {
		return "UserBuilder [name=" + name + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", phone=" + phone + ", panNo=" + panNo + "]";
    	  
      }
}
