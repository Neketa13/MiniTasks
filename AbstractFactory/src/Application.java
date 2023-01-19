import Interfaces.Actions;
import Interfaces.Options;
import Interfaces.Platforms;
import Interfaces.SuperActions;

public class Application {
    private final Actions action;
    private final Options option;
    private final SuperActions superAction;


    public Application(Platforms factory) {
        action = factory.createAction();
        option = factory.createOption();
        superAction=factory.createSuperAction();
    }

    public void paint() {
        action.action();
        option.option();
        superAction.superAction();
    }
}