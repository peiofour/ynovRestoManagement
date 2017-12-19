package view;


import presenter.MenuPresenter;

import javax.swing.*;
import java.awt.*;


public class MenuView implements MenuPresenter.Displayable {

    private JButton listusers;
    private JButton listproducts;
    private JButton liststores;
    private JButton modifyprofil;
    private JButton addUser;
    private JButton deconnexion;

    public MenuView() {
        listusers = new JButton("Lister utilisateur");
        listproducts = new JButton("Lister produits");
        liststores = new JButton("Lister restaurants");
        modifyprofil = new JButton("Modifier Profil");
        addUser = new JButton("Créer un utilisateur");
        deconnexion = new JButton("Déconnexion");
    }

    @Override
    public Component getComponent() {
        DefaultButtonModel model = new DefaultButtonModel();
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(listusers);
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(listproducts);
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(liststores);
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(modifyprofil);
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(addUser);
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(deconnexion);
        verticalBox.add(Box.createVerticalGlue());
        JPanel panel = new JPanel(new GridBagLayout());
        panel.add(verticalBox);
        return panel;
    }

    @Override
    public JButton getListUsersButton() { return listusers;}

    @Override
    public JButton getListProductsButton() {
       return listproducts;
    }

    @Override
    public JButton getListStoresButton() { return liststores;}

    @Override
    public JButton getModifyProfilButton() { return modifyprofil;}

    @Override
    public JButton getAddUser(){ return addUser; }

    @Override
    public JButton getBackButton() { return listusers;}

    @Override
    public JButton getDeconnexion(){return deconnexion;}


}
