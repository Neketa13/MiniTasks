package Interfaces;

import Interfaces.Actions;
import Interfaces.Options;

public interface Platforms {
    Options createOption();
    Actions createAction();
    SuperActions createSuperAction();
}
