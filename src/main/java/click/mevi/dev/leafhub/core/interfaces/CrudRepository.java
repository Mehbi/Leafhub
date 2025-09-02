package click.mevi.dev.leafhub.core.interfaces;

import java.util.Optional;

public interface CrudRepository<ID, O> {
    void save(O object);
    void update(O object);
    boolean delete(int id);
    Optional<O> findById(ID id);
}
