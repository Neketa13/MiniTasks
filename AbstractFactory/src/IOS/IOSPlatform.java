package IOS;

import IOS.IOSAction;
import IOS.IOSOption;
import Interfaces.Actions;
import Interfaces.Options;
import Interfaces.Platforms;
import Interfaces.SuperActions;

public class IOSPlatform implements Platforms {
    @Override
    public Options createOption() {
        return new IOSOption();
    }

    @Override
    public Actions createAction() {
        return new IOSAction();
    }

    @Override
    public SuperActions createSuperAction() {
        return new IOSSuperAction();
    }
}
