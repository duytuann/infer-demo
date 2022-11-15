import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Resources {
    public static void cat() throws IOException {
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        try {
            infile = new FileInputStream(new File("infile.txt"));
            outfile = new FileOutputStream(new File("outfile.txt"));
            outfile.write(infile.read());
        } finally {
            if (infile != null) infile.close();
            if (outfile != null) outfile.close();
        }
    }
}

// Truoc khi close outfile chung ta co gang close infile, nhung trong java dieu nay co the tao ra 1 ngoai le -> ko the close outfile -> Resource leakng java dieu nay co the tao ra 1 ngoai le -> ko the close outfile -> Resource leak.ng java dieu nay co the tao ra 1 ngoai le -> ko the close outfile -> Resource leak.chung ta co gang close infile, nhung trong java dieu nay co the tao ra 1 ngoai le -> ko the close outfile -> Resource leak.