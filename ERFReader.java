
import java.io.*;

public class ERFReader {
    public String getContents(String path){
        File file= new File(path);    /* Creating the File Object */
        if (file.exists()) {                          /* if statement to test if file requested is in location given */
            String line="";
            StringBuilder builder = new StringBuilder(); /* creats stringbuilder object */
            int counter=0;
            BufferedReader in = null;
            try {                                          /* try function to test data given */
                in=new BufferedReader(new FileReader(file));
                try {
                    while ((line=in.readLine())!=null) {     /* loop that continues reading lines of the file until */
                        if (counter !=0) {                 /*    there are none left */
                            builder.append("/r" + line);
                        }
                        else {
                            builder.append(line);
                            counter++;
                        }
                    }
                }
                catch(IOException e){               /* IO exception incase of an Error while reading the file */
                    return null;}
                finally {in.close();}               /*closing stream when reading is over */
                if (counter == 0){return null;}
                else {return builder.toString();}
            }
            catch (FileNotFoundException e){return null;} /* Exception incase File could not be found on the disc*/
            catch (IOException e) {return null;} /* exception incase Couldnt not open or close file. */

        }
        else {return null;}
    }
}
