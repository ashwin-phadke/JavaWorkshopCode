public class Unit {
    private int hitPoints;
    private int attack;
    private boolean dead;

    Unit() {
        this.hitPoints = 30;
        this.attack = 5;
        this.dead = false;
    }
    Unit(int hitPoints, int attack) {
        // implementation
    }
    
    public void doAttack(Unit unit) throws Throwable {
        // implementation
    }

    public void setHitPoints(int damage) {
        // implementation

    }
    public void setIfDead(boolean dead) {
        // implementation
    }

    public int getHitPoints() {
        return this.hitPoints;
    }
    public int getAttack() {
        return this.attack;
    }
    public boolean isDead() {
        return this.dead;
    }
}
