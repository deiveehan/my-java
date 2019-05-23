package lamda;

import java.io.File;
import java.io.FileFilter;

public class LamdaFirst {

    public static void main(String[] args) {
/*        FileFilter filter = new FileFilter() {

            public boolean accept(File pathName)  {
                return pathName.getName().endsWith(".txt");

            }
        };*/

        FileFilter filterLamda = (File pathName) -> pathName.getName().endsWith(".png");


        File dir = new File("/Users/deiveehannallazhagappan/workspace/xplore-java/supporting");
        File[] files = dir.listFiles(filterLamda);

        for (File f: files) {
            System.out.println("f = " + f);
        }


    }
}
