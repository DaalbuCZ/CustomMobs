package cz.daalbu.custommobs.mobs;

import cz.daalbu.custommobs.items.HeldItem;

public class CustomMob {
    private String entityType;
    private String displayName;
    private int maxHealth;
    private HeldItem heldItem;

    public CustomMob(String entityType, String displayName, int maxHealth, HeldItem heldItem) {
        this.entityType = entityType;
        this.displayName = displayName;
        if (maxHealth < 1) {
            this.maxHealth = 1;
        } else {
            this.maxHealth = maxHealth;
        }
        this.heldItem = heldItem;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public HeldItem getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(HeldItem heldItem) {
        this.heldItem = heldItem;
    }
}
