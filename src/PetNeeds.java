


public class PetNeeds {
    public static void main(String[]args) {}
    public PetNeeds() {
    }


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


public String getPetName() {
    return petName;
}


public void setPetName(String petName) {
    this.petName = petName;
}


public int getHunger() {
    return hunger;
}


public void setHunger(int hunger) {
    this.hunger = hunger;
}


public int getThirst() {
    return thirst;
}


public void setThirst(int thirst) {
    this.thirst = thirst;
}


public int getLonliness() {
    return lonliness;
}


public void setLonliness(int lonliness) {
    this.lonliness = lonliness;
}


public int getBladder() {
    return bladder;
}


public void setBladder(int bladder) {
    this.bladder = bladder;
}


public int getExhaustion() {
    return exhaustion;
}


public void setExhaustion(int exhaustion) {
    this.exhaustion = exhaustion;
}


public int getDirtiness() {
    return dirtiness;
}


public void setDirtiness(int dirtiness) {
    this.dirtiness = dirtiness;
}


public int getHapiness() {
    return hapiness;
}


public void setHapiness(int hapiness) {
    this.hapiness = hapiness;
}


}


