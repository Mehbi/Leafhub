package click.mevi.dev.leafhub;

import click.mevi.dev.leafhub.core.registries.RepositoryRegistry;
import click.mevi.dev.leafhub.core.repositories.LobbyRepository;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class Leafhub extends JavaPlugin {

    @Getter private static Leafhub plugin;

    private RepositoryRegistry repositoryRegistry;
    @Override
    public void onEnable() {
        plugin = this;

         repositoryRegistry = new RepositoryRegistry();

         repositoryRegistry.register("lobby", new LobbyRepository());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
