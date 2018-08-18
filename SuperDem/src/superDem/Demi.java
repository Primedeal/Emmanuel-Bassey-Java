package superDem;

public class Demi{  
	int book;
	int ken;
	int stapler;
	int pins;
	
	int getResult() {
		
		return (book + ken + stapler + pins );
	}
	Demi(){
		book = 5;
		ken = 10;
		stapler = 15;
		pins= 20;
	}
	Demi(int b, int k, int s, int p){
		book =b;
		ken = k;
		stapler=s;
		pins=p;
		
	}
	
       }  
