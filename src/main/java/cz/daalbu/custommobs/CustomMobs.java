package cz.daalbu.custommobs;

import cz.daalbu.custommobs.mobs.MobManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomMobs extends JavaPlugin {
    private static CustomMobs instance;
    private MobManager MobManager;

    public static CustomMobs getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        this.MobManager = new MobManager();

    }

    public MobManager getMobManager() {
        return MobManager;
    }
}
