package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_render_banner () {

        BannerRender bannerRender = new BannerRender();
        String renderedBanner = bannerRender.renderBanner( "MAC", "IE");

        Assert.assertEquals(renderedBanner , "IE on Mac?");

    }

    @Test
    public void should_return_banner_render_banner () {

        BannerRender bannerRender = new BannerRender();
        String renderedBanner = bannerRender.renderBanner( "", "");

        Assert.assertEquals(renderedBanner , "banner");

    }

}