package com.update.pattern.structural.composite.v1;

/**
 * @author : liupu
 * date   : 2019/9/24
 * desc   :
 * github : https://github.com/CodeLiuPu/
 */
public class Test {
    public static void main(String[] args) {

        PageElement root = new Column("网站页面");

        PageElement music = new Column("音乐");
        PageElement video = new Column("视频");
        PageElement ad = new Column("广告");

        root.addPageElement(music);
        root.addPageElement(video);
        root.addPageElement(ad);


        PageElement chineseMusic = new Column("国语");
        PageElement cantoneseMusic = new Column("粤语");

        music.addPageElement(chineseMusic);
        music.addPageElement(cantoneseMusic);

        video.addPageElement(new Content("天气真好.mp3"));

        root.print("");

    }
}
