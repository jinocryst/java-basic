package net.jinocryst.personal.crawling;

import net.jinocryst.personal.telegram.TelegramBot;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawling {
    public static void main(String[] args) {
        final String searchKeyword = "인천";
        final String crawlingEnterUrl = "https://m.search.naver.com/search.naver?where=m_news&query="+ searchKeyword +"&sm=mtb_opt&sort=1&photo=0&field=0&pd=0&ds=&de=&docid=&related=0&mynews=0&office_type=0&office_section_code=0&news_office_checked=&nso=so:dd,p:all&is_sug_officeid=0&office_category=0&service_area=0";
        Connection conn = Jsoup.connect(crawlingEnterUrl);

        try {
            Document document = conn.get();
            Elements listNews = document.getElementsByClass("list_news");
            Elements liElements = listNews.select("li");
            System.out.println("liElements.size() => " + liElements.size());

            for (Element liElement : liElements) {
                try {
                    System.out.println("liElements.get(i) => " + liElement);
                    Element titleElement = liElement.selectFirst(".api_txt_lines.tit");
                    assert titleElement != null;
                    String title = titleElement.text();
                    System.out.println("title => " + title);

                    Element hrefElement = liElement.selectFirst(".news_wrap .news_info .api_save_group a");
                    System.out.println("hrefElement => " + hrefElement);
                    assert hrefElement != null;
                    String url = hrefElement.attr("data-url");
                    System.out.println("url => " + url);

                    TelegramBot.sendMsgByKeyword(title + " : " + url);

                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
