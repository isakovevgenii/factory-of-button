package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
