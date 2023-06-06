package cz.daalbu.custommobs;

import cz.daalbu.custommobs.mobs.MobManager;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class CustomMobs extends JavaPlugin {
    private static CustomMobs instance;
    private MobManager MobManager;

    public static CustomMobs getInstance() {
        return instance;
    }

    private File configFile;
    private FileConfiguration config;

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public void onEnable() {
        instance = this;
        this.createConfig();
        this.MobManager = new MobManager();

    }

    public MobManager getMobManager() {
        return MobManager;
    }

    public FileConfiguration getConfig() {
        return this.config;
    }

    private void createConfig() {
        configFile = new File(getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
            saveResource("config.yml", false);
        }

        config = new YamlConfiguration();
        try {
            config.load(configFile);
        } catch (IOException | InvalidConfigurationException e) {
            System.out.println("Couldn't load config file");
        }
    }
}
