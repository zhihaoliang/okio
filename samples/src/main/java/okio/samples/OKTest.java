package okio.samples;

import okio.Okio;

import java.io.File;

/**
 * @author zhihaoliang
 * @date 2019/9/32:29 PM
 * @version：1.0.0
 */
public class OKTest {
    public static void writeTest(File file) {
        try {
            Okio.buffer(Okio.sink(file))
                    .writeUtf8("write string by utf-8.\n")
                    .writeUtf8("你好").close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void main(String[] args) {
        File file  = new File("/Volumes/sdcard/github/okio-okio-parent-1.17.4/123.txt");
        writeTest(file);
    }
}
