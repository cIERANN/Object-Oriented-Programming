
public class Table_of_Student_Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Sammy", "Jacob", "Jane", "Tadgh", "Sarah"};
        int[] labPoints = {45, 30, 36, 43, 49};
        int[] bonusPoints = {7, 4, 5, 7, 10};
        
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t\tStudent Points\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n");
        
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
        
        for (int i = 0; i < names.length; i++) {
            int total = labPoints[i] + bonusPoints[i];
            System.out.println(names[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + total);
        }
	}

}
