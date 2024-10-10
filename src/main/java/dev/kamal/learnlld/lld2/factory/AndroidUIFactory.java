package dev.kamal.learnlld.lld2.factory;

import dev.kamal.learnlld.lld2.factory.components.button.AndroidButton;
import dev.kamal.learnlld.lld2.factory.components.button.Button;
import dev.kamal.learnlld.lld2.factory.components.dropdown.AndroidDropDown;
import dev.kamal.learnlld.lld2.factory.components.dropdown.DropDown;
import dev.kamal.learnlld.lld2.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
