package creational.factory.abstractFactory;

import creational.factory.abstractFactory.components.buttons.AndroidButton;
import creational.factory.abstractFactory.components.dropdowns.AndroidDropdown;
import creational.factory.abstractFactory.components.menus.AndroidMenu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
