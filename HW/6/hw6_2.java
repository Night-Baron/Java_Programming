import java.util.*;
class student{
	private String name;
	private int age;
	private double score;

	student(){
		this("홍길동", 20, 3.0);
	}
	student(String name, int age, double score){
		setName(name);
		setAge(age);
		setScore(score);
	}
	String getName(String name){
		return this.name;
	}
	int getAge(int age){
		return this.age;
	}
	double getScore(double score){
		return this.score;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		if(age >= 0 && age < 200)
			this.age = age;
		else
			this.age = 20;
	}
	void setScore(double score){
		if(score >= 0 && score <= 4.3)
			this.score = score;
		else
			this.score = 3.0;
	}
	public String toString(){
		return String.format("이름: %s, 나이: %d, 학점: %.1f", name, age, score);
	}
}

class hw6_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String name;int age;double score;

		System.out.print("이름: ");
		name = s.nextLine();
		System.out.print("나이: ");
		age = s.nextInt();
		System.out.print("학점: ");
		score = s.nextDouble();

		student st = new student(name, age, score);
		System.out.println("학점을 4.3으로 변경합니다.");
		st.setScore(4.3);
		System.out.println("학생정보");
		System.out.println(st.toString());
	}
}
