package com.emilioaraos;

public class Main {

    public static void main(String[] args) {
//        int result= 1 + 2 ;
//        System.out.println(result);
//        int previousResult= result;
//        System.out.println(previousResult);
//        result = result - 1;
//        System.out.println(result);
//        result= result%3;
//        System.out.println(result);
//        boolean isAlien= false;
//        if(isAlien== false) {
//            System.out.println("It is not an Alien");
//            System.out.println("AND I AM SCARED OF ALIENS!");
//        }
//
//        int topScore= 80;
//        if (topScore>=100){
//            System.out.println("You got the high Score!");
//        }
//
//        int secondTopScore= 81;
//        if ((topScore > secondTopScore)  && (topScore<100)){
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//        if ((topScore >90) || (secondTopScore <=90)){
//            System.out.println("Either or both of the conditions are true");
//        }
//
//        boolean isCar = false;
//        if(isCar == true){
//            System.out.println("This is not suppose to happen");
//        }

        double doubleVariable = 20.00d;
        double secondDoubleVariable= 80.00d;
        double sumDoubleVariables = (doubleVariable + secondDoubleVariable) *100.00d;
        System.out.println("sumDoubleVariebles total = " + sumDoubleVariables);
        double resultRemainderDoubleVariable= sumDoubleVariables% 40.00d;
        System.out.println("The remainder is equal to " + resultRemainderDoubleVariable);
        boolean isRemainderZero = resultRemainderDoubleVariable==0?true :false;
        System.out.println("IsRemainderZero = " + isRemainderZero);
        if(!isRemainderZero)
            System.out.println("Got Some Remainder");




    }

}

