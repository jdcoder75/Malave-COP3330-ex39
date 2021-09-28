package ex39;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 39 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> firstName = new HashMap<Integer, String>();
        HashMap<Integer, String> lastName= new HashMap<Integer, String>();
        HashMap<Integer, String> position = new HashMap<Integer, String>();
        HashMap<Integer, String> separation = new HashMap<Integer, String>();

        String[] fName = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
        String[] LName = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String[] post = {"Manager", "Software Engineer", "District Manager", "Programmer", "Jackson", "Web Developer"};
        String[] sep = {" 2016-12-31", " 2016-12-31", "2015-12-19", " ", " ", "2015-12-18"};

        String temp;
        for (int i = 0; i < LName.length; i++) {
            for (int j = i + 1; j < LName.length; j++) {

                if (LName[i].compareTo(LName[j]) > 0) {
                    // swapping
                    temp = fName[i];
                    fName[i] = fName[j];
                    fName[j] = temp;


                    temp = LName[i];
                    LName[i] = LName[j];
                    LName[j] = temp;


                    temp = post[i];
                    post[i] = post[j];
                    post[j] = temp;


                    temp = sep[i];
                    sep[i] = sep[j];
                    sep[j] = temp;
                }
            }

            }
        for(int i = 0; i < fName.length; i++)
        {
            firstName.put(i, fName[i]);
            lastName.put(i, LName[i]);
            position.put(i, post[i]);
            separation.put(i, sep[i]);
        }


        System.out.println( "Name                | Position          | Separation Date" );
        for(int i = 0; i < fName.length; i++)
        {
            System.out.println(firstName.get(i) + lastName.get(i)  + "|" +  position.get(i)  + "|"  + separation.get(i) + "|");
        }
    }
}
