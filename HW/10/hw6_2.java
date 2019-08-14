import java.util.*;

class student{
	private String name;
	private int age;
	private double score;

	student(int age, double score, String name){
		setAge(age);
		setScore(score);
		setName(name);
	}
	student(){
		this(20, 3.0, "홍길동");
	}
	void setAge(int age){
		if(age >=0 && age < 200)
			this.age = age;
		else
			this.age = 20;
	}
	void setScore(double score){
		if(score >=0 && score <= 4.3)
			this.score = score;
		else
			this.score = 3.0;
	}
	void setName(String name){
		this.name = name;
	}

	int getAge(){
		return age;
	}
	double getScore(){
		return score;
	}
	String getName(){
		return name;
	}

	public String toString(){
		return String.format("이름: %s, 나이: %d, 학점: %.1f\n", name, age, score);
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
		student st = new student(age, score, name);

		System.out.println("학점을 4.3으로 변경합니다.");
		st.setScore(4.3);
		System.out.print(st.toString());
	}
}
