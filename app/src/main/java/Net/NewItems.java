package Net;

/**
 * Created by Administrator on 2016/11/21.
 */

public class NewItems {
    /*
    *  "ctime": "2016-11-18 00:00",
      "title": "今年的购物狂欢季，iPhone 7 能卖多少部？",
      "description": "爱思助手",
      "picUrl": "http://d.image.i4.cn/i4web/image/news/2016-11-18/1479447714738.jpg",
      "url": "http://www.i4.cn/news_detail_11527.html"
    * */
    private String ctime;
    private String title;
    private String description;
    private String picUrl;
    private String url;

    public NewItems(String ctime, String title, String description, String picUrl, String url) {
        this.ctime = ctime;
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.url = url;
    }
}
