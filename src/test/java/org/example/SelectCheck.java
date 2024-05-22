package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SelectCheck {

    public boolean checkSelect(String optionText, WebElement selectOptions) {
        Select select = new Select(selectOptions);
        List<WebElement> options = select.getOptions();
        for(WebElement option : options) {
            if(option.getText().equals(optionText)) {
                return true;
            }
        }
        return false;
    }
}