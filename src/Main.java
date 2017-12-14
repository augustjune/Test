import url.UrlProperties;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            UrlProperties urlProperties = new UrlProperties("http://dome.netact.nsn-rdnet.net/mpp/projects/cm/www/coverage/data/daily/xml/2017-08-26.com.nsn.cm.vs.radio.xml");
            urlProperties.showMethods();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException occurred");
        }


    }

}

