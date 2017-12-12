import SQLService.ConnectSQL;
import presenter.DashboardPresenter;
import view.DashboardView;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Application {
    public static void main(String[] args) {
        ConnectSQL new_test = new ConnectSQL();
        invokeLater(Application::run);
    }

    private static void run() {
        JFrame jFrame = new JFrame();

        service.Dispatcher dispatcher = new service.Dispatcher(jFrame);
        dispatcher.registerPresenter(new DashboardPresenter(new DashboardView()));
        jFrame.setVisible(true);
        jFrame.setName(DashboardPresenter.NAME);
        jFrame.setSize(800, 800);
    }
}
