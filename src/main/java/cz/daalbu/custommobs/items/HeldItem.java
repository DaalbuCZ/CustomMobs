package cz.daalbu.custommobs.items;

public class HeldItem {
    private String material;
    private String displayName;
    private float dropChance;

    public HeldItem(String material, String displayName, float dropChance) {
        if (!material.equalsIgnoreCase("AIR")) {
            this.material = material;
            this.displayName = displayName;

            if (dropChance < 0f) {
                this.dropChance = 0f;

            } else if (dropChance > 1f) {
                this.dropChance = 1f;

            } else {
                this.dropChance = dropChance;
            }
        }
    }

    public HeldItem(String material) {
        if (material.equalsIgnoreCase("AIR")) {
            this.material = material;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public float getDropChance() {
        return dropChance;
    }

    public void setDropChance(float dropChance) {
        this.dropChance = dropChance;
    }
}
