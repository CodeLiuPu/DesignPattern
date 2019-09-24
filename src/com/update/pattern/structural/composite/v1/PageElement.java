package com.update.pattern.structural.composite.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : liupu
 * date   : 2019/9/24
 * desc   :
 * github : https://github.com/CodeLiuPu/
 */
public abstract class PageElement {

    List<PageElement> pageElements = new ArrayList<>();
    private String name;

    public PageElement(String name){
        this.name = name;
    }

    public abstract void addPageElement(PageElement pageElement);

    public abstract void removePageElement(PageElement pageElement);

    public abstract void clear();

    public abstract void print(String string);

    public String getName() {
        return name;
    }
}
