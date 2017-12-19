package test;

import org.flywaydb.core.Flyway;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:mysql://10.31.0.188:3306/store_management", "root", "Tal33z");

        // Start the migration
        flyway.migrate();

        Jdbi jdbi = Jdbi.create("jdbc:mysql://10.31.0.188:3306/store_management", "root", "Tal33z");
        List<String> names = jdbi.withHandle(handle ->
                handle.createQuery("select user from users")
                        .mapTo(String.class)
                        .list());

        System.out.println(names);

    }
}