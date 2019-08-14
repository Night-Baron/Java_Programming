class Player{
	void play(){
		System.out.print("연주합니다.");
	}
}

class 피아니스트 extends Player{
	@Override
	void play(){
		System.out.println("피아노를 연주합니다.");
	}
}
class 첼리스트 extends Player{
	@Override
	void play(){
		System.out.println("첼로를 연주합니다.");
	}
}
class 바이올리니스트 extends Player{
	@Override
	void play(){
		System.out.println("바이올린을 연주합니다.");
	}
}
class Director{
	void direct(Player [] players){
		for(int i=0;i<players.length;i++){
			players[i].play();
		}
		/*
		for(Player p:players){
			p.play();
		}
		*/
	}
}

class test4{
	public static void main(String [] args){
		Director d = new Director();
		
		
		//배열: 자료형이 같은 자료들을 그룹핑할 수 있음
		
		//정수 100개 저장가능한 배열 arr 선언
		int [] arr = new int [100];
	   	//성분이 1,2,3,4,5인 배열 arr1 선언
		int [] arr1 = {1,2,3,4,5};	
		//연주자 10명의 배열
		Player [] players = {new 피아니스트(), new 피아니스트(), new 첼리스트(), new 첼리스트(), new 첼리스트(),
			new 바이올리니스트(), new 바이올리니스트(), new 바이올리니스트(), new 바이올리니스트(), new 바이올리니스트()};

		/*
		Player p1 = new 피아니스트();
		Player p2 = new 피아니스트();
		
		Player c1 = new 첼리스트();
		Player c2 = new 첼리스트();
		Player c3 = new 첼리스트();

		Player b1 = new 바이올리니스트();
		Player b2 = new 바이올리니스트();
		Player b3 = new 바이올리니스트();
		Player b4 = new 바이올리니스트();
		Palyer b5 = new 바이올리니스트();
		Player b6 = new 바이올리니스트();
		*/

		d.direct(players);
	}
}
