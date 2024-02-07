package creational.factory.abstractFactory;

import creational.factory.abstractFactory.components.buttons.AndroidButton;
import creational.factory.abstractFactory.components.buttons.IosButton;
import creational.factory.abstractFactory.components.dropdowns.AndroidDropdown;
import creational.factory.abstractFactory.components.dropdowns.IosDropdown;
import creational.factory.abstractFactory.components.menus.AndroidMenu;
import creational.factory.abstractFactory.components.menus.IosMenu;

public class IosUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
