public class Aircraft {

    private String type;
    private int maxAmmo;
    private int baseDamage;
    private int damage;
    private int ammo = 0;
    private int stock = 500;

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        //this.ammo = 0;
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public int Fight() {
        this.ammo = 0;
        this.damage = this.baseDamage * this.ammo;
        return damage;
    }

    public int reFill(int stock) {
        if (this.ammo < this.maxAmmo) {
            this.ammo += (this.maxAmmo - this.ammo);
            stock -= (this.maxAmmo - this.ammo);
        }
        return stock;
    }

    public String getStatus() {
        String getStatus = "Type: " + this.type + ", Ammo: " + this.ammo + ", Base damage: " + this.baseDamage
                + ", All damage: " + (this.ammo * this.baseDamage);
        return getStatus;
    }

    public boolean isPriority() {
        if (this.type.equals("F35")) {
            return true;
        } else {
            return false;
        }
    }

}
