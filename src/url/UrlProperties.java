package url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlProperties {
    private URL url;
    private String source;

    public UrlProperties(String source) throws MalformedURLException {
        this.source = source;
        url = new URL(source);
    }

    public void showMethods() {
        System.out.println("Given source at the beginning: " + source);
        printCommand("url.getAuthority()", url.getAuthority());
        printCommand("url.getFile()", url.getFile());
        printCommand("url.getHost()", url.getHost());
        printCommand("url.getPath()", url.getPath());
        printCommand("url.getProtocol()", url.getProtocol());
        printCommand("url.getQuery()", url.getQuery());
        printCommand("url.getRef()", url.getRef());
        printCommand("url.getUserInfo()", url.getUserInfo());
        printCommand("url.toExternalForm()", url.toExternalForm());
        printCommand("url.getDefaultPort()", String.valueOf(url.getDefaultPort()));
        printCommand("url.getPort()", String.valueOf(url.getPort()));
    }

    private void printCommand(String method, String result) {
        System.out.println(method + ": " + result);
    }


}
