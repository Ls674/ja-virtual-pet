


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
    
    public void changehunger(int newHunger) {
        hunger += newHunger;
    }
    public void changeThirst(int newThirst) {
        thirst += newThirst;
    }
    public void changeLonliness(int newLonliness) {
        lonliness += newLonliness;
    }
    public void changeBladder(int newBladder) {
        bladder += newBladder;
    }
    public void changeDirtiness(int newDirtiness) {
        dirtiness = newDirtiness;
    }
    public void changeHappiness(int newHapiness) {
        hapiness = newHapiness;
    }
    
    public void setName(String newName) {
        this.petName = newName;
    }
    public void setThirst(int newThirst) {
        this.thirst = newThirst;
    }
    public void setHunger(int newHunger) {
        this.hunger = newHunger;
    }
    public void setLonliness(int newLonliness) {
        this.lonliness = newLonliness;
    }
    public void setBladder(int newBladder) {
        this.bladder = newBladder;
    }
    public void setExhaustion(int newExhaustion) {
        this.exhaustion = newExhaustion;
    }
    public void setDirtiness(int newDirtiness) {
        this.dirtiness = newDirtiness;
    }
    public void setHapiness(int newHapiness) {
        this.hapiness = newHapiness;
    }
    public String getName() {
        return petName;
    }
    public int getThirst() {
        return thirst;
    }



}


