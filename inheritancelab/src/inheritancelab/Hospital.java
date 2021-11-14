package inheritancelab;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalEmployee h=new HospitalEmployee("Vito", 123);
		System.out.println(h.toString());
		Doctor d=new Doctor("Michael",234);
		System.out.println(d.toString());
		Surgeon s=new Surgeon("Vincent", 645);
		System.out.println(s.toString());
		Nurse n=new Nurse("Sonny",789);
		System.out.println(n.toString());
		h.work();
		d.work();
		s.work();
		n.work();
	}

}
	