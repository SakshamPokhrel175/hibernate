//model class are entity. Here Employee is model class
//1.Any class which have real time Entity is known as model class
//QN: What is model class? How it will be call in tester?

/*
   Here in 
   1. Model class
   			we required  @Entity 
 */
public class Employee {

		int id;
		String name;
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

	

}
