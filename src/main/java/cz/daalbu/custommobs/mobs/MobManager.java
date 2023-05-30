package cz.daalbu.custommobs.mobs;

import cz.daalbu.custommobs.CustomMobs;
import cz.daalbu.custommobs.mobs.controller.MobController;
import cz.daalbu.custommobs.mobs.listener.SpawnListener;

import java.util.HashMap;

public class MobManager {
    private CustomMobs plugin;
    private MobController mobController;
    private HashMap<String, Integer> userHashMap;

    public MobManager() {
        this.plugin = CustomMobs.getInstance();
        this.loadData();
        this.mobController = new MobController();
        this.plugin.getServer().getPluginManager().registerEvents(new SpawnListener(), this.plugin);
    }

    public void loadData() {
        this.userHashMap = new HashMap<>();
    }
}
