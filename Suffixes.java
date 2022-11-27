//Реализовать программу которая будет выводить размер в байтах в зависимости от суффикса, используя конструкцию switch-case.
//Доступно 3 суффикса: K(килобайты),M(мегабайты),G(гигабайты).
//Например на вход подается строка 1K. После преобразований вывод должен быть "1024 bytes".


import java.util.Scanner;

public class Suffixes {

    public static void main(String[] args) {

while (true) {

        System.out.println("Data input:");

        Scanner read = new Scanner(System.in);
        String suffix = read.nextLine();
        String they;


            switch (suffix) {

                case ("1K"):
                    they = "1024 Bytes";
                    System.out.println(they);
                    break;

                case ("1M"):
                    they = "131072 Bytes";
                    System.out.println(they);
                    break;

                case ("1G"):
                    they = "1073741824 Bytes";
                    System.out.println(they);
                    break;

                default:
                    System.out.println("Please input one of three: 1K, 1M, 1G. Other statements will be considered as incorrect.");
                    break;

            }



    } }

    }
