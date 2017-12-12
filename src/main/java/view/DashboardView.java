package view;

import presenter.DashboardPresenter;

import javax.swing.*;
import java.awt.*;


public class DashboardView implements DashboardPresenter.Displayable {

        private JButton addEmployee;
        private JButton displayEmployees;

        public DashboardView() {
            addEmployee = new JButton("Add employee");
            displayEmployees = new JButton("Display employees");
        }


        public Component getComponent() {
            DefaultButtonModel model = new DefaultButtonModel();
            Box verticalBox = Box.createVerticalBox();
            verticalBox.add(Box.createVerticalGlue());
            verticalBox.add(addEmployee);
            verticalBox.add(Box.createVerticalGlue());
            verticalBox.add(displayEmployees);
            verticalBox.add(Box.createVerticalGlue());
            JPanel panel = new JPanel(new GridBagLayout());
            panel.add(verticalBox);
            return panel;
        }


        public JButton getDisplayEmployeeListButton() {
            return displayEmployees;
        }


        public JButton getAddEmployeeButton() {
            return addEmployee;
        }
}
