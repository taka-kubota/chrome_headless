//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package holdings.ozaki.matsudak;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class ChromeHeadlessApplication {
    public ChromeHeadlessApplication() {
    }

    public static void main(String... args) {
        Selenide.open("https://trade.bitpoint.co.jp/bpj-web/login");
        Selenide.$(By.id("userid")).setValue("id");
        Selenide.$(By.id("passwd")).setValue("pass");
        Selenide.$(By.id("login_btn")).click();
        System.out.println(Selenide.$(By.xpath("//*[@id='assets_table']/tbody/tr[1]/td[3]/span[2]")).getText());
        Selenide.screenshot("bitpoint.co.jp");
    }

    static {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.reportsFolder = "build/reports";
        Configuration.browserSize = "1024x768";
    }
}
