import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Base64;

public class decode {
	public boolean writeImageToDisk(FileItem item, File imageFile) {
	    // clear error message
	    String errorMessage = null;
	    FileOutputStream out = null;
	    boolean ret = false;
	    try {
	        // write thumbnail to output folder
	        out = createOutputStream(imageFile);

	        // Copy input stream to output stream
	        byte[] headerBytes = new byte[22];
	        InputStream imageStream = item.getInputStream();
	        imageStream.read(headerBytes);

	        String header = new String(headerBytes);
	        // System.out.println(header);

	        byte[] b = new byte[4 * 1024];
	        byte[] decoded;
	        int read = 0;
	        while ((read = imageStream.read(b)) != -1) {
	            // System.out.println();
	            if (Base64.isArrayByteBase64(b)) {
	                decoded = Base64.decodeBase64(b);
	                out.write(decoded);
	            }
	        }

	        ret = true;
	    } catch (IOException e) {
	        StringWriter sw = new StringWriter();
	        e.printStackTrace(new PrintWriter(sw));
	        errorMessage = "error: " + sw;

	    } finally {
	        if (out != null) {
	            try {
	                out.close();
	            } catch (Exception e) {
	                StringWriter sw = new StringWriter();
	                e.printStackTrace(new PrintWriter(sw));
	                System.out.println("Cannot close outputStream after writing file to disk!" + sw.toString());
	            }
	        }

	    }

	    return ret;
	}

	/**
	 * Helper method for the creation of a file output stream.
	 * 
	 * @param imageFolder
	 *            : folder where images are to be saved.
	 * @param id
	 *            : id of spcefic image file.
	 * @return FileOutputStream object prepared to store images.
	 * @throws FileNotFoundException
	 */
	protected FileOutputStream createOutputStream(File imageFile) throws FileNotFoundException {

	    imageFile.getParentFile().mkdirs();

	    return new FileOutputStream(imageFile);
	}
}
