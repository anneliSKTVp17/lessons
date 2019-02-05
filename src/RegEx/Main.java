/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.io.*;

/**
 *
 * @author user2
 */
public class Main {
public static void main(String[] args) throws IOException {
//    //System.out.println(MyRegEx.checkPass("LOpata"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    System.out.println("Enter new IP");
//    String str = br.readLine();
//    boolean result = MyRegEx.checkIp(str);
//    while (!result) {
//        System.out.println("Ip is NOT checked");
//        str = br.readLine();
//        result=MyRegEx.checkIp(str);
//    }
//    System.out.println("IP checked!");
String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce dapibus tellus nec nulla gravida, sed congue nunc hendrerit. Integer interdum elementum lorem id rutrum. Ut sit amet interdum mauris. Phasellus mollis ex eleifend lacus molestie dictum. Fusce blandit, ligula non condimentum maximus, massa nisi ullamcorper odio, et vehicula nisl nunc nec orci. Sed neque diam, gravida eu blandit ullamcorper, porttitor non lorem. Etiam sagittis diam a dolor feugiat placerat. Suspendisse enim turpis, imperdiet in tellus sit amet, consectetur porta magna. Suspendisse odio nulla, imperdiet eget augue in, pulvinar hendrerit nunc. Aenean ut cursus tellus, nec vehicula ante. Vestibulum ornare erat non ante tempus, eu aliquet felis dapibus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris eget arcu imperdiet, laoreet erat non, imperdiet leo. Sed arcu mi, ornare non leo sed, faucibus semper nunc.";
String[] lines=MyRegEx.splitText(str);
    for (String line : lines) {
        System.out.println(line);
    }
}
}
