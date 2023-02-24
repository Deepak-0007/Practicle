package method_overlaoding;
class exam{
	int marks() {
	return 0;
}}
class comp extends exam{
int marks() {
	return 80;
}}
class math extends exam{
	int marks() {
		return 70;
	}
}
class science extends exam{
	int marks () {
		return 50;
	}
}
class eng extends exam{
	int marks () {
		return 90;
	}
}

public class overridding {
public static void main(String[] args) {
	exam Exam;
	Exam=new science ();
	System.out.println(Exam.marks());
	Exam=new eng();
	System.out.println(Exam.marks());
}

}
