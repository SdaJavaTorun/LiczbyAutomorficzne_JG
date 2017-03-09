package com.sdajava.LiczbyAutomorficzne;

import java.util.Scanner;

    public class LiczbyAutomorficzne {

        public int n;
        public int k;

        public LiczbyAutomorficzne(){
            Scanner sc = new Scanner(System.in);
            System.out.println("podaj liczbę n = ");
            this.n = sc.nextInt();
            sc.close();
        }

        public int obliczK(){
            int k = 0; int z = 1;
            while (this.n / z > 1){
                z = z * 10;
                k++;
            }
            return this.k = k;
        }

        public void wzor(){
            double wzor; int b = this.n;
            wzor = (b * b) % Math.pow(10, this.k);

            if (wzor == this.n){
                System.out.println("liczba Automorficzna");
            } else {
                System.out.println("liczba nie Automorficzna");
            }
        }

        public static void main(String[] args) {
            LiczbyAutomorficzne  morf = new LiczbyAutomorficzne ();
            morf.obliczK();
            morf.wzor();

        }
    }