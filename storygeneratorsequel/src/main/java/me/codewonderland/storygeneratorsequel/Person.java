package me.codewonderland.storygeneratorsequel;

public class Person {

    private String name;
    private String weapon;
    private String uniqueTrait;
    static private String weaponsList[] = {"Unicorn Horn" , "Macinsword" , "Wand of Rainbows" , "Sword of Sadness" , "Tofu Trident"};
    static private String traitsList[] = {"unique" , "strong" , "brave" , "cruel" , "smart" , "sad" , "hungry"};

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    // Only put methods between these lines, but mimick the ones above
    // ---------------

    public String getUniqueTrait() {
        return uniqueTrait;
    }

    public void setUniqueTrait(String uniqueTrait) {
        this.uniqueTrait = uniqueTrait;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    // ---------------

    public void randomWeapon() {
        this.setWeapon(weaponsList[(int) (Math.random() * weaponsList.length)]);
    }

    public void randomTrait() {
        this.setUniqueTrait(traitsList[(int) (Math.random() * traitsList.length)]);
    }

}