import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter distances(Km and m):");
	double km2=sc.nextDouble();
	double m2=sc.nextDouble();
	System.out.println("Enter distances(Km and m):");
	double km3=sc.nextDouble();
	double m3=sc.nextDouble();
	distance d1=new distance(km2,m2);
	distance d2=new distance(km3,m3);
	distance d3=d1.add(d2);
	d3.display();
	sc.close();
  }
}

class distance{
	double km,m;
	distance(){
	km=0;	
	m=0;
	}
	distance(double km1,double m1){
		km=km1;
		m=m1;
	}
	distance add(distance d){
		distance t=new distance();
		t.km=km+d.km;
		t.m=m+d.m;
		if(t.m>=1000){
			t.km=t.km+1;
			t.m=t.m-1000;
		}
		return t;
	}
	void display(){
	System.out.println("Adding both together...");
	System.out.println("Distance is "+km+" km. and "+m+"m.");
	} 
}