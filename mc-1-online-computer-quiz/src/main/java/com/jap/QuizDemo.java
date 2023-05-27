package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        double topScore=0;
        String schoolName = nameOfSchool[0];
        try{
            for(int i=0;i<nameOfSchool.length;i++){
                int score = Integer.parseInt(scores[i]);
                if(score>topScore){
                    topScore=score;
                    schoolName=nameOfSchool[i];
                }
            }
        }catch (NumberFormatException exception){
            System.out.println("Number Format Error");;
        }

        return schoolName;

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[name.length];
        try{
            for(int i=0;i< name.length;i++){
                upperCase[i]=name[i].toUpperCase();
            }
        }catch (NullPointerException exception){
            return new String[]{exception.toString()};
        }

        return upperCase;
    }

    public static void main(String[] args) {
        QuizDemo quizDemo=new QuizDemo();
        String nameOfSchool[]={"DAV","RSK","Treamis","Candor","Oak","UAV","BCBS","Baldwin","NPS"};
        String scores[]={"86","78","95","6","44","33","82","77","8","90"};
        System.out.println("School with Highest Score :"+quizDemo.highestScore(nameOfSchool,scores));
        String schoolUpperCase[]=quizDemo.convertAllNamesToCapital(nameOfSchool);
        for(int i=0;i<schoolUpperCase.length;i++){
            System.out.println(schoolUpperCase[i]);
        }
    }
}





