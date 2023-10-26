package facade;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec){
        System.out.println("reading");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec){
        System.out.println("writing");
        return buffer;
    }
}
