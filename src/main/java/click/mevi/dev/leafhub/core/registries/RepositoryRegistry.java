package click.mevi.dev.leafhub.core.registries;

import click.mevi.dev.leafhub.core.interfaces.CrudRepository;

import java.util.HashMap;

public class RepositoryRegistry {
    private final HashMap<String, CrudRepository<?, ?>> repositories = new HashMap<>();

    public void register(String key, CrudRepository<?, ?> crudRepository) {
        repositories.put(key, crudRepository);
    }
    public <T extends CrudRepository<?,?>> T getByKey(String key) {
        return (T) repositories.get(key);
    }
}
