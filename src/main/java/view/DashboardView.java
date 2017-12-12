package view;

import javax.swing.*;
import java.awt.*;


public class DashboardView {

        private JButton addEmployee;
        private JButton displayEmployees;

        public DashboardView() {
            addEmployee = new JButton("Add employee");
            displayEmployees = new JButton("Display employees");
        }

        @Override
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

        @Override
        public JButton getDisplayEmployeeListButton() {
            return displayEmployees;
        }

        @Override
        public JButton getAddEmployeeButton() {
            return addEmployee;
        }
}
