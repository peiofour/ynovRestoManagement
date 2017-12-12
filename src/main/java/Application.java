import sun.rmi.server.Dispatcher;
import view.DashboardView;

import presenter.DashboardPresenter;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Application {
    public static void main(String[] args) {
        invokeLater(Application::run);
    }

    private static void run() {
        JFrame jFrame = new JFrame();

        Dispatcher dispatcher = new Dispatcher(jFrame);
        dispatcher.registerPresenter(new DashboardPresenter(new DashboardView()));
        jFrame.setVisible(true);
        jFrame.setName(DashboardPresenter.NAME);
        jFrame.setSize(800, 800);
    }
}
