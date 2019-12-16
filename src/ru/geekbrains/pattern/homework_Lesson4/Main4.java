package ru.geekbrains.pattern.homework_Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//родственные саязи кошек
public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfName = reader.readLine();
        Cat catGrandf = new Cat(grandfName);

        String grannyName = reader.readLine();
        Cat catGranny = new Cat(grannyName);

        String fatherName  =reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandf);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGranny);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandf);
        System.out.println(catGranny);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }


}
