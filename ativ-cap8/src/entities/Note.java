package entities;

public class Note {

	public String name;
	public double noteFirstGrade;
	public double noteSecondGrade;
	public double noteThirdGrade;
	
	public double finalGrade() {
		return noteFirstGrade + noteSecondGrade + noteThirdGrade;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		return name + ", note: " + String.format("%.2f", finalGrade());
	}
}
