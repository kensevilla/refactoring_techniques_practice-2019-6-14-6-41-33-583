package com.tws.refactoring.extract_variable;

public class BannerRender {
    private String MAC = "MAC";
    private String IE = "IE";

    String renderBanner(String platform, String browser) {
        return containsMac(platform) && containsIE(browser) ? "IE on Mac?" : "banner";
    }

    private boolean containsMac(String platform){
        return platform.toUpperCase().contains(MAC);
    }

    private boolean containsIE(String browser){
        return browser.toUpperCase().contains(IE);
    }
}
