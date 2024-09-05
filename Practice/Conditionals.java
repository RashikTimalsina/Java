class Conditionals {
    
public static void main(String[] args){

int age=19;
if(age<18 || age>60 ){

    System.out.println("You are  not eiigible to vote");

}


else if(age<=0 || age>=100){

    System.out.println("Invalid age");

}
else{

    System.out.println("you are eligible to vote");
}
}
}