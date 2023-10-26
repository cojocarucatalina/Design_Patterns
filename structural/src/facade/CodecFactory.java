package facade;

public class CodecFactory {
    public static Codec extract(VideoFile file){
        String type = file.getCodecType();
        if (type.equals("mp4")){
            System.out.println("extracting");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("extracting");
            return new OggCompressionCodec();
        }
    }
}
