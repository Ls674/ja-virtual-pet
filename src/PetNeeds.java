public class PetNeeds {
    public String petName;
    public int hunger;
    public int thirst;
    public int lonliness;
    public int bladder;
    public int exhaustion;
    public int dirtiness;
    public int hapiness;

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
    public int getHunger() {
        return hunger;
    }
    public int getLonliness() {
        return lonliness;
    }
    public int getBladder() {
        return bladder;
    }
    public int getExhaustion() {
        return exhaustion;
    }
    public int getDirtiness() {
        return dirtiness;
    }
    public int getHapiness() {
        return hapiness;
    }
}

