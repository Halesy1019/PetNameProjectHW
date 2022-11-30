package PetNameProject;
//Naming variables
class Pet {
    private String petName;
    private int petAge;
    private String petLocation;
    private String petType;

    public Pet() {
        petName = "";
        petAge = 0;
        petLocation = "";
        petType = "";
    }

    public Pet(String petName, int petAge, String petLocation, String petType) {
        this.petName = petName;
        this.petAge = petAge;
        this.petLocation = petLocation;
        this.petType = petType;
    } 
//Get Method
    public String getName() {
        return petName;
    }

    public int getAge() {
        return petAge;
    }

    public String getType() {
        return petType;
    }
//Set Method
    public void setName(String petName) {
        this.petName = petName;
    }

    public void setAge(int petAge) {
        this.petAge = petAge;
    }

    public void setLocation(String petLocation) {
        this.petLocation = petLocation;
    }
}