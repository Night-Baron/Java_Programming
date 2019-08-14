class DogTest{
	public static void main(String args[]){
		Dog myDog = new Dog();
		Dog yourDog = new Dog();

		System.out.println(myDog.getName());
		myDog.SetName("철수");
		System.out.println(myDog.getName());

		System.out.println(myDog.getFull());

		if(myDog.getFull() >=5)
			myDog.play();
		else
			myDog.eat(10);

		if(myDog.getFull() >= 5)
			myDog.play();
		else
			myDog.eat(10);

	}
}
