package com.update.pattern.structural.composite.v1;

import java.util.Iterator;

/**
 * @author : liupu
 * date   : 2019/9/24
 * desc   :
 * github : https://github.com/CodeLiuPu/
 */
public class Column extends PageElement {

    public Column(String name) {
        super(name);
    }

    @Override
    public void addPageElement(PageElement pageElement) {
        pageElements.add(pageElement);
    }

    @Override
    public void removePageElement(PageElement pageElement) {
        pageElements.remove(pageElement);
    }

    @Override
    public void clear() {
        pageElements.clear();
    }

    @Override
    public void print(String string) {
        //利用递归来打印文件夹结构
        System.out.println(string + "└── " + getName());
        Iterator<PageElement> i = pageElements.iterator();
        while (i.hasNext()) {
            PageElement pageElement = i.next();
            pageElement.print(string + "   ");
        }
    }
}
