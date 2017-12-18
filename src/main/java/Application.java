import ListGestion.Stores;
import presenter.DashboardPresenter;
import presenter.StoreFormPresenter;
import presenter.StoreListPresenter;
import view.DashboardView;
import view.StoreFormView;
import view.StoreListView;

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
        dispatcher.registerPresenter(new StoreFormPresenter(new StoreFormView(), stores));
        jFrame.setVisible(true);
        jFrame.setName(DashboardPresenter.NAME);
        jFrame.setSize(800, 800);
    }
}