package dev.kamal.learnlld.lld2.factory;

import dev.kamal.learnlld.lld2.factory.components.button.Button;
import dev.kamal.learnlld.lld2.factory.components.dropdown.DropDown;

public class Client {

    public static void main(String[] args) {
        demoFactory();
    }

    private static void demoFactory() {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatform.ANDROID);
        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();
    }
}
