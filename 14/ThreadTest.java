class ThreadTest{
	static void print(){
		for(int i=0;i<10;i++){
			System.out.println(i+1);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
	public static void main(String args[]){
			print();
	}
}

