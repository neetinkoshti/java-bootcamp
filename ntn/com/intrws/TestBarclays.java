package ntn.com.intrws;

public class TestBarclays {

    public static void main(String[] args) {

    }

}

/*

Class SingletonDemo{

	private static final SingletonDemo instance ;

	private SingletonDemo(){

	}

	public SingletonDemo getInstance(){

		if(instance == null){
			syncrozied(SingletonDemo.class){

				if(instance==null){

					return new SingletonDemo();
				}
			}
		}
		return instance;
	}
}

class A{

	m1() throws
}





List<Employee> empLists ;
empLists.stream().sorted( (e1,e2) -> e1.getSalary() > e2.getSalary() ).collect(Collectors.toList());



Class Employee implement Comparator{

	double salary;
	String name;

	@override
	public int compare(Object o1 , Object o2){

		Employee e1 = (Employee)o1 ;
		Employee e2 = (Employee)o2 ;

		return e1.getSalary() > e2.getSalary();
	}
}


class OddNum implements Runnable {

int num ;

@override
public void run( int num ){

	if(num % 2 != 0){

		sout("odd num : "+ num);
		notify();
	}else{
		wait();
	}
}

}

class EvenNum implement Runnable{

public void run(int num){

	if(num%2==0){
		sout("even num" +num);

		notify();
	}else{
		wait();
	}
}

}


class MainClass {

psvm(){

	OddNum 01 = new OddNum();
	EvenNum  e1 = new EvenNum();

	Thread t1 = new Thread(01);
	Thread t2 = new Thread (e1);


	t1.start();
	t2.start();

}

}


select min(Salary)
(
	select salary
	from Employee order by salary desc
) where limit < 4














 */
