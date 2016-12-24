package agh.cs.lab9.json;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Created by mieszkomakuch on 21.12.2016.
 */
public class FileUpdater {
    private final String url;
    private final String fileName;
    private final String filePath;

    public FileUpdater(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
        this.filePath = "";
    }

    public FileUpdater(String url, String fileName, String filePath) {
        this.url = url;
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public void update() throws IOException {
        URL website = new URL(url);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream(this.filePath + fileName);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
}
