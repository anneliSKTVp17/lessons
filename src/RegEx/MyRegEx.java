/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.util.regex.*;

/**
 *
 * @author user2
 */
public class MyRegEx {
private static Matcher matcher;
private static final String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
  "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
private static final String TEXT_PATTERN = "\\.";//"[А-ЯA-Z].{15,}?(\\.|\\!|\\?)(?=\\ |\\r|\\n|$)";

  
private static Pattern patternIp = Pattern.compile(IP_PATTERN);

public static boolean checkIp(String str) {
    matcher = patternIp.matcher(str);
    return matcher.matches();
}
public static String[] splitText(String str) {
    
    return str.split(TEXT_PATTERN);
    
}

      
    }

 
    

