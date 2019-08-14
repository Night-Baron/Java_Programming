class Member{
	String name;
	int age;
	static int mnum=0;
	
	Member(){
		System.out.println("디폴트 생성자를 통해 동호회 멤버 생성");
		mnum++;
	}
	Member(String name, int age){
		System.out.println("이름과 나이가 존재하는 동호회 멤버 생성");
		this.name = name;
		this.age = age;
		mnum++;
	}

}
class hw6_3{
	public static void main(String args[]){
		Member m1 = new Member();
		Member m2 = new Member();
		//Member m3 = new Member();
		Member m4 = new Member("홍길동", 20);
		System.out.printf("이 동호회의 멤버수는 %d명 입니다.\n", Member.mnum);
	}
}

