package RunTests;

import Settings.iOS.iOSTestCase;
import Tests.iOS.SearchPageObject;
import Tests.iOS.iOSFirstTest;
import org.junit.jupiter.api.Test;

public class RunIOSTests extends iOSTestCase {

    @Test
    public void start (){
        iOSFirstTest ft = new iOSFirstTest(driver);
        ft
                .clickNextButton()
                .clickButtonGetStarted()
                .assertLogotypeIsVisible();
    }
    @Test
    public void startSearchPageObject(){
        String articleOne = "JavaScript";
        String articleTwo = "Milky Way";
        SearchPageObject sp = new SearchPageObject(driver);
        sp.skipStartScreen()
                .tapOnSearchLine()
                .fillTextInSearchLine(articleOne)
                .chooseResult(articleOne)
                .saveArticle()
                .backInSearch()
                .clearText()
                .fillTextInSearchLine(articleTwo)
                .chooseResult(articleTwo)
                .saveArticle()
                .pressButtonW()
                .goToSavedArticles()
                .closeWindow()
                .longTouchOnArticle(articleOne)
                .deleteThisArticle()
                .testCheckArticle(articleOne,articleTwo);
    }
}
