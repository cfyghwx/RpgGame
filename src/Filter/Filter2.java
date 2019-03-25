package Filter;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Filter2 implements Filter{

    @Override
    public boolean hasanyMGC(String username) {
        Pattern p =Pattern.compile("¶Ä²©");
        return p.matcher(username).find();
    }


}
