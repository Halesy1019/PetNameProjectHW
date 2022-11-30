package PetNameProject;

public class PetNameProjectHW {

	public static void main(String[] args) {
		
		Pet fluffy = new Pet();
		Pet fido = new Pet("Fido", 6, "", "");
		
		fluffy.setName("Fluffy");
		
		System.out.println("Fluffy's name is: " + fluffy.getName());
		
		Holiday day = new Holiday();
		Holiday month = new Holiday("Christmas", "Tuesday", "", "");
		
		day.getNameOfHoliday();
		
		System.out.println("The holiday's name is: " + day.getNameOfHoliday());
		
		

	}

}
