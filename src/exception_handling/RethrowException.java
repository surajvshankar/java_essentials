package exception_handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;


public class RethrowException {
  public static void main(String[] args) throws Exception, FileSystemAlreadyExistsException {
    rethrowException();
  }

  public static void rethrowException() throws IOException {
    // Without the throws, you get a compile error at file.createNewFile - since, createNewFile throws an IOException
    // (which need to be handled) you "rethrown" - you could use polymorphism and Replace IOException with Exception
    File file = new File("/root/somefile.txt");
    file.createNewFile();
  }
}
