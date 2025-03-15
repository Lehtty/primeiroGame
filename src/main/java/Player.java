import java.awt.*;

public class Player extends Rectangle {
    public boolean right;
    public boolean up;
    public boolean down;
    public boolean left;
    private int speed = 4;
    private int currentSpeed;
    private String name;
    private int health;
    private int attackPower;
    private int defense;
    private int experiencePoints;
    private int level;
    private int gold;
    private int currentWeapon;
    private int currentArmor;
    private int currentHealthPotion;
    private int currentManaPotion;
    private int currentStrengthPotion;

    public Player(int x, int y) {
        super(x, y, 32, 32);
    }

    public void tick() {
        if (this.right && World.isFree(this.x + this.speed, this.y)) {
            this.x += this.speed;
        } else if (this.left && World.isFree(this.x - this.speed, this.y)) {
            this.x -= this.speed;
        }

        if (this.up && World.isFree(this.x, this.y - this.speed)) {
            this.y -= this.speed;
        } else if (this.down && World.isFree(this.x, this.y + this.speed)) {
            this.y += this.speed;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(int currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public int getCurrentArmor() {
        return currentArmor;
    }

    public void setCurrentArmor(int currentArmor) {
        this.currentArmor = currentArmor;
    }

    public int getCurrentHealthPotion() {
        return currentHealthPotion;
    }

    public void setCurrentHealthPotion(int currentHealthPotion) {
        this.currentHealthPotion = currentHealthPotion;
    }

    public int getCurrentManaPotion() {
        return currentManaPotion;
    }

    public void setCurrentManaPotion(int currentManaPotion) {
        this.currentManaPotion = currentManaPotion;
    }

    public int getCurrentStrengthPotion() {
        return currentStrengthPotion;
    }

    public void setCurrentStrengthPotion(int currentStrengthPotion) {
        this.currentStrengthPotion = currentStrengthPotion;
    }
}
