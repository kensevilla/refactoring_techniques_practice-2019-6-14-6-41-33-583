package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_IE_on_Mac_when_platform_is_mac_and_browser_is_IE () {
        BannerRender bannerRender = new BannerRender();
        String renderedBanner = bannerRender.renderBanner( "MAC", "IE");

        Assert.assertEquals(renderedBanner , "IE on Mac?");
    }

    @Test
    public void should_return_banner_when_platform_not_mac_and_browser_not_IE () {
        BannerRender bannerRender = new BannerRender();
        String renderedBanner = bannerRender.renderBanner( "", "");

        Assert.assertEquals(renderedBanner , "banner");
    }

}