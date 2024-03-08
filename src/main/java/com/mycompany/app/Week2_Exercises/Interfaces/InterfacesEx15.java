package com.mycompany.app.Week2_Exercises.Interfaces;

interface HistoryEx15 {
	void u();
	void v();
}

interface ExamEx15 {
	void w();
	void x();
}

interface LabsEx15 {
	void y();
	void z();
}

interface WorkupEx15 extends HistoryEx15, ExamEx15, LabsEx15 {
	void zz();
}

abstract class DoctorEx15 {
	@SuppressWarnings("unused")
	private int i = 0;
	abstract void doc();
}

class AnesthesiologistEx15 extends DoctorEx15 implements WorkupEx15 {
	@SuppressWarnings("unused")
	private int j = 0;
	public void u() {}
	public void v() {}
	public void w() {}
	public void x() {}
	public void y() {}
	public void z() {}
	public void zz() {}
	public void doc() {} // must override abstract method in Doctor 
}

public class InterfacesEx15 {
	public static void m1(HistoryEx15 history) { history.v(); }
	public static void m2(ExamEx15 exam) { exam.w(); }
	public static void m3(LabsEx15 labs) { labs.y(); } 
	public static void m4(WorkupEx15 workup) { workup.zz(); }
	public static void main(String[] args) {
		AnesthesiologistEx15 anes = new AnesthesiologistEx15();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}