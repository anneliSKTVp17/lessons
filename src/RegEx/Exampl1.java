/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user2
 */
public class Exampl1 {

    public static boolean chekText2(String str) {
        Pattern pattern = Pattern.compile(".+\\.+(com|or|ru|ee)");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
//     System.out.println(chekText("Java"));
        System.out.println(chekText2("www.yandex.ee"));
        String a = "Выхожу адин я на дорогу";
        System.out.print(a.replaceAll("[ao]дин", "вдвоём"));
    }
}
