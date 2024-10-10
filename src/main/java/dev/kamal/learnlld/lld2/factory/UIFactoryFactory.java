package dev.kamal.learnlld.lld2.factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatform platform) {

        if(platform.equals(SupportedPlatform.WINDOWS)){
            return new WindowsUIFactory();
        }
        else if(platform.equals(SupportedPlatform.IOS)){
            return new IosUIFactory();
        }
        else if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }
        else {
            return null;
        }
    }
}
