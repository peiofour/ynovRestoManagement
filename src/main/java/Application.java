import listgestion.Stores;
import org.flywaydb.core.Flyway;
import presenter.*;
import utils.ConnectionHandler;
import utils.FileManager;
import utils.RequestHandler;
import view.*;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Application {
    public static void main(String[] args) {
        invokeLater(Application::run);
    }

    private static void run() {
        JFrame jFrame = new JFrame();

        Stores stores = new Stores();

        service.Dispatcher dispatcher = new service.Dispatcher(jFrame);
        dispatcher.registerPresenter(new DashboardPresenter(new DashboardView()));
        dispatcher.registerPresenter(new StoreListPresenter(new StoreListView(), stores));
        dispatcher.registerPresenter(new StoreFormPresenter(new StoreFormView()));
        dispatcher.registerPresenter(new UserFormPresenter(new UserFormView()));
        dispatcher.registerPresenter(new MenuPresenter(new MenuView()));
        dispatcher.registerPresenter(new UserListPresenter(new UserListView()));
        dispatcher.registerPresenter(new ProductListPresenter(new ProductListView()));
        dispatcher.registerPresenter(new ProductFormPresenter(new ProductFormView()));
        dispatcher.registerPresenter(new ModifyProfilPresenter(new ModifyProfilView()));
        dispatcher.registerPresenter(new ChangeIpPresenter(new ChangeIPView()));

        jFrame.setVisible(true);
        jFrame.setName(DashboardPresenter.NAME);
        jFrame.setSize(800, 800);

        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://10.31.0.188:3306/store_management", "root", "Tal33z");
        flyway.migrate();
        if (FileManager.checkIfFileExists("ip.ser")){
            ConnectionHandler.setInstance((ConnectionHandler) FileManager.deserializeObject("ip.ser"));
        }


    }
}