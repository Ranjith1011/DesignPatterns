package creational.factory.abstractFactory;

public interface UIFactory {
    public Button createButton();

    public Menu createMenu();

    public Dropdown createDropdown();
}
