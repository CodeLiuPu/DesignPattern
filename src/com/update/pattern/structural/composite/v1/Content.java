package com.update.pattern.structural.composite.v1;

/**
 * @author : liupu
 * date   : 2019/9/24
 * desc   : 叶子节点
 * github : https://github.com/CodeLiuPu/
 */
public class Content extends PageElement {
    public Content(String name) {
        super(name);
    }

    @Override
    public void addPageElement(PageElement pageElement) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    @Override
    public void removePageElement(PageElement pageElement) {
        throw new UnsupportedOperationException("不支持此操作");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("不支持此操作");
    }

    @Override
    public void print(String string) {
        System.out.println(string + "── " + getName());
    }
}
