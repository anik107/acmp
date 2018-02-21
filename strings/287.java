/*
http://acmp.ru/index.asp?main=task&id_task=287
В одном очень известном университете один очень известный профессор очень быстро произносил свои лекции, так, что ничего невозможно было разобрать. Но недавно студент Вилли решил провести исследование по изучению словарного запаса профессора. С этой целью он даже посетил одну лекцию и записал всё сказанное на ней на диктофон. Затем, прокручивая дома запись с десятикратным замедлением, Вилли смог записать всё, что сказал профессор.

Но вот незадача – профессор говорил так быстро, что, даже прослушивая замедленную запись, нельзя было точно сказать, где он делал паузы между словами. Таким образом, у Вилли есть некоторый текст, состоящий из n маленьких английских букв – лекция, которая была прочитана профессором. Теперь Вилли хочет знать, какое количество различных слов длины m мог использовать в своей лекции профессор.

Входные данные
Первая строка входного файла INPUT.TXT содержит два числа n и m (1 ≤ m ≤ n ≤ 100) – длина лекции и длина слова. Вторая строка содержит n английских символов - текст лекции профессора.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно число – количество слов длины m, которые профессор мог использовать в своей лекции.
*/
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }
    Scanner in;
    PrintWriter out;
 
    public void run() throws IOException{
        in = new Scanner(new File("input.txt"));
        out = new PrintWriter(new File("output.txt"));
 
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
 
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        for(int i=0; i<=n-m; i++){
            String word = s.substring(i, i+m);
            words.put(word, 1);
        }
        out.print(words.size());
 
        out.close();
    }
}