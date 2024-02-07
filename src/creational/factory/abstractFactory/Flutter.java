package creational.factory.abstractFactory;

public class Flutter {
    //Ideally Flutter has to be interface

    //Usual behaviours
    public void setTheme(){

    }

    //Factory interface
    public UIFactory createUIFactory(SupportedPlatforms supportedPlatforms){
        if(supportedPlatforms.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }
        if(supportedPlatforms.equals(SupportedPlatforms.IOS)){
            return new IosUIFactory();
        }

        return null;
    }
}
