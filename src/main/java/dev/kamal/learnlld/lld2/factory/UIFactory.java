package dev.kamal.learnlld.lld2.factory;

import dev.kamal.learnlld.lld2.factory.components.button.Button;
import dev.kamal.learnlld.lld2.factory.components.dropdown.DropDown;
import dev.kamal.learnlld.lld2.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
