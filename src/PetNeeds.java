

public class PetNeeds {
    public String petName;
    private int hunger;
    private int thirst;
    private int lonliness;
    private int bladder;
    private int exhaustion;
    private int dirtiness;
    private int hapiness;

    public PetNeeds(String newPetName) {
    petName = newPetName;
    hunger = 1;
    thirst = 1;
    lonliness = 1;
    bladder = 1;
    exhaustion = 1;
    dirtiness = 1;
    hapiness =1;
    }
    

    public void tick() {
        petName += 1;
        hunger += 1;
        thirst += 1;
        lonliness += 1;
        bladder += 1;
        exhaustion += 1;
        dirtiness += 1;
        hapiness += 1;
    }
    
public String toString() {
String.format("Name %s\n,    " + hunger, thirst, lonliness, bladder, exhaustion, dirtiness, hapiness);
String S; 
S = "Name: " + petName;
return S;
}


}
