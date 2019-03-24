package Filter;

import java.util.regex.Pattern;

public class Filter2 implements Filter{

    @Override
    public boolean hasanyMGC(String username) {
        Pattern p =Pattern.compile("敏感");
        return p.matcher(username).find();
    }
}
