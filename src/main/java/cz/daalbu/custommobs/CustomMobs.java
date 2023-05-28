package cz.daalbu.custommobs;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomMobs extends JavaPlugin {
    private static CustomMobs instance;

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

    }
}
