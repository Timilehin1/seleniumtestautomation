package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTest{
    @Test
    public void testSelectOption(){
        var dropDownPage= homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectDropDown(option);
        var selectedOptions = dropDownPage.getSelectedElement();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selection");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
