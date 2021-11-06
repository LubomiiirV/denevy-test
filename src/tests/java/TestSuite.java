import MainTests.Container;
import MainTests.PositionRefBottom;
import MainTests.PositionRefTop;
import footerTests.Footer;
import navbarsTests.Login;
import navbarsTests.Navbar;
import navbarsTests.TopBar;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TopBar.class,
        Login.class,
        Navbar.class,
        Container.class,
        PositionRefTop.class,
        PositionRefBottom.class,
        Footer.class,

})

public class TestSuite {
}
