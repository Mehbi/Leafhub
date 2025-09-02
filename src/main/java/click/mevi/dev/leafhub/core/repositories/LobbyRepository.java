package click.mevi.dev.leafhub.core.repositories;

import click.mevi.dev.leafhub.core.database.SQLite;
import click.mevi.dev.leafhub.core.interfaces.CrudRepository;
import click.mevi.dev.leafhub.core.objects.Lobby;

import java.sql.*;
import java.util.Optional;

public class LobbyRepository implements CrudRepository<Integer, Lobby> {

    public LobbyRepository() {
        String sql = "CREATE TABLE IF NOT EXISTS lobby(" +
                "   id INTEGER PRIMARY KEY," +
                "   spawnX DOUBLE," +
                "   spawnY DOUBLE," +
                "   spawnZ DOUBLE" +
                ");";

        try (Connection connection = SQLite.connection()) {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Lobby lobby) {
        String sql = "INSERT INTO lobby(spawnX, spawnY, spawnZ) VALUES (?,?,?)";

        try (Connection connection = SQLite.connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, lobby.getSpawnX());
            preparedStatement.setDouble(2, lobby.getSpawnY());
            preparedStatement.setDouble(3, lobby.getSpawnZ());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Lobby lobby) {
        String sql = "UPDATE lobby SET spawnX = ?, spawnY = ?, spawnZ = ?";

        try (Connection connection = SQLite.connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, lobby.getSpawnX());
            preparedStatement.setDouble(2, lobby.getSpawnY());
            preparedStatement.setDouble(3, lobby.getSpawnZ());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Optional<Lobby> findById(Integer integer) {
        return Optional.empty();
    }
}
