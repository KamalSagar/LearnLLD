package dev.kamal.learnlld.lld2.factory;

import dev.kamal.learnlld.lld2.factory.components.button.Button;
import dev.kamal.learnlld.lld2.factory.components.button.IosButton;
import dev.kamal.learnlld.lld2.factory.components.dropdown.DropDown;
import dev.kamal.learnlld.lld2.factory.components.dropdown.IosDropDown;
import dev.kamal.learnlld.lld2.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
