package assigne.himline.com;



public class OverLoading {
	public int add(int a,int b){
		return(a+b);
	}
	public int add(int a,int b,int c){
		return(a+b+c);
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		OverLoading olc = new OverLoading();
		
			
		System.out.println(olc.add(1,2));
		System.out.println(olc.add(1,2,3));
		
	}

}
