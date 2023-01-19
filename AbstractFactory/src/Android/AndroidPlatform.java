package Android;

import Android.AndroidAction;
import Android.AndroidOption;
import Interfaces.Actions;
import Interfaces.Options;
import Interfaces.Platforms;
import Interfaces.SuperActions;

public class AndroidPlatform implements Platforms {
    @Override
    public Options createOption() {
        return new AndroidOption();
    }

    @Override
    public Actions createAction() {
        return new AndroidAction();
    }

    @Override
    public SuperActions createSuperAction() {
        return new AndroidSuperAction();
    }
}
