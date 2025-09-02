package click.mevi.dev.leafhub.core.database;

import click.mevi.dev.leafhub.Leafhub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLite {
    public static Connection connection() throws SQLException {
        String url = "jdbc:sqlite:" + Leafhub.getPlugin().getDataFolder() + "/database.db";

        return DriverManager.getConnection(url);
    }
}
