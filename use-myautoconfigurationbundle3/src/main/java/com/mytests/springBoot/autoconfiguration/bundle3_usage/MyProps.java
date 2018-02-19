package com.mytests.springBoot.autoconfiguration.bundle3_usage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Component
@ConfigurationProperties(prefix = "myprops")
public class MyProps {

    private String foo;
    private boolean main1;
    private boolean importedconfig11;
    private boolean importedconfig12;
    private boolean importedcfg12inner;
    private boolean component10;
    private boolean component11;
    private boolean component11inner;
    private boolean configcomponent10;
    private boolean configcomp11;
    private boolean configcomp11inner;
    private boolean deep1;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public boolean isDeep1() {
        return deep1;
    }

    public void setDeep1(boolean deep1) {
        this.deep1 = deep1;
    }

    public boolean isMain1() {
        return main1;
    }

    public void setMain1(boolean main1) {
        this.main1 = main1;
    }

    public boolean isImportedconfig11() {
        return importedconfig11;
    }

    public void setImportedconfig11(boolean importedconfig11) {
        this.importedconfig11 = importedconfig11;
    }

    public boolean isImportedconfig12() {
        return importedconfig12;
    }

    public void setImportedconfig12(boolean importedconfig12) {
        this.importedconfig12 = importedconfig12;
    }

    public boolean isImportedcfg12inner() {
        return importedcfg12inner;
    }

    public void setImportedcfg12inner(boolean importedcfg12inner) {
        this.importedcfg12inner = importedcfg12inner;
    }

    public boolean isComponent10() {
        return component10;
    }

    public void setComponent10(boolean component10) {
        this.component10 = component10;
    }

    public boolean isComponent11() {
        return component11;
    }

    public void setComponent11(boolean component11) {
        this.component11 = component11;
    }

    public boolean isComponent11inner() {
        return component11inner;
    }

    public void setComponent11inner(boolean component11inner) {
        this.component11inner = component11inner;
    }

    public boolean isConfigcomponent10() {
        return configcomponent10;
    }

    public void setConfigcomponent10(boolean configcomponent10) {
        this.configcomponent10 = configcomponent10;
    }

    public boolean isConfigcomp11() {
        return configcomp11;
    }

    public void setConfigcomp11(boolean configcomp11) {
        this.configcomp11 = configcomp11;
    }

    public boolean isConfigcomp11inner() {
        return configcomp11inner;
    }

    public void setConfigcomp11inner(boolean configcomp11inner) {
        this.configcomp11inner = configcomp11inner;
    }
}
