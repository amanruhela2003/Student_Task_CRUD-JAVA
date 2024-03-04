
public class Student {
	private int rollno;
	private String sname;
	private String branch;
	private int ctc;
	
	Student(int rollno,String sname,String branch,int ctc)
	{
		this.rollno=rollno;
		this.sname=sname;
		this.branch=branch;
		this.ctc=ctc;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	
	public String toString(){
		return rollno+" "+sname+" "+branch+" "+ctc;
	}

}
