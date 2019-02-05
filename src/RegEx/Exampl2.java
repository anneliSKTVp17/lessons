/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.PATTERN;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user2
 */

public class Exampl2 {
    private Pattern pattern1;
    private Matcher matcher;
    
        private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15})"; 
    
    public Exampl2() {
        String PASSWORD_PATTERN = null;
        pattern1 =  Pattern.compile(PASSWORD_PATTERN); 
    }
    boolean checkPassword(String pass) {
        matcher = pattern1.matcher(pass);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Exampl2 d = new Exampl2();
        System.out.println(d.checkPassword("fdhgfjk3"));
}
}
