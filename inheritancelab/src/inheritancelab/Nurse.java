package inheritancelab;

 class Nurse extends HospitalEmployee
 {
		private int numOfPatients;
		public Nurse(String name, int number)
		{
			super(name,number);
			this.numOfPatients=6;
		}
		public int getNumOfPatients() {
			return numOfPatients;
		}
		public void setNumOfPatients(int numOfPatients) {
			this.numOfPatients = numOfPatients;
		}
		public String toString(){  
			  return name+" "+number+" "+numOfPatients+" "+"Patients";  
		}
		@Override
		public void work()
		{
		System.out.println (name + " works for the hospital. "+name+" is a nurse with "+numOfPatients+" patients.");
		}
	}