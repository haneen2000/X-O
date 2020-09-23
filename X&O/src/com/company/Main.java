package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String[][] table = new String[3][3];

        // print the table

        for( int i =0; i<table.length; i++){
            for(int j=0; j<table.length;j++) {
                table[i][j]=i+","+j;
                System.out.print("|"+table[i][j]+"|");
            }
            System.out.println(" ");
        }

        //while loop until someone win

        int player =1;
        int tryno=9;
        int row;
        int col;
        while (tryno>0){
            tryno--;
            // all win condition
            if(table[0][0]==table[1][0]&table[1][0]==table[2][0]){break;}
            else if(table[0][1]==table[1][1]&table[1][1]==table[2][1]){break;}
            else if(table[0][2]==table[1][2]&table[1][2]==table[2][2]){break;}
            else if(table[0][0]==table[0][1]&table[0][1]==table[0][2]){break;}
            else if(table[1][0]==table[1][1]&table[1][1]==table[1][2]){break;}
            else if(table[2][0]==table[2][1]&table[2][1]==table[2][2]){break;}
            else if(table[0][0]==table[1][1]&table[1][1]==table[2][2]){break;}
            else if(table[0][2]==table[1][1]&table[1][1]==table[2][0]){break;}
            // take address of input
            else{
                if(player%2!=0){
                    player++;
                    System.out.println("x player enter row value");
                    row=input.nextInt();
                    System.out.println("x player enter col value");
                    col=input.nextInt();
                    if (table[row][col]==" x "||table[row][col]==" o "){
                        player--;
                        System.out.println("you can not use this");
                    }
                   else{
                   table[row][col]=" x ";
                    for( int i =0; i<table.length; i++){
                        for(int j=0; j<table.length;j++) {
                            System.out.print("|"+table[i][j]+"|");
                        }
                        System.out.println(" ");
                    }
                }}
                else{
                    player++;
                    System.out.println("o player enter row value");
                    row=input.nextInt();
                    System.out.println("o player enter col value");
                    col=input.nextInt();
                    if (table[row][col]==" x "||table[row][col]==" o "){
                        player--;
                        System.out.println("you can not use this");
                    }
                    else{
                    table[row][col]=" o ";
                    for( int i =0; i<table.length; i++){
                        for(int j=0; j<table.length;j++) {
                            System.out.print("|"+table[i][j]+"|");
                        }
                        System.out.println(" ");
                    }
                }}

            }

        }

        if(tryno>0){System.out.println("we have a winner");}
        else  System.out.println("no one win i gusse");
    }
}
